package Model.item.Equipment;

import Model.item.Item;

/**
 * Equipment Class
 * 
 * @author joey
 * 
 */
public abstract class Equipment extends Item {

	public Equipment(){

	}

	private boolean carried;

	public boolean isCarried() {
		return carried;
	}

	public void setCarried(boolean a) {
		carried = a;
	}

}
