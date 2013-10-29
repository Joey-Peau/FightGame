package Model.Characters.player.Hands;

import Model.item.Equipment.weapons.Weapons;
import Model.item.Equipment.weapons.OneHand.Fist;
import Model.item.Equipment.weapons.Shield.Shield;
import Model.item.Equipment.weapons.TwoHand.TwoHand;

/**
 * Left hand Equipment (no shield and no potions or protection. Only weapons and
 * only one)
 * 
 * @author joey
 * 
 */
public class LeftHand {

	// current weapon
	Weapons w;

	// right Hand linked
	RightHand rh;

	/**
	 * Create an emplty hand
	 */
	public LeftHand() {
		w = new Fist();
		w.setCarried(true);
	}

	/**
	 * Current weapon getter
	 * 
	 * @return the current weapon
	 */
	public Weapons getCurrentWeapons() {
		return w;
	}

	/**
	 * Change the current weapon by a new one (not weapon exception caught)
	 * 
	 * @param w
	 *            the new weapon
	 * @return the old weapon
	 * @throws ImpossibleChangementException
	 *             the changing Can't be completed
	 */
	public Object changeWeapon(Object w) {
		Object ret = w;
		if (w instanceof Weapons) {
			if (rh.getCurrentWeapons() instanceof Fist) {
				if (w instanceof Shield) {
					new ImpossibleChangementException("Shield");
				} else {
					ret = this.w;
					this.w.setCarried(false);
					this.w = (Weapons) w;
					((Weapons) w).setCarried(true);
				}
			} else {
				new ImpossibleChangementException("Already");
			}
		} else {
			new ImpossibleChangementException("Wrong Object");
		}

		return ret;
	}

	/**
	 * Does this hand have a Two Hand weapon ?
	 * 
	 * @return two hand or not
	 */
	public boolean haveTwoHand() {
		return (w instanceof TwoHand);
	}

	/**
	 * print the left Hand
	 */
	public String toString() {
		return "left : " + w;
	}

	/**
	 * Update the Right Hand
	 * 
	 * @param rh
	 *            Right Hand to update
	 */
	public void setNewLeftHand(RightHand rh) {
		this.rh = rh;

	}

}
