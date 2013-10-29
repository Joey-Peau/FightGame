package Model.Characters.player.Bag;

/**
 * Exception in case of user wanted to add a object in the full Bag
 * 
 * @author joey
 * 
 */
public class BagException extends Exception {

	public BagException(String n) {
		if (n.compareTo("Full") == 0)
			System.out.println("Le sac est deja plein");
		if (n.compareTo("Carried") == 0)
			System.out.println("Cette objet ne peux etre retirer du sac.");
	}
}
