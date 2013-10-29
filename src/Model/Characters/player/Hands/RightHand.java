package Model.Characters.player.Hands;

import Model.item.Equipment.weapons.Weapons;
import Model.item.Equipment.weapons.OneHand.Fist;
import Model.item.Equipment.weapons.Shield.Shield;
import Model.item.Equipment.weapons.TwoHand.TwoHand;

/**
 * Right Hand Equipment
 * 
 * @author joey
 * 
 */
public class RightHand {

	// current weapon
	Weapons w;

	// left Hand
	LeftHand lh;

	/**
	 * Create an emplty hand
	 */
	public RightHand() {
		w = new Fist();
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
	 * Set the changed Left Hand
	 * 
	 * @param lh
	 *            changed Left Hand
	 */
	public void setNewLeftHand(LeftHand lh) {
		this.lh = lh;
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
		if (w instanceof TwoHand) {
			new ImpossibleChangementException("Two Hand Right");
		} else {
			if (!lh.haveTwoHand()) {
				if (w instanceof Weapons) {
					ret = this.w;
					this.w.setCarried(false);
					this.w = (Weapons) w;
					((Weapons) w).setCarried(true);
				} else {
					new ImpossibleChangementException("Wrong Object");
				}
			} else {
				new ImpossibleChangementException("Two Hand Left");
			}
		}

		return ret;
	}

	public boolean canAttack() {
		return !(w instanceof Shield || lh.haveTwoHand());
	}

	/**
	 * print the Right Hand
	 */
	public String toString() {
		return "Right : " + w;
	}
}
