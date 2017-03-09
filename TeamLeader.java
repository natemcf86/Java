import java.text.DecimalFormat;

public class TeamLeader extends ProductionWorker {
private double monthlyBonus;		//holds monthly bonus amount
private int trainingHours;			//holds required training hours

public TeamLeader() {
	
}
/**
 * getters and setters for monthly bonus and training hours required
 * @return
 */
public double getMonthlyBonus() {
	return monthlyBonus;
}
public void setMonthlyBonus(double monthlyBonus) {
	this.monthlyBonus = monthlyBonus;
}
public int getTrainingHours() {
	return trainingHours;
}
public void setTrainingHours(int trainingHours) {
	this.trainingHours = trainingHours;
}

public String toString() {
	DecimalFormat formatter = new DecimalFormat("$###,###.00");
	String str;
	str = super.toString() + "\nMonthly Bonus:\t" + formatter.format(monthlyBonus) 
			+ "\nRequired Training Hours:\t" + trainingHours;
	return str;
}
}
