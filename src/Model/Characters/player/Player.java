package Model.Characters.player;

import Model.Characters.AllCharacters;
import Model.Characters.player.Bag.Bag;

/**
 * Player Class
 * 
 * @author joey
 * 
 */
public class Player extends AllCharacters {
	// Player's name
	String name;
	// Player's Bag
	Bag bag;
	// Player's Money
	int money;
	// player's Experience
	int exp;
	// player's next Experience
	int nextExp;

	/**
	 * Will create the new player
	 */
	public Player(String n) {
		super();
		name = n;
		bag = new Bag();

	}

	/**
	 * getter for the Player's Bag
	 * 
	 * @return the Player's Bag
	 */
	public Bag getBag() {
		return bag;
	}

	/**
	 * Getter for the Player's Name
	 * 
	 * @return Player's Name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getName() + "\n" + getHands();
	}

	/**
	 * Add money to the player
	 * 
	 * @param m
	 *            money to add/decrease
	 */
	public void addMoney(int m) {
		money += m;
	}

	/**
	 * Add Experience to the Player and automatically check if upgrade needed
	 * 
	 * @param e
	 *            experience given to the player
	 */
	public void addEXP(int e) {
		exp += e;
		while (nextLevel() <= 0){
			addLevel();
			setNextExp();
		}
	}

	/**
	 * Tells how many experience is needed for next level
	 * 
	 * @return experience before next level
	 */
	public int nextLevel() {
		return nextExp - exp;
	}

	/**
	 * Add a level to the player
	 */
	public void addLevel() {
		level++;
	}

	public void setNextExp(){
		//TODO : next level algorithm in function of the current level
	}

}
