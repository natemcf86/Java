import java.util.Scanner;
import java.text.DecimalFormat;
public class averageRainfallLauncher {

	public static void main(String[] args) {
		double years;			//holds the number of years we will be looking at to test average rainfall
		String month = "";		//holds the month
		averageRainfall rainfall1 = new averageRainfall();
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###");
		/**
		 * Asks the user to input a year amount. If it's less than 1, give error and repeat.
		 */
		do {
			System.out.print("How many years?");
			years = keyboard.nextDouble();
			rainfall1.setTotalYears(years);
			rainfall1.setTotalMonths();
			if (years < 1) {
				System.out.print("Please enter a number 1 or greater.");	
			}
		} while (years < 1);
		/**
		 * nested loop that loops for years and months to collect the amount of rainfall given for the 
		 * entire time period
		 */
		for (int i = 1; i <= years; i++){
			for (int a = 1; a <= 12; a++) {
				//Creating a string called month that will hold the month based on it's position in the loop
				if (a == 1) {
					month = "January";
				} else if (a == 2) {
					month = "February";
				} else if (a == 3) {
					month = "March";
				} else if (a == 4) {
					month = "April";
				} else if (a == 5) {
					month = "May";
				} else if (a == 6) {
					month = "June";
				} else if (a == 7) {
					month = "July";
				} else if (a == 8) {
					month = "August";
				} else if (a == 9) {
					month = "September";
				} else if (a == 10) {
					month = "October";
				} else if (a == 11) {
					month = "November";
				} else if (a == 12) {
					month = "December";
				}
				//asks for rainfall for the chosen month and doesn't allow a negative number
				do {
					System.out.print("How much rainfall(in inches) dropped in the month of " + month
						+ ", year " + i + "?\n");
					rainfall1.setRainfall(keyboard.nextDouble());
					if (rainfall1.getRainfall() < 0) {
						System.out.print("You've inputted an incorrect amount");
					}
				} while (rainfall1.getRainfall() < 0);
				//adds the rainfall for current month into totalrainfall
				rainfall1.setTotalRainfall(rainfall1.getTotalRainfall() + rainfall1.getRainfall());
				//display rainfall for the current month and total rainfall up until that point
				System.out.print("The rainfall for the month of " + month + " is " +
				formatter.format(rainfall1.getRainfall()) + "\nThe total rainfall so far was " 
						+ formatter.format(rainfall1.getTotalRainfall()) + ".\n");
			}
		}
		//displays total months altogether and average rainfall for the amount of time the program ran for
		System.out.print("There were " + formatter.format(rainfall1.getTotalMonths()) + " months total.\nThe average "
				+ "rainfall each month was "
				+ formatter.format(rainfall1.getRainfallAverage()) + "inches.");
	}
}
