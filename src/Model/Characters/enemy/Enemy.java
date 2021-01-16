package Model.Characters.enemy;

import Model.Characters.Character;
import Model.Characters.Lootable;

public abstract class Enemy extends Character implements Lootable {

	public Enemy(int level){
		super(level);
	}

	@Override
	public int calculatedMaxLifePoints() {
		return 100;
	}

}
