package Model.Characters;

/**
 * Super class for all characters
 *
 * @author joey
 */
public abstract class Character implements Fightable, Statable {

	protected int level = 1;
	protected int agility, strength, luck;
	private int lifePoints, maxLifePoints;

	/**
	 * Set a new Character (enemy or player)
	 *
	 * @param l level of character
	 */
	public Character(int l) {
		this.level = l;
		this.initLifePoints();
		this.initStats();
	}

	@Override
	public Fightable initLifePoints() {
		this.maxLifePoints = this.calculatedMaxLifePoints();
		this.lifePoints = this.getMaxLifePoints();

		return this;
	}

	@Override
	public Statable initStats() {
		return this;
	}

	@Override
	public int getMaxLifePoints() {
		return this.maxLifePoints;
	}

	@Override
	public int removeLife(int lp_to_remove) {
		if (lp_to_remove < 0) {
			throw new IllegalArgumentException();
		}

		int nb_to_remove, real_remove;

		nb_to_remove = this.realRemoval(lp_to_remove);

		if (this.lifePoints - nb_to_remove < 0) {
			real_remove = this.lifePoints;
		} else {
			real_remove = nb_to_remove;
		}

		this.lifePoints -= real_remove;

		return real_remove;
	}

	@Override
	public int add_life(int lp_to_add) {
		if (lp_to_add < 0) {
			throw new IllegalArgumentException();
		}

		int realAdd;

		if (this.lifePoints + lp_to_add > this.maxLifePoints) {
			realAdd = this.maxLifePoints - this.lifePoints;
		} else {
			realAdd = lp_to_add;
		}

		this.lifePoints += realAdd;

		return realAdd;
	}

	@Override
	public boolean isAlive() {
		return this.lifePoints > 0;
	}

	@Override
	public int getLifePoints() {
		return this.lifePoints;
	}

	@Override
	public boolean isCriticalHit() {
		return Math.random() * 1000 <= this.getLuck();
	}

	@Override
	public int getAttackPoints() {
		return (int) (Math.ceil((2 + this.getStrength()) * Math.sqrt((1 + this.getAgility()) * Math.random() * 100)) * this.level);
	}

	@Override
	public int getDefensePoints() {
		return 0;
	}

	@Override
	public int realRemoval(int base_lp_to_remove) {
		// https://gamedev.stackexchange.com/a/14314

		//the higher the level, the higher the chance do get quarter damage :
		// L = 1 : 0.0025 <= R <= 1
		// L = 100 : 0.25 <= R <= 1
		int min_random_multiplier = (1 / (400 / this.level));

		// the more agility, the higher the chance do get half damage :
		// A = 0 : 0.0005 <= R <= 1
		// A = 10 : 0.5 <= R <= 1
		min_random_multiplier += (1 / (1000 / Math.pow(2, this.getAgility() - 1)));

		int nb_to_remove = Math.max(0, base_lp_to_remove);
		int damage_reduction = (int) (nb_to_remove * ((Math.random() * (1 - min_random_multiplier)) + min_random_multiplier));

		nb_to_remove -= damage_reduction;

		return Math.max(0, nb_to_remove);
	}

	@Override
	public int getStrength() {
		return this.strength;
	}

	@Override
	public Statable setStrength(int value) {
		this.strength = value;
		return this;
	}

	@Override
	public int getLuck() {
		return this.luck;
	}

	@Override
	public Statable setLuck(int value) {
		this.luck = value;
		return this;
	}

	@Override
	public int getAgility() {
		return this.agility;
	}

	@Override
	public Statable setAgility(int value) {
		this.agility = value;
		return this;
	}

	public String toString() {
		return "Level : " + this.level + "\n"
				+ "LP : " + this.getLifePoints() + "/" + this.getMaxLifePoints() + "\n"
				+ "Strength : " + this.getStrength() + "\n"
				+ "Agility : " + this.getAgility() + "\n"
				+ "Luck : " + this.getLuck() + "\n"

				;
	}
}
