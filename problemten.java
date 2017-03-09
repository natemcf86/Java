import java.util.Scanner;

public class problemten {

	public static void main(String[] args) {
		//variables
		double testFirst;
		double testSecond;
		double testThird;
		double testTotal;
		double testAverage;
		//call keyboard
		Scanner keyboard = new Scanner(System.in);
		//find out test scores
		System.out.print("Enter your three test scores\nFirst Test:");
		testFirst = keyboard.nextDouble();
		System.out.print("Second test:");
		testSecond = keyboard.nextDouble();
		System.out.print("Third test:");
		testThird = keyboard.nextDouble();
		//math to find out average for test scores 
		testTotal = testFirst + testSecond + testThird;
		testAverage = testTotal / 3;
		//print to screen
		System.out.printf("First test = %.0f\n"
				+ "Second test = %.0f\n"
				+ "Third test = %.0f\n"
				+ "Your average is %.0f\n", testFirst, testSecond, testThird, 
				testAverage);

	}

}
