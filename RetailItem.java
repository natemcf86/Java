
public class RetailItem {
	private String description;		//holds the description of the retail item
	private int unitsOnHand;		//holds the amount held
	private double price;			//holds the price of the item
	
	/**
	 * no arg constructor
	 */
	public RetailItem() {
		this.description = "";
		this.unitsOnHand = 0;
		this.price = 0;
	}
	
	/**
	 * constructor calls fields
	 * @param description
	 * @param unitsOnHand
	 * @param price
	 * @throws NegativeUnits
	 * @throws NegativePrice
	 */
	public RetailItem(String description, int unitsOnHand, double price)
	throws NegativeUnits, NegativePrice{
		super();
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
		if (price < 0) {
			throw new NegativePrice();
		}
		if (unitsOnHand < 0) {
			throw new NegativeUnits();
		}
	}
	/**
	 * getters and setters for description, units on hand, and price
	 * @return
	 */

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public void setUnitsOnHand(int UOH) {
		this.unitsOnHand = UOH;	
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pri) {

		this.price = pri;
	}
	

}
