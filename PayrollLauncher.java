import java.util.Scanner;
public class PayrollLauncher {

	public static void main(String[] args) throws emptyString, invalidValue,
		invalidValuehrs, invalidValuepay{
		//variables
		String name;
		int num;
		//make loop  a true statement
		String inputString = "yes";
		Scanner keyboard = new Scanner(System.in);
		//create a loop to replay program
		while (inputString.equals("yes")){
		//find out name, employee id, time worked, and amount paid per hour
		System.out.print("What is your name?\n");
		name = keyboard.nextLine();
		//will cause an error if string is empty
		if (name.equals("")) {
			throw new emptyString();
		}
		System.out.print("What is your employee ID number?\n");
		//will cause an error if number is negative
		num = keyboard.nextInt();
		if (num < 0) {
			throw new invalidValue();
		}
		//make new object
		Payroll employee = new Payroll(name, num);
		System.out.print("Welcome " + employee.getName() + ", how many hours did you "
				+ "work this week?\n");
		employee.setHourWorked(keyboard.nextDouble());
		//will cause an error if amount is over 84 or negative
		if (employee.getHourWorked() > 84 || employee.getHourWorked() < 0) {
			throw new invalidValuehrs();
		}
		System.out.print("So you have worked "  + employee.getHourWorked() + "hours. "
				+ "How much do you get paid per hour?\n");
		employee.setHourPay(keyboard.nextDouble());
		//will cause an error if number is negative or over 25
		if (employee.getHourPay() < 0 || employee.getHourPay() > 25) {
			throw new invalidValuepay();
		}
		//display info
		System.out.printf("You have made $%.2f this week.\n", employee.grossPay());
		keyboard.nextLine();
		//see if loop will run again
		System.out.print("Would you like to run this program again?");
		inputString = keyboard.nextLine();
		
		
		}
		System.exit(0);

	}

}
