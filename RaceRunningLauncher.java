import java.util.Scanner;
public class RaceRunningLauncher {

	public static void main(String[] args) {
		//new object for imported Scanner
		Scanner keyboard = new Scanner(System.in);
		RaceRunning race1 = new RaceRunning();
		//find out runner names
		System.out.print("We will display the results of the race shortly. Please enter first runner's name");
		race1.setRunner1(keyboard.nextLine());
		System.out.print("Enter second runner's name:");
		race1.setRunner2(keyboard.nextLine());
		System.out.print("Enter third runner's name:");
		race1.setRunner3(keyboard.nextLine());
		//find out runner times
		System.out.print("We will need the time of the runners. What was first runner's time(in minutes)?");
		race1.setRunner1Time(keyboard.nextDouble());
		System.out.print("What was second runner's time(in minutes)?");
		race1.setRunner2Time(keyboard.nextDouble());
		System.out.print("What was third runner's time(in minutes)?");
		race1.setRunner3Time(keyboard.nextDouble());
		//get results from method
		race1.FirstPlace();
		//displace results
		System.out.print(race1.getOutput());
		keyboard.close();

	}

}
