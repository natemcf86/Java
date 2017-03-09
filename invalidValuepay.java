
public class invalidValuepay extends Exception{

	public invalidValuepay() {
		super("The hourly pay rate has to be positive and less than 25.");
	}

}
