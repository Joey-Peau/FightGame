package Model.Characters.player.Hands;

public class ImpossibleChangementException extends Exception {

	public ImpossibleChangementException(String n) {
		if (n.compareTo("Shield") == 0)
			System.out.println("Cette main ne peut porter de bouclier.");

		if (n.compareTo("Wrong Object") == 0)
			System.out.println("Veuillez placer un objet de type Arme.");

		if (n.compareTo("Two Hand Left") == 0)
			System.out
					.println("Cette main est occupé par l'arme à deux mains de gauche.");

		if (n.compareTo("Already") == 0)
			System.out.println("Retirez avant l'objet de la main droite.");

		if (n.compareTo("Two Hand Right") == 0)
			System.out
					.println("Cette main ne peut porter d'arme à deux mains.");
	}

}
