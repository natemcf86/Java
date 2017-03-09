

public class TimeCalculatorNew {
	private double second;

	//constructor setting seconds variable.
	public TimeCalculatorNew(double  t) {
		this.second = t;
	}
	
//86,400 seconds in a day
public double getDay() {
		return second/86400.0;
		}
//60 seconds in a minute
	public double getMinute() {
		return ((second % 86400.0) % 3600.0) / 60.0;
	}
//3600 seconds in an hour
	public double getHour() {
		return (second % 86400.0) /3600.0;
	}
	public double getSecond() {
		return second;
	}
	public double getSeconds() {
		return (((second % 86400.0) % 3600.0) % 60.0);
	}

//if statement with an error 
	public void getTime(){
			System.out.print("This is " + Math.floor(getDay()) + " days, "  + Math.floor(getHour()) + " hours, "
					+ Math.floor(getMinute()) + " minutes, and " + Math.floor(getSeconds()) + " seconds.");
	}
}