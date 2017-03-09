import java.text.DecimalFormat;
import java.util.Scanner;

public class essayLauncher {

	public static void main(String[] args) {
		Essay essay = new Essay();
		int num = -1;
		DecimalFormat formatter = new DecimalFormat("##%");
		Scanner keyboard = new Scanner(System.in);
		while (num < 0 && num > 30) {
			System.out.println("What was the score of the grammar of your essay?"
					+ " 1-30 pts");
			num = keyboard.nextInt();
			if (num < 0 || num > 30) {
				System.out.print("This was the wrong input. Try again");
			}
		} 
		essay.setGrammer(num);
		do {
			System.out.println("What was the score of the spelling of your essay?"
					+ " 1-20 pts");
			num = keyboard.nextInt();
			if (num < 0 || num > 20) {
				System.out.print("This was the wrong input. Try again");
			}
		} while (num < 0 && num > 20);
		essay.setSpelling(num);
		do {
			System.out.println("What was the score for the length of your essay?"
					+ " 1-20 pts");
			num = keyboard.nextInt();
			if (num < 0 || num > 20) {
				System.out.print("This was the wrong input. Try again");
			}
		} while (num < 0 && num > 20);
		essay.setCorrectLength(num);
		do {
			System.out.println("What was the score for the content of your essay?"
					+ " 1-30 pts");
			num = keyboard.nextInt();
			if (num < 0 || num > 30) {
				System.out.print("This was the wrong input. Try again");
			}
		} while (num < 0 && num > 30);
		essay.setContent(num);
		essay.setTotalGrade();
		essay.setScore(essay.getTotalGrade());
		System.out.print("Your grade is " + formatter.format(essay.getTotalGrade() / 100) + " " + essay.getGrade());
		keyboard.close();
	}

}
