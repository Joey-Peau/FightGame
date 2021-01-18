package tools.FightListener;

import tools.CustomEvent;
import tools.CustomListener;

public class FightListenerPlayer2 extends CustomListener {

	public FightListenerPlayer2() {
		super("FLP2");
	}

	@Override
	public void listen(CustomEvent e, Object... args) {
		if (e == CustomEvent.CRITICAL_HIT_PLAYER_TWO) {
			System.out.println("player 2 - Critical Hit");
		}

		if(e == CustomEvent.ATTACKED_PLAYER_TWO){
			System.out.println("player 2 - HIT for " + args[0] + " lp");
		}
	}
}
