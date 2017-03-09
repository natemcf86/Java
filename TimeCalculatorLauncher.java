import java.util.Scanner;
import java.text.DecimalFormat;

public class TimeCalculatorLauncher {

	public static void main(String[] args) {
		//input string to make while statement true
		String inputString = "yes";
		//create new object to use Scanner import
		Scanner keyboard = new Scanner(System.in);
		//loop to continue running program
		while(inputString.equals("yes")){
		//Asking user to enter an amount of seconds
		System.out.print("This program will tell you how many days, hours, or minutes are in the amount of seconds entered. "
				+ "\nEnter a number of seconds:\n");
		//create new object and input seconds into variable
		TimeCalculator timer = new TimeCalculator(keyboard.nextDouble());
		//run main method to display amount of days, hours, or minutes
		timer.getTime();
		//nextLine used to stop program from breaking
		keyboard.nextLine();
		//ask user if they want to run program again
		System.out.print("\nRun again?\n");
		inputString = keyboard.nextLine();

	}
	}
}

