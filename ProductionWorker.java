import java.text.DecimalFormat;
public class ProductionWorker extends Employee {
private int shift;			//holds an integer that corresponds with a shift
private double hourlyRate;	//holds the hourlyRate of the employee
Employee employ = new Employee();
/**
 * no arg constructor
 */
	public ProductionWorker() {
		
	}
/**
 * arg constructor with fields
 */
public ProductionWorker(int shift, double hourlyRate) {
	this.shift = shift;
	this.hourlyRate = hourlyRate;
}
/**
 * copy constructor
 * @param productionWorker
 */
public ProductionWorker(ProductionWorker productionWorker) {
	this.shift = productionWorker.shift;
	this.hourlyRate = productionWorker.hourlyRate;
}
//returns days or nights based on shift being 1 or 2
public String getShift() {
	String str = "";
	if (shift == 1) {
		str = "Days";
	} else if (shift == 2) {
		str = "Nights";
	}
	return str;
}
//sets the string shift
public void setShift(int shift) {
	this.shift = shift;
}
//returns the hourly rate of the employee
public double getHourlyRate() {
	return hourlyRate;
}
//sets the hourly rate of the employee
public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
}

public String toString() {
	DecimalFormat formatter = new DecimalFormat("$###,###.00");
	String str = "";
	str = super.toString() + "Employee Type:\t Production Worker"
			+ "\nShift:\t\t\t" + getShift()
			+ "\nHourly Rate:\t\t" + formatter.format(hourlyRate);
	return str; 
}


}
