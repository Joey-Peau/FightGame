package Model.Worlds;

import Model.Characters.enemy.Warrior;

public class hellWorld extends Worlds {

	public hellWorld(int linf, int bsup) {
		super(linf,bsup);
		for(int i=0;i<1000;i++){
			enemies.add(new Warrior(r.nextInt(bsup-linf+1)+linf));
		}
		
		
		current = this;
	}

}
