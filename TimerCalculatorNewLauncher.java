import java.util.Scanner;

public class TimerCalculatorNewLauncher {

	public static void main(String[] args) {
		String inputString = "yes";
		Scanner keyboard = new Scanner(System.in);
		while(inputString.equals("yes")){
		System.out.print("New One: This program will tell you how many days, hours, and minutes are in the amount of seconds entered. "
				+ "\nEnter a number of seconds:\n");
		TimeCalculatorNew timer = new TimeCalculatorNew(keyboard.nextDouble());
		timer.getTime();
		keyboard.nextLine();
		System.out.print("\nRun again?");
		inputString = keyboard.nextLine();

	}
	}
}

