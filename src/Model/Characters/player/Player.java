package Model.Characters.player;

import Model.Characters.Character;
import Model.Characters.Levelable;
import Model.Characters.Statable;

/**
 * Player Class
 *
 * @author joey
 */
public class Player extends Character implements Levelable {

	public Player(String name, int level){
		super(level);
	}

	@Override
	public int calculatedMaxLifePoints() {
		return 1000;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public int levelUp() {
		return 0;
	}

	@Override
	public Levelable addExp(int exp) {
		return null;
	}

	@Override
	public int getExp() {
		return 0;
	}

	@Override
	public int getExpForNextLevel() {
		return 0;
	}

	@Override
	public Statable initStats() {
		super.initStats();

		this.setStrength(5);
		this.setAgility(5);
		this.setLuck(5);

		return this;
	}
}
