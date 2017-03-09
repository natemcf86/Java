import java.util.Scanner;

public class TestScoresLauncher {

	public static void main(String[] args) {
		double t1;
		double t2;
		double t3;
		Scanner keyboard = new Scanner(System.in);
		//user inputs test scores 1-3.
		System.out.print("We will be averaging three tests.\n"
				+ "Please enter first test score:");
		t1 = keyboard.nextDouble();
		System.out.print("Please enter second test score:");
		t2 = keyboard.nextDouble();
		System.out.print("Please enter third test score:");
		t3 = keyboard.nextDouble();
		//new object to get results
		TestScores tester1 = new TestScores(t1, t2, t3);
		//display results
		System.out.print("Your test scores are:\n"
				+ "Test 1:\t\t" + tester1.letterGrade(t1) + " " + t1 + "%\n"
				+ "Test 2:\t\t" + tester1.letterGrade(t2) + " " + t2 + "%\n"
				+ "Test 3:\t\t" + tester1.letterGrade(t3) + " " + t3 + "%\n"
				+ "Your Average:\t" + tester1.letterGrade(tester1.averageTest()) + " " + tester1.averageTest() + "%");
	}	
}
