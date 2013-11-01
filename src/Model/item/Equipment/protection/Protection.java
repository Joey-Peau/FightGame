package Model.item.Equipment.protection;

import Model.item.Equipment.Equipment;

/**
 * SuperClass for all Shield objects
 * 
 * @author joey
 * 
 */
public abstract class Protection extends Equipment {

	public Protection() {
		// TODO Auto-generated constructor stub
	}

	public abstract int getMagicReduction();

	public abstract int getWeaponReduction();

}
