
public class customer extends Person {
	private int customerNumber;		//holds number of customer
	private boolean mailingList;	//true if person wants to be on mailing list
	/**
	 * no arg customer
	 */
	public customer() {
		this.customerNumber = 0;
		this.mailingList = true;
	}
	//getters and setters for mailing list and customer number
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public boolean isMailingList() {
		return mailingList;
	}
	public void setMailingList(boolean mailingList) {
		this.mailingList = mailingList;
	}
	public String toString() {
		String str = "";
		str = "Customer Information\n***************\n" + super.toString()
		+ "Customer's Number:\t" + customerNumber + "\n\nMailing List:\t\t"
		+ mailingList;
		return str;
	}
	
}
