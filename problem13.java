import java.util.Scanner;
public class problem13 {
	//FIND OUT TOTAL OF A RESTAURANT BILL
	public static void main(String[] args){
		//GLOBAL VARIABLES
		double subtotal;
		double salesTax;
		double LOW_TIP = .10;
		double MED_TIP = .18;
		double HI_TIP = .22;
		double tip;
		double total;
		double afterTip;
		double customTip;
		String answer;
		Scanner keyboard = new Scanner(System.in);
		//FIND OUT TOTAL OF BILL
				System.out.print("What was the total of your meal?");
				subtotal = keyboard.nextDouble();
				//Gives total of bill with 10% tip
				salesTax = subtotal * .075;
				total = subtotal + salesTax;
				tip = total * LOW_TIP;
				afterTip = total + tip;
				System.out.printf("With a 10%% tip you will pay:\n"
						+ "Subtotal    %6.2f"
						+ "\nSales tax   %6.2f"
						+ "\nTip         %6.2f"
						+ "\nTotal       %6.2f", 
						subtotal, salesTax, tip, afterTip);
				tip = total * MED_TIP;
				afterTip = total + tip;
				//Gives total of bill with 18% tip
				System.out.printf("\n\nWith an 18%% tip you will pay:\n"
						+ "Subtotal    %6.2f"
						+ "\nSales tax   %6.2f"
						+ "\nTip         %6.2f"
						+ "\nTotal       %6.2f", 
						subtotal, salesTax, tip, afterTip);
				tip = total * HI_TIP;
				afterTip = total + tip;
				//Gives total of bill with 22% tip
				System.out.printf("\n\nWith a 22%% tip you will pay:\n"
						+ "Subtotal    %6.2f"
						+ "\nSales tax   %6.2f"
						+ "\nTip         %6.2f"
						+ "\nTotal       %6.2f", 
						subtotal, salesTax, tip, afterTip);
				keyboard.nextLine();
				//Allows a customized tip;
				System.out.print("\nWould you like to see a different tip amount?\n");
				answer = keyboard.nextLine();
				while (answer.equals("yes")) {
					System.out.print("What tip would you like to test?");
					customTip = keyboard.nextDouble();
					double customTipTrue = customTip / 100;
					tip = total * customTipTrue;
					afterTip = total + tip;
					System.out.printf("\n\nWith a %.0f%% tip you will pay:\n"
							+ "Subtotal    %6.2f"
							+ "\nSales tax   %6.2f"
							+ "\nTip         %6.2f"
							+ "\nTotal       %6.2f", 
							customTip, subtotal, salesTax, tip, afterTip);
					keyboard.nextLine();
					System.out.print("\nWould you like to see a different tip amount?");
					answer = keyboard.nextLine();
					
				}
		
		
	}
}
