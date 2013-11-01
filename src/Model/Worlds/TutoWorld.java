package Model.Worlds;

import Model.Characters.enemy.Enemy;
import Model.Characters.enemy.Warrior;

public class TutoWorld extends Worlds {

	public TutoWorld(int linf, int bsup) {
		super(linf, bsup);
		
		for(int i=0;i<10;i++){
			enemies.add(new Warrior(r.nextInt(bsup-linf+1)+linf));
		}
		
		
		current = this;
	}
	
	//la joie de vivre
}
