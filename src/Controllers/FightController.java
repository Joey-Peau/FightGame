package Controllers;

import Model.Characters.Fightable;

public class FightController {

	Fightable player1, player2;

	public FightController(Fightable player1, Fightable player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void fight(boolean player1First) {
		int lpToRemove = 0;
		Fightable firstPlayer, secondPlayer;
		if (player1First) {
			firstPlayer = this.player1;
			secondPlayer = this.player2;
		} else {
			firstPlayer = this.player2;
			secondPlayer = this.player1;
		}

		lpToRemove = firstPlayer.getAttackPoints();
		if (firstPlayer.isCriticalHit()) {
			System.out.println("CRITICAL HIT to player 2");
			lpToRemove *= 2;
		}
		int real_removed;
		real_removed = secondPlayer.removeLife(lpToRemove);
		System.out.println("Player 2 -" + real_removed);

		if (!secondPlayer.isAlive()) {
			System.out.println("Player 2 is DEAD");
			return;
		}

		lpToRemove = secondPlayer.getAttackPoints();
		if (secondPlayer.isCriticalHit()) {
			System.out.println("CRITICAL HIT to player 1");
			lpToRemove *= 2;
		}
		real_removed = firstPlayer.removeLife(lpToRemove);
		System.out.println("Player 1 -" + real_removed);

	}
}
