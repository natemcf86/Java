import java.text.DecimalFormat;
public class PenniesForPay {
	private double days;			//amount of days worked
	private double pennies = 1;			//pennies worked
	private double salary = 0;		//total amount paid
	DecimalFormat money = new DecimalFormat("$#,###.00");
	
	public PenniesForPay() {
	}
	/**
	 * returns the amount of days the program will run
	 * @return
	 */
	public double getDays() {
		return days;
	}
	/**
	 * sets the amount of days the program will run
	 * @param days
	 */
	public void setDays(double days) {
		this.days = days;
	}
	//get the amount of pennies in a dollar format
	public double getPennies() {
		return pennies / 100;
	}
	//get total salary in dollar format
	public double getSalary() {
		return salary / 100;
	}
	//used to reset penny value of penny back to 1.
	public void setPennies(double a) {
		this.pennies = a;
	}
	/**
	 * in table format shows user how much money they'd make if they made a penny a day and it doubled each day. 
	 */
	public void payment() {
		for (int i = 1; i <= days; i++) {
			salary += pennies;
			System.out.println(i + ". " + money.format(getPennies()) + "\t\t\t\t" + money.format(getSalary()));
			pennies = pennies * 2;
		}
	}
}
