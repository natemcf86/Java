import java.util.Scanner;
import java.io.*;
public class DistanceFileLauncher {

	public static void main(String[] args) throws IOException {
		int hoursSpent;			//hours spent travelling
		Scanner keyboard = new Scanner(System.in);
		String counter = "yes";
		DistanceFile trip1 = new DistanceFile();
		PrintWriter outputFile = new PrintWriter("distance.txt");
		while (counter.equals("yes")) {
			//finds speed while travelling
			System.out.print("How fast were you going?");
			trip1.setSpeed(keyboard.nextInt());
			if (trip1.getSpeed() < 1) {
				System.out.print("You put in an incorrect input. Try again\n");
				continue;
			}
			//finds time traveled
			System.out.print("How many hours were you going that fast?");
			hoursSpent = keyboard.nextInt();
			if (hoursSpent < 1) {
				System.out.print("You put "
						+ "in an incorrect input. Try again\n");
				continue;
			}
			keyboard.nextLine();
			//makes a table to show how many miles you went each hour.
			outputFile.println("Hour\t\t Distance Traveled");
			outputFile.println("-------------------------------------------\n");
			System.out.print("Heading printed\n");
			//displays each line from 1 until it reaches the hours traveled
			while (trip1.getTimeTraveled() <= hoursSpent){
				outputFile.println(trip1.getTimeTraveled() + "\t\t\t" + trip1.getDistance());
				trip1.setTimeTraveled(trip1.getTimeTraveled() + 1);
				System.out.print("Line Printed\n");
			
			}
			//request to run again
			System.out.print("Run again?");
			//gets out of loop if 
			counter = keyboard.nextLine();
			if (!(counter.equals("yes"))) {
				System.out.print("\nGoodbye");
				break;
			}
		}
		outputFile.close();

	}

}
