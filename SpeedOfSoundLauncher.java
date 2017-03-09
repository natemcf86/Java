import java.util.Scanner;
public class SpeedOfSoundLauncher {

	public static void main(String[] args) {
		int choice;				//variable that holds user's choice of air, steel, or water
		Scanner keyboard = new Scanner(System.in);
		SpeedOfSound sos1 = new SpeedOfSound();
		//display menu to choose a number 1-3
		System.out.print("Select one by number:\n1. Air\n2. Water\n3. Steel\n");
		choice = keyboard.nextInt();
		//find distance in feet for calculation
		System.out.print("Enter the distance(in feet) a sound wave will travel");
		sos1.setDistance(keyboard.nextDouble());
		//switch statement to display results for distance
		switch (choice) {
		case 1: System.out.print("The time it would take is " + sos1.getSpeedInAir() + " seconds to travel that distance");
		break;
		case 2: System.out.print("The time it would take is " + sos1.getSpeedInWater() + " seconds to travel that distance");
		break;
		case 3: System.out.print("The time it would take is " + sos1.getSpeedInSteel() + " seconds to travel that distance");
		break;
		default: System.out.print("You didn't enter a valid answer");
		}

}
}
