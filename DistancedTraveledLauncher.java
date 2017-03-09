import java.util.Scanner;
public class DistancedTraveledLauncher {

	public static void main(String[] args) {
		int hoursSpent;
		Scanner keyboard = new Scanner(System.in);
		String counter = "yes";
		DistanceTraveled trip1 = new DistanceTraveled();
		while (counter.equals("yes")){
			//finds speed while travelling
			System.out.print("How fast were you going?");
			trip1.setSpeed(keyboard.nextInt());
			if (trip1.getSpeed() < 1) {
				System.out.print("This is an incorrect value. Try again\n");
				continue;
			}
			//finds time travelled
			System.out.print("How many hours were you going that fast?\n");
			hoursSpent = keyboard.nextInt();
			if (hoursSpent < 1) {
				System.out.print("This is an incorrect value. Try again");
				continue;
			}
			//makes a table to show how many miles you went eacch hour
			System.out.print("Hour\t\t Distance Traveled\n"
					+ "-------------------------------------------\n");
			//display information
			while (trip1.getTimeTraveled() <= hoursSpent){
				System.out.printf(trip1.getTimeTraveled() + "\t\t\t" + trip1.getDistance() + "\n");
				trip1.setTimeTraveled(trip1.getTimeTraveled() + 1);
			}
			System.out.print("Run again?");
			counter = keyboard.nextLine();
			if (!(counter.equals("yes"))) {
				System.out.print("\nGoodbye");
				break;
			}
		}

	}

}
