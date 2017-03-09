import java.text.DecimalFormat;

public class ShiftSupervisor extends Employee {
private double annualSalary; 		//holds annual salary of shift supervisor
private double annualBonus;			//holds annual bonus

/*
 * no-arg constructor
 */

public ShiftSupervisor() {

}
public double getAnnualSalary() {
	return annualSalary;
}
public void setAnnualSalary(double annualSalary) {
	this.annualSalary = annualSalary;
}
public double getAnnualBonus() {
	return annualBonus;
}
public void setAnnualBonus(double annualBonus) {
	this.annualBonus = annualBonus;
}


public String toString() {
	DecimalFormat formatter = new DecimalFormat("$###,###.00");
	String str = "";
	str = super.toString() + "AnnualSalary:\t" + formatter.format(annualSalary)
			+ "\nAnnual Bonus:\t" + formatter.format(annualBonus);
	return str;
}


}
