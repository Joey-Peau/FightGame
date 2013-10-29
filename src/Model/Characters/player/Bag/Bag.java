package Model.Characters.player.Bag;

import java.util.ArrayList;

import Model.item.Equipment.Equipment;
import Model.item.Equipment.protection.Protection;
import Model.item.Equipment.weapons.Weapons;
import Model.item.potions.Potions;

/**
 * Bag's Class
 * 
 * @author joey
 * 
 */
public class Bag {

	// size of the bag
	private int bagSize;

	// free area left in the bag
	private int freeArea;

	// potions objects
	private ArrayList<Potions> h;

	// Weapons Objects
	private ArrayList<Weapons> w;

	// protection objects
	private ArrayList<Protection> s;

	/**
	 * Initialize the bag by 20 for the size and empty of every objects
	 */
	public Bag() {
		bagSize = 20;
		freeArea = 20;
		h = new ArrayList<Potions>();
		w = new ArrayList<Weapons>();
		s = new ArrayList<Protection>();
	}

	/**
	 * Bag size getter
	 * 
	 * @return size of the bag
	 */
	public int getBagSize() {
		return bagSize;
	}

	/**
	 * Add an object to the Bag
	 * 
	 * @param a
	 *            object to add (Healing,Weapon,Shield)
	 * @throws BagException
	 *             throws when the user add an object to the full bag
	 */
	public void addBag(Object a) throws BagException {
		if (freeArea > 0) {
			if (a instanceof Potions)
				h.add((Potions) a);
			if (a instanceof Weapons)
				w.add((Weapons) a);
			if (a instanceof Protection)
				s.add((Protection) a);

			freeArea--;
		} else {
			new BagException("Full");
		}
	}

	/**
	 * Remove the object from the bag
	 * 
	 * @param a
	 *            object to remove
	 */
	public void removeBag(Object a) {
		if (a instanceof Equipment) {
			if (((Equipment) a).isCarried()) {
				new BagException("Carried");
			} else {
				if (a instanceof Weapons)
					w.remove(a);
				if (a instanceof Protection)
					s.remove(a);
			}
		} else if (a instanceof Potions)
			h.remove(a);

		freeArea++;
	}

	/**
	 * Increase the Bag's Size
	 */
	public void increaseBagSize() {
		bagSize += 5;
		freeArea += 5;
	}

	/**
	 * Print all inventory
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		int i = 0;
		sb.append("\n\nPotions : \n");
		for (Potions p : h)
			sb.append((i++) + " : " + p + "\n");
		i = 0;
		sb.append("\n\nWeapons : \n");
		for (Weapons p : w)
			sb.append((i++) + " : " + p + "\n");
		i = 0;
		sb.append("\n\nProtections : \n");
		for (Protection p : s)
			sb.append((i++) + " : " + p + "\n");

		return new String(sb);
	}

}
