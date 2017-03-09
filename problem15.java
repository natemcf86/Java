import java.util.Scanner;
public class problem15 {
//ingredient adjuster
	public static void main(String[] args) {
		double TOTAL_COOKIES = 48;
		double TOTAL_SUGAR = 1.5;
		double TOTAL_BUTTER = 1;
		double TOTAL_FLOUR = 2.75;
		double SUGAR_PER_COOKIE = TOTAL_SUGAR / TOTAL_COOKIES;
		double BUTTER_PER_COOKIE = TOTAL_BUTTER / TOTAL_COOKIES;
		double FLOUR_PER_COOKIE = TOTAL_FLOUR / TOTAL_COOKIES;
		double userInput;
		double sugarAmount;
		double butterAmount;
		double flourAmount;
		String answer = "yes";
		Scanner keyboard = new Scanner(System.in);
		while(answer.equals("yes")){
		System.out.print("How many cookies would you like to bake?");
		userInput = keyboard.nextDouble();
		sugarAmount = SUGAR_PER_COOKIE * userInput;
		butterAmount = BUTTER_PER_COOKIE * userInput;
		flourAmount = FLOUR_PER_COOKIE * userInput;
		System.out.printf("\nFor %.0f cookies, you will need:"
				+ "\n%.2f cups of sugar"
				+ "\n%.2f cups of butter"
				+ "\n%.2f cups of flour", 
				userInput, sugarAmount, butterAmount, flourAmount);
		keyboard.nextLine();
		System.out.print("\nWould you like to run this program again?");
		answer = keyboard.nextLine();
		
		}

	}

}
