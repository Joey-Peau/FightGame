package Model.Characters.enemy;

import Model.Characters.AllCharacters;

public abstract class Enemy extends AllCharacters {

	public Enemy(int level) {

	}

	/**
	 * Getter for the experience offered to the player if defeated
	 * 
	 * @return experience for Player
	 */
	public abstract int expLoot();

	/**
	 * Money given by the enemy
	 * 
	 * @return enemy money
	 */
	public abstract int moneyLoot();

	/**
	 * Set the different characteristics different for each enemies
	 * 
	 * @param level
	 *            enemy level
	 */
	public abstract void setStat(int level);
}
