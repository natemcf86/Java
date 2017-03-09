
public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem() {
		
	}

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
