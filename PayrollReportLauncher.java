import java.util.Scanner;

import java.text.DecimalFormat;
public class PayrollReportLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		DecimalFormat id1 = new DecimalFormat("######");
		PayrollReport emp1 = new PayrollReport();
		System.out.print("Find out net pay.\n");
		/**
		 * This do while will loops script to continously get employee id, gross pay, state tax, 
		 * federal taxes, and FICA withholdings until 0 is inputted into employee ID
		 */
		do {
			/**
			 * This  do while will loop script if state tax + federal tax + FICA withholdings is larger
			 * than gross pay
			 */
		do {
			/**
			 * This will loop if user inputs a negative number 
			 */
			do {
				System.out.print("Enter Employee ID Number(0 to stop script):\n");
				emp1.setIDNumber(keyboard.nextDouble());
				 
				if (emp1.getIDNumber() < 0) {
					System.out.print("You've entered an invalid input.\n");
				}
			} while (emp1.getIDNumber() < 0);
			/**
			 * if 0 is chosen it will leave loop and stop entire program
			 */
			if (emp1.getIDNumber() == 0) {
				System.out.print("Continuing...\n");
				break;
			}
			/**
			 * This loop will not allow a negative number to be input
			 */
			do {
				System.out.print("Enter your grosspay:\n");
				emp1.setGrossPay(keyboard.nextDouble());
				if (emp1.getGrossPay() < 0) {
					System.out.print("You've entered an invalid input.\n");
				}
			} while (emp1.getGrossPay() < 0);
			/**
			 * This loop will not allow a negative number for state tax or a number 
			 * larger than gross pay
			 */
			do {
				System.out.print("Enter your state taxes:\n");
				emp1.setStateTax(keyboard.nextDouble());
				if (emp1.getStateTax() < 0 || emp1.getStateTax() > emp1.getGrossPay()) {
					System.out.print("You've entered an invalid input.\n");
				}
			} while (emp1.getStateTax() < 0 || emp1.getStateTax() > emp1.getGrossPay());
			/**
			 * This loop will not allow a negative number for federal tax or a number
			 * larger than gross pay
			 */
			do {
				System.out.print("Enter your federal taxes:\n");
				emp1.setFedTax(keyboard.nextDouble());
				if (emp1.getFedTax() < 0 || emp1.getFedTax() > emp1.getGrossPay()) {
					System.out.print("You've entered an invalid input.\n");
				}
			} while (emp1.getFedTax() < 0 || emp1.getFedTax() > emp1.getGrossPay());
			/**
			 * This loop will not allow a negative number for FICA withholdings or a 
			 * number larger than gross pay
			 */
			do {
				System.out.print("Entered your FICA withholdings:\n");
				emp1.setFICA(keyboard.nextDouble());
				if (emp1.getFICA() < 0 || emp1.getFedTax() > emp1.getGrossPay()) {
					System.out.print("You've entered an invalid number.\n");
				}
			} while (emp1.getFICA() < 0 || emp1.getFedTax() > emp1.getGrossPay());
			/**
			 * An if statement that will indicate an error if taxes > gross pay
			 */
			if (emp1.errorlarge() > emp1.getGrossPay()) {
				System.out.print("There was an error. Reinput data.\n\n");
			}
		} while (emp1.errorlarge() > emp1.getGrossPay());
		/**
		 * shows employee's data just input
		 */
		System.out.print("\nEmployee ID:\t" + id1.format(emp1.getIDNumber())
				+ "\nGross pay:\t" + formatter.format(emp1.getGrossPay())
				+ "\nState tax:\t" + formatter.format(emp1.getStateTax())
				+ "\nFederal tax:\t" + formatter.format(emp1.getFedTax())
				+ "\nFICA withholdings:\t" + formatter.format(emp1.getFICA()) + "\n");
		/**
		 * following methods will add the current with the total gross pay, state 
		 * tax, federal tax, and fica
		 */
		emp1.setMaxGrossPay();
		emp1.setMaxStateTax();
		emp1.setMaxFedTax();
		emp1.setMaxFICA();
		/**
		 * Shows the current totals for the payroll
		 */
		System.out.print("\nCurrent Totals:\nTotal Gross Pay: " + formatter.format(emp1.getMaxGrossPay()) + "\n"
				+ "Total State Tax: " + formatter.format(emp1.getMaxStateTax()) + "\n"
				+ "Total Federal Tax: " + formatter.format(emp1.getMaxFedTax()) + "\n"
				+ "Total FICA withholdings: " + formatter.format(emp1.getMaxFICA()) + "\n\n");
		/**
		 * resets cost of gross pay, state tax, federal tax, fica
		 */
		emp1.setGrossPay(0);
		emp1.setStateTax(0);
		emp1.setFedTax(0);
		emp1.setFICA(0);
		
		} while (emp1.getIDNumber() != 0);
		/**
		 * end of program will show the totals of every category.
		 */
		System.out.print("\n\nTotals:\nTotal Gross Pay: " + formatter.format(emp1.getMaxGrossPay()) + "\n"
				+ "Total State Tax: " + formatter.format(emp1.getMaxStateTax()) + "\n"
				+ "Total Federal Tax: " + formatter.format(emp1.getMaxFedTax()) + "\n"
				+ "Total FICA withholdings: " + formatter.format(emp1.getMaxFICA()) + "\n");
		keyboard.close();
		System.exit(0);
	}
		

}
