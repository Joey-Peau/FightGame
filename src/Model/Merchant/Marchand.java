package Model.Merchant;

import Model.Characters.player.Player;
import Model.Characters.player.Bag.Bag;
import Model.Characters.player.Bag.BagException;
import Model.item.Item;

/**
 * Merchant class
 * 
 * @author joey
 * 
 */
public class Marchand {

	Bag merchantBag = new Bag();

	public Marchand(int l) {
		merchantBag.increaseBagSize();
	}

	/**
	 * Article to buy at the merchant
	 * 
	 * @param art
	 *            article to buy
	 * @return price wanted by the merchant
	 */
	public int buyFromPrice(Item a) {
		return a.getPrice();
	}

	/**
	 * Item to sell to the Merchant
	 * 
	 * @param a
	 *            Item to sell
	 * @return price for the Item
	 */
	public int sellToPrice(Item a) {
		return a.getPrice();
	}

	/**
	 * 
	 * add to the merchant's bag the a Item
	 * @param a - Item
	 */
	public void sold(Item a){
		try {
			merchantBag.addBag(a);
		} catch (BagException e) {e.printStackTrace();}
	}

	/**
	 * 
	 * bought an item from the Merchant, delete it from his bag and add it to player's bag
	 * @param p Player who bought the Item
	 * @param a Item bought
	 */
	public void bought(Player p, Item a){

	}

}
