
public class TimeCalculator {
	private double second;

	//constructor setting seconds variable.
	public TimeCalculator(double  t) {
		this.second = t;
	}
	
//86,400 seconds in a day
public double getDay() {
		return second/86400.0;
		}
//60 seconds in a minute
	public double getMinute() {
		return second / 60.0;
	}
//3600 seconds in an hour
	public double getHour() {
		return second/3600.0;
	}

//if statement with an error 
	public void getTime(){
		if (second < 60){
			System.out.print("This wasn't even a minute.");
		} else if (second >= 86400) {
			System.out.print("This is " + getDay() + " days.\nThis is "
					+ getHour() + " hours.\nThis is " + getMinute() 
					+ " minute");
		} else if (second >= 3600) {
			System.out.print("This is " + getHour() + " hours.\nThis is "
					+ getMinute() + " minutes");
		} else if (second >= 60) {
			System.out.print("This is " + getMinute() + " minutes");
		}  

	}
}