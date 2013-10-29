import Model.Characters.player.Player;
import Model.Characters.player.Bag.BagException;
import Model.Merchant.Marchand;
import Model.item.Item;
import Model.item.Equipment.weapons.OneHand.BaseOneHand;
import Model.item.Equipment.weapons.Shield.BaseShield;
import Model.item.Equipment.weapons.TwoHand.BaseTwoHand;

public class Principale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Marchand m = new Marchand();

		Player p = new Player("Merlin");

		System.out.println(p);

		System.out.println();

		System.out.println(p.getBag());

	}

}
