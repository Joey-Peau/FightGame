package Model.Merchant;

import java.util.ArrayList;

import Model.item.Item;
import Model.item.Equipment.protection.Protection;
import Model.item.Equipment.protection.armor.FirstArmor;
import Model.item.Equipment.protection.head.FirstHead;
import Model.item.Equipment.protection.legs.FirstLegs;
import Model.item.Equipment.weapons.Weapons;
import Model.item.Equipment.weapons.OneHand.BaseOneHand;
import Model.item.Equipment.weapons.Shield.BaseShield;
import Model.item.Equipment.weapons.TwoHand.BaseTwoHand;
import Model.item.potions.Potions;

/**
 * Merchant class
 * 
 * @author joey
 * 
 */
public class Marchand {

	ArrayList<Weapons> listWeap = new ArrayList<Weapons>();

	ArrayList<Protection> listProtec = new ArrayList<Protection>();

	ArrayList<Potions> listPotions = new ArrayList<Potions>();

	/**
	 * Constructor for the merchant
	 */
	public Marchand() {

		listWeap.add(new BaseOneHand());
		listWeap.add(new BaseShield());
		listWeap.add(new BaseTwoHand());

		listProtec.add(new FirstArmor());
		listProtec.add(new FirstHead());
		listProtec.add(new FirstLegs());

		listPotions.add(new Potions());

	}

	public Marchand(int l) {

	}

	/**
	 * Article to buy at the merchant
	 * 
	 * @param art
	 *            article to buy
	 * @return price wanted by the merchant
	 */
	public int buyFrom(Item a) {
		return a.getPrice();
	}

	/**
	 * Item to sell to the Merchant
	 * 
	 * @param a
	 *            Item to sell
	 * @return price for the Item
	 */
	public int sellTo(Item a) {
		return a.getPrice();
	}

}
