import java.util.Scanner;

public class problemnine {
	public static void main(String[] args) {
		//variables
		double gallons;
		double miles;
		double milespergallon;
		//call the keyboard
		Scanner keyboard = new Scanner(System.in);
		//find out the miles driven
		System.out.print("How many miles have you driven?");
		miles = keyboard.nextDouble();
		//find out the gallons used
		System.out.print("How many gallons did you use?");
		gallons = keyboard.nextDouble();
		//find out mpg of information given
		milespergallon = miles / gallons;
		//print to screen
		System.out.printf("Your car has %.2f MPG.", milespergallon);
		}

}
