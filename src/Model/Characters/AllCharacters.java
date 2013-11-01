package Model.Characters;

import Model.Characters.player.Hands.Hands;
import Model.item.Equipment.protection.armor.Armor;
import Model.item.Equipment.protection.armor.FirstArmor;
import Model.item.Equipment.protection.head.FirstHead;
import Model.item.Equipment.protection.head.Head;
import Model.item.Equipment.protection.legs.FirstLegs;
import Model.item.Equipment.protection.legs.Legs;

/**
 * Super class for all characters
 * 
 * @author joey
 * 
 */
public abstract class AllCharacters {

	protected int level;
	protected int lifePoint;

	// Characters statistics
	protected int strenght, defence, health;
	protected int intelligence, charisme, knowledge;

	// Characters Equipment
	Hands hands;
	Head head;
	Armor armor;
	Legs legs;

	public AllCharacters() {

		hands = new Hands();

		head = new FirstHead();
		armor = new FirstArmor();
		legs = new FirstLegs();
	}

	/**
	 * Set a new Character (enemy or player)
	 * 
	 * @param l
	 *            level of character
	 */
	public AllCharacters(int l) {
		if(l<0){
			new CharactersException("Negative");
			level =1;
		}else
		level = l;

	}

	// ****************************
	// ******* MODIFIERS **********
	// ****************************

	/**
	 * Add or remove Life Points
	 * 
	 * @param lp
	 *            life points to add or remove
	 */
	public void addLP(int lp) {
		lifePoint += lp;
	}

	// ****************************
	// ******** GETTERS ***********
	// ****************************

	/**
	 * methods to find out if the character is dead
	 * 
	 * @return is the character dead
	 */
	public boolean isDead() {
		return lifePoint <= 0;
	}

	/**
	 * level getter
	 * 
	 * @return level of characters
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Characters' life Points getter
	 * 
	 * @return the lifePoint of the Character
	 */
	public int getLifePoint() {
		return lifePoint;
	}

	/**
	 * Hands getter
	 * 
	 * @return the hands of the character
	 */
	public Hands getHands() {
		return hands;
	}

	/**
	 * Armor Protection getter
	 * 
	 * @return the head protection
	 */
	public Head getHead() {
		return head;
	}

	/**
	 * Armor Protection getter
	 * 
	 * @return the armor protection
	 */
	public Armor getArmor() {
		return armor;
	}

	/**
	 * Legs Protection getter
	 * 
	 * @return the legs protection
	 */
	public Legs getLegs() {
		return legs;
	}

	// ****************************
	// ******* ABSTRACT ***********
	// ****************************

	/**
	 * Print method for character
	 */
	public abstract String toString();
}
