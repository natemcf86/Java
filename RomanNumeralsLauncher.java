import java.util.Scanner;

public class RomanNumeralsLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputString = "yes";
		int num;
		while(inputString.equals("yes")){
			System.out.print("Enter a number 1 through 10.\n");
			num = keyboard.nextInt();
			RomanNumerals num1 = new RomanNumerals(num);
			num1.getRomnum();
			keyboard.nextLine();
			System.out.print("\nRun again?(yes or no)\n");
			inputString = keyboard.nextLine();
		}

	}

}
