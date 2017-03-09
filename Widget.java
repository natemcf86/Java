
public class Widget {
	private double amount;
	private double days;
	private double hours;
	public Widget(double a) {
		this.amount = a;
	}
	public double getDays() {
		return days = (amount / 10.0) / 16;
	}
	
	public double getHours() {
		return hours = (amount / 10) % 16;
	}

}
