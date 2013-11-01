package Model.item.Equipment.weapons;

import Model.item.Equipment.Equipment;

/**
 * SuperClass for all Weapons objects
 * 
 * @author joey
 * 
 */
public abstract class Weapons extends Equipment {

	public Weapons() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * give the base attack of the weapon
	 * 
	 * @return base attack int
	 */
	public abstract int baseAttack();

}
