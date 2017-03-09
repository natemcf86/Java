
public class InvalidTestScore extends IllegalArgumentException {
/**
 * no arg constructor
 */
	public InvalidTestScore() {
		// TODO Auto-generated constructor stub
	}
	public InvalidTestScore(double test) {
		super("Error: Invalid input " + test);
	}

}
