package Model.item.Equipment.weapons;

import Model.item.Item;
import Model.item.Equipment.Equipment;

/**
 * SuperClass for all Weapons objects
 * 
 * @author joey
 * 
 */
public abstract class Weapons extends Equipment {

	/**
	 * give the base attack of the weapon
	 * 
	 * @return base attack int
	 */
	public abstract int baseAttack();

}