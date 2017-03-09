
public class NegativePrice extends Exception{
/**
 * no arg constructor
 */
	public NegativePrice() {
		super("Error: Invalid Amount");
	}
	public NegativePrice(double price) {
		super("Error: Invalid Amount: " + price);
	}

}
