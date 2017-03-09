import java.util.Scanner;
import java.text.DecimalFormat;
public class MobileServiceProviderLauncher {

	public static void main(String[] args) {
		String inputString;
		String output = "";					//stores results
		Scanner keyboard = new Scanner(System.in);
		MobileServiceProvider cell1 = new MobileServiceProvider();
		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		System.out.print("Choose a package(A, B, or C):\n");
		inputString = keyboard.nextLine();
		cell1.setPackageLetter(inputString.charAt(0));
		System.out.print("How many minutes are you going to use a month?");
		cell1.setMinutes(keyboard.nextDouble());
		switch (cell1.getPackageLetter()) {
		case 'a':
		case 'A':
			System.out.print("Your monthly payment will be " + formatter.format(cell1.packageA()) + "\n");
			if (cell1.packageA() > cell1.packageB()) {		
					System.out.print("You'd save " + formatter.format(cell1.packageA() - cell1.packageB()) + " by switching to package B.\n");
			}
			if (cell1.packageA() > cell1.packageC()) {
					System.out.print("You'd save " + formatter.format(cell1.packageA() - cell1.packageC()) + " by switching to package C.\n");
			}
			break;
		case 'b':
		case 'B':
			System.out.print("Your monthly payment will be " + formatter.format(cell1.packageB()) + "\n");
			if (cell1.packageB() > cell1.packageA()) {
					System.out.print("You'd save " + formatter.format(cell1.packageB() - cell1.packageA()) + " by switching to package A.\n");
			}
			if (cell1.packageB() > cell1.packageC()) {
					System.out.print("You'd save " + formatter.format(cell1.packageB() - cell1.packageC()) + " by switching to package C.\n");
			}
			break;
		case 'c':
		case 'C':
			System.out.print("Your monthly payment will be" + formatter.format(cell1.packageC()) + "\n");
			if (cell1.packageC() > cell1.packageA()) {
					System.out.print("You'd save " + formatter.format(cell1.packageC() - cell1.packageA()) + " by switching to package A.\n");
					}
			if (cell1.packageC() > cell1.packageB()) {
					System.out.print("You'd save " + formatter.format(cell1.packageC() - cell1.packageB()) + " by switching to package C.\n");
			}
			break;
		default:
			System.out.print("You did not enter a correct package.");
		}
	}

}
