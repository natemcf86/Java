import java.util.Scanner;
public class GreatestAndLeastLauncher {

	public static void main(String[] args) {
		int num;			//holds the number chosen so far
		Scanner keyboard = new Scanner(System.in);
		GreatestAndLeast gal1 = new GreatestAndLeast();
		System.out.print("This program will give you the least and the greatest"
				+ " number \non what numbers you input. Stop the program by entering"
				+ " -99.\n");
		do {
			System.out.print("Enter a number:\n");
			num = keyboard.nextInt();
			if (num > gal1.getGreatestNumber()) {
				gal1.setGreatestNumber(num);
			}
			if (num < gal1.getLeastNumber() && num != -99) {
				gal1.setLeastNumber(num);
			}
			System.out.print("Current largest number: " + gal1.getGreatestNumber()
			+ "\nCurrent smallest number: " + gal1.getLeastNumber() + "\n");
		} while (num != -99);
		System.out.print("Current largest number: " + gal1.getGreatestNumber()
		+ "\nCurrent smallest number: " + gal1.getLeastNumber());
	}

}
