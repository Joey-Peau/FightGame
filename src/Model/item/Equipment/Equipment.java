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

	/**
	 * get the carried field of boolean type
	 * @return the carried - boolean
	 */
	public boolean isCarried() {
		// carried getter
		return carried;
	}

	/**
	 * Setter for carried field with carried parameters
	 * @param carried the carried to set
	 */
	public void setCarried(boolean carried) {
		// this.carried setter with carried parameter
		this.carried = carried;
	}

}
