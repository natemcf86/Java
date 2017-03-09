import java.util.Scanner;
public class problemeleven {

	public static void main(String[] args) {
		//variables
		double males;
		double females;
		double totalAmount;
		//call keyboard
		Scanner keyboard = new Scanner(System.in);
		//find out males in class
		System.out.print("How many people are in your class?\nMales?");
		males = keyboard.nextDouble();
		//find out females in class
		System.out.print("Females?");
		females = keyboard.nextDouble();
		//math to find out percantage of males and females and total amount of people in class
		totalAmount = males + females;
		double malesPercent = males / totalAmount * 100;
		double femalesPercent = females / totalAmount * 100;
		//input information to screen
		System.out.printf("There are %.0f students in your class.\n"
				+ "%.0f are male and %.0f are female.\n"
				+ "%.0f%% percent are male and %.0f%% are female.", totalAmount,
				males, females, malesPercent, femalesPercent);
	}

}
