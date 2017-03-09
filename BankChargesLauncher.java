import java.util.Scanner;
import java.text.DecimalFormat;
public class BankChargesLauncher {

	public static void main(String[] args) {
		//new objects for imported scanner and decimal
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat sales1 = new DecimalFormat("$###,###.00");
		//intro to console asking user to input data for balance and check amount
		BankCharges account1 = new BankCharges();
		System.out.print("Welcome to McFarland Banking where we treat you right!Our goal is to make you happy\n and we have great "
				+ "rates on services.\nUse our calculator to determine what your monthly fees will be.\nWhat is your average bank "
				+ "account balance?\n");
		//use method to set Balance
		account1.setBalance(keyboard.nextDouble());
		System.out.print("How many checks do you use a month?");
		//use methods to get fields for amountOfChecks, checkCost, serviceFees
		account1.setAmountOfChecks(keyboard.nextDouble());
		account1.setcheckCost();
		account1.setserviceFees();
		System.out.print("This is what your service fees will look like:\nBank Balance:\t\t" + sales1.format(account1.getBalance())
				+ "\nAmount of Checks used:\t" + account1.getAmountofChecks()
				+ "\nCost per check:\t\t" + sales1.format(account1.getcheckCost())
				+ "\nService Fees:\t\t" + sales1.format(account1.getserviceFees())
				+ "\nNew Balance:\t\t" + sales1.format(account1.NewBalance()));

	}

}
