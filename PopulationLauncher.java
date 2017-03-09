import java.util.Scanner;
import java.text.DecimalFormat;
public class PopulationLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###");
		DecimalFormat percent = new DecimalFormat("##%");
		Population virus1 = new Population();
		/**
		 * Asks user to set a starting size of the population and doesn't allow 
		 * a size less than 2
		 */
		do {
			System.out.print("What is the starting size of your population?\n");
			virus1.setPopulation(keyboard.nextDouble());
			if (virus1.getPopulation() < 2) {
				System.out.print("This is an invalid number. Try again\n");
			}
		} while (virus1.getPopulation() < 2);
		/**
		 * Asks user to a set a daily population increase and doesn't allow a size
		 * less than 0
		 */
		do {
			System.out.print("What is the daily population increase?\n");
			virus1.setPopulationIncrease(keyboard.nextDouble());
			if (virus1.getPopulationIncrease() < 0) {
				System.out.print("That is an invalid number. Try again\n");
			}
		} while (virus1.getPopulationIncrease() < 0);
		do {
			System.out.print("How many days will this population be increasing?\n");
			virus1.setMaxDays(keyboard.nextDouble());
			if (virus1.getMaxDays() < 1) {
				System.out.print("That is an invalid number. Try again\n");
			}
		} while (virus1.getMaxDays() < 1);
		/**
		 * Header for population table
		 */
		System.out.print("Your population will start at: " + formatter.format(virus1.getPopulation())
		+ "\nYour population increase is " + percent.format(virus1.getPopulationIncrease())
		+ "\nThe amount of days your population will increase is " + formatter.format(virus1.getMaxDays())
		+ "\nDay\t\tPopulation\n");
		/**
		 * this will display the population for every day in a table format.
		 */
		for (int i = 1; i <= virus1.getMaxDays(); i++) {
			System.out.print(i + "\t\t\t" + formatter.format(virus1.getPopulation()) + "\n");
			virus1.getDailyIncrease();
		}
		
	}
}
