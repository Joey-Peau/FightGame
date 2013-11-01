package Model.Characters.enemy;

import java.util.HashMap;
import java.util.Random;

import Model.Characters.AllCharacters;
import Model.Characters.CharactersException;
import Model.item.Item;

public abstract class Enemy extends AllCharacters {

	/**
	 * Random value for Life points
	 */
	Random r = new Random();

	public Enemy(int level) {
		super(level);
		if(level == 0){
			new CharactersException("Enemy 0");
			this.level = 1;
		}
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

	/**
	 * probability for each Items to be loots
	 * @return Items' loot probability
	 */
	public abstract HashMap<Item,Double> itemLoot();
	/* Principle :
	 * TODO : list all the Item loot by this enemy
	 *HashMap<Item,Double> hmi = new HashMap<Item, Double>();
	 *for each Item loot by the enemy :
	 * hmi.put((the Item to add), (the Item created).getLoot());
	 * return hmi;
	 */
}
