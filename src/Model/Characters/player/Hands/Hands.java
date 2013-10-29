package Model.Characters.player.Hands;

public class Hands {

	private LeftHand lf;

	private RightHand rh;

	public Hands() {

		lf = new LeftHand();
		rh = new RightHand();

	}

	/**
	 * Getter for the Left Hand
	 * 
	 * @return current leftHand
	 */
	public LeftHand getleftHand() {
		lf.setNewLeftHand(rh);
		return lf;
	}

	/**
	 * Getter for the Right Hand
	 * 
	 * @return Right Hand
	 */
	public RightHand getRightHand() {
		rh.setNewLeftHand(lf);
		return rh;
	}

	public String toString() {
		return getleftHand() + "\n" + getRightHand();
	}

}
