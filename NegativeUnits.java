
public class NegativeUnits extends Exception{
/**
 * no arg constructor
 */
	public NegativeUnits() {
		super("Error: Invalid Amount.");
	}
	public NegativeUnits(int units) {
		super("Error: Invalid Amount: " + units);
	}
}
