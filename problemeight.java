import java.util.Scanner;

public class problemeight {

	public static void main(String[] args) {
		//variables
		double STATE_SALES_TAX = .055;
		double COUNTY_SALES_TAX = .02;
		double purchaseCost;
		//call the keyboard
		Scanner keyboard = new Scanner(System.in);
		//find out the subtotal of the item
		System.out.print("What is the cost of "
				+ "your purchase?");
		//Find out the sales tax and total cost of the purchase
		purchaseCost = keyboard.nextDouble();
		double totalStateTax = purchaseCost * STATE_SALES_TAX;
		double totalCountyTax = purchaseCost * COUNTY_SALES_TAX;
		double totalPurchaseCost = purchaseCost + totalStateTax + totalCountyTax;
		//console output information
		System.out.printf(
				"Amount of Purchase = $%,.2f \n"
				+ "State Sales tax = $%,.2f\n"
				+ "County Sales Tax = $%,.2f\n"
				+ "Total Amount = $%,.2f\n", 
				purchaseCost, totalStateTax, totalCountyTax, totalPurchaseCost);
		
		

	}

}
