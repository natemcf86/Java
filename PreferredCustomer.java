import java.text.DecimalFormat;

/**
 * preferred customer is a class that will give a customer a discount based on purchased items
 * @author Nathaniel
 *
 */
public class PreferredCustomer extends customer{
private double customerPurchase;		//holds amount customer has purchased;
private double discount;				//holds % preferred customer will save
/**
 * no arg constructor
 */
	public PreferredCustomer() {
		discount = 0;
		customerPurchase = 0;
	}
	/**
	 * returns customer's purchased amount
	 * @return
	 */
	public double getCustomerPurchase() {
		return customerPurchase;
	}
	/**
	 * sets customer's purchased amount
	 * @param customerPurchase
	 */
	public void setCustomerPurchase(double customerPurchase) {
		this.customerPurchase = customerPurchase;
	}
	/**
	 * returns discount
	 * @return
	 */
	public double getDiscount() {
		return discount;
	}
	/**
	 * gets discount based on purchased amount
	 */
	public void setDiscount() {
		if (customerPurchase >= 2000) {
			discount = .1;
		} else if (customerPurchase >= 1500) {
			discount = .07;
		} else if (customerPurchase >= 1000) {
			discount = .06;
		} else if (customerPurchase >= 500) {
			discount = .05;
		} else {
			discount = 0;
		}
	}
	/**
	 * subtracts discount amount of purchase
	 * @return
	 */
	public double getTotal() {
		return customerPurchase - (customerPurchase * discount);
	}
	
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		DecimalFormat percent = new DecimalFormat("##%");
		String str = "";
		str = super.toString() + "\n\nPurchased:\t\t" + formatter.format(customerPurchase)
		+ "\n\nDiscount:\t\t" + percent.format(discount) + "\n\nTotal\t\t\t"
		+ formatter.format(getTotal());
		return str;
	}

}
