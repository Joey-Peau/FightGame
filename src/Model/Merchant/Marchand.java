package Model.Merchant;

import Model.item.Item;

/**
 * Merchant class
 * 
 * @author joey
 * 
 */
public class Marchand {

	public Marchand(int l) {



	}

	/**
	 * Article to buy at the merchant
	 * 
	 * @param art
	 *            article to buy
	 * @return price wanted by the merchant
	 */
	public int buyFrom(Item a) {
		return a.getPrice();
	}

	/**
	 * Item to sell to the Merchant
	 * 
	 * @param a
	 *            Item to sell
	 * @return price for the Item
	 */
	public int sellTo(Item a) {
		return a.getPrice();
	}

}
