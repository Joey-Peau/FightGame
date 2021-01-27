package tools.FightListener;

import tools.CustomEvent;
import tools.CustomListener;

public class FightListenerPlayer1 extends CustomListener {

    public FightListenerPlayer1() {
        super("FLP1");
    }

    @Override
    public void listen(CustomEvent e, Object... args) {
        if (e == CustomEvent.CRITICAL_HIT_PLAYER_ONE) {
            System.out.println("player 1 - Critical Hit");
        }

        if (e == CustomEvent.ATTACKED_PLAYER_ONE) {
            System.out.println("player 1 - HIT for " + args[0] + " lp");
        }

        if (e == CustomEvent.DEAD_PLAYER_ONE) {
            System.out.println("player 1 - DEAD");
        }
    }
}
