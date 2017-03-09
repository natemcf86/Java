import java.util.Scanner;
public class PenniesForPayLauncher {

	public static void main(String[] args) {
		PenniesForPay pfp1 = new PenniesForPay();
		Scanner keyboard = new Scanner(System.in);
		String counter = "yes";
		//find days worked and allows user to reset problem
		while (counter.equals("yes")) {
			System.out.print("We will be finding out what your salary is.\n"
				+ "How many days did you work?");
			pfp1.setDays(keyboard.nextDouble());
			keyboard.nextLine();
			//inputs error if days is less than 1
			if (pfp1.getDays() < 1){
				System.out.print("This is the wrong output.  Running again\n");
				continue;
			}
			//header for Penny for pay table
			System.out.print("Today's pay\t\t\tTotal Pay\n"
				+ "----------------------------------------------------\n");
			//inputs rows of data based on getting double the salary each day and starting at a penny.
			pfp1.payment();
			System.out.print("Would you like to run again?");
			counter = keyboard.nextLine();
			//resets penny amount
			pfp1.setPennies(1);
			if (!(counter.equals("yes"))) {
				System.out.print("\nGoodbye");
				System.exit(0);
			}
		}
		keyboard.close();
	} 

}
