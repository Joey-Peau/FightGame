package Controllers;

import Model.Characters.Fightable;
import tools.CustomEvent;
import tools.CustomListener;
import tools.EventBus;
import tools.FightListener.FightListenerPlayer1;
import tools.FightListener.FightListenerPlayer2;

public class FightController {

    Fightable player1, player2;

    CustomListener listenerPlayer1, listenerPlayer2;

    public FightController(Fightable player1, Fightable player2) {
        this.player1 = player1;
        this.player2 = player2;

        this.listenerPlayer1 = new FightListenerPlayer1();
        this.listenerPlayer2 = new FightListenerPlayer2();
    }

    public void fight(boolean player1First) {
        EventBus.register(this.listenerPlayer1);
        EventBus.register(this.listenerPlayer2);


        Fightable firstPlayer, secondPlayer;
        if (player1First) {
            firstPlayer = this.player1;
            secondPlayer = this.player2;
        } else {
            firstPlayer = this.player2;
            secondPlayer = this.player1;
        }

        boolean isCriticalHit = firstPlayer.isCriticalHit();
        int real_removed = firstPlayer.attack(secondPlayer, isCriticalHit);

        if (isCriticalHit) {
            EventBus.send(CustomEvent.CRITICAL_HIT_PLAYER_ONE);
        }

        EventBus.send(CustomEvent.ATTACKED_PLAYER_TWO, real_removed);

        if (!secondPlayer.isAlive()) {
            EventBus.send(CustomEvent.DEAD_PLAYER_TWO);
            return;
        }

        isCriticalHit = secondPlayer.isCriticalHit();
        real_removed = secondPlayer.attack(firstPlayer, isCriticalHit);
        if (isCriticalHit) {
            EventBus.send(CustomEvent.CRITICAL_HIT_PLAYER_TWO);
        }

        EventBus.send(CustomEvent.ATTACKED_PLAYER_ONE, real_removed);

        if (!firstPlayer.isAlive()) {
            EventBus.send(CustomEvent.DEAD_PLAYER_ONE);
            return;
        }

        EventBus.unregister(this.listenerPlayer1);
        EventBus.unregister(this.listenerPlayer2);

    }
}
