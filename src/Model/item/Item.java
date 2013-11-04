package Model.item;

/**
 * 
 * Item abstract class
 * 
 * @author joey
 *
 */
public abstract class Item {

	public Item(){}

	/**
	 * Getter for the probability the Merchant sells That Item in function of
	 * Level
	 * 
	 * @param level
	 *            Player Level
	 * @return selling probability
	 */
	public abstract double getMerchantProbability(int level);

	/**
	 * getter for loot probability
	 * 
	 * @return loot Probability
	 */
	public abstract double getLoot();

	/**
	 * Getter for the Item price
	 * 
	 * @return item Price
	 */
	public abstract int getPrice();

	/**
	 * Item's name getter
	 * 
	 * @return the Item's Name
	 * 
	 * TODO : set the Name
	 */
	@Override
	public abstract String toString();



}
