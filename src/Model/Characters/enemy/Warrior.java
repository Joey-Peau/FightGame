package Model.Characters.enemy;

import Model.Characters.Statable;

import java.util.Random;

/**
 * Warrior enemy Class
 *
 * @author joey
 */
public class Warrior extends Enemy {

	public Warrior(int level){
		super(level);
	}

	@Override
	public Statable initStats() {
		Random r = new Random();

		this.setStrength(r.nextInt(10 - 5) + 5);
		this.setAgility(r.nextInt(7 - 3) + 3);
		this.setLuck((r.nextInt(1000 - 1) + 1) / 100);

		return this;
	}

	@Override
	public int expLootable() {
		return 0;
	}
}
