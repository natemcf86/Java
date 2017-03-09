import java.util.Scanner;
import java.text.DecimalFormat;
public class ShippingChargesLauncher {

	public static void main(String[] args) {
		//new objects for imported packages
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$##,###.00");
		
		//new object package1 based on shippingcharges.java
		ShippingCharges package1 = new ShippingCharges();
		
		//output to have user store weight and miles in object
		System.out.print("Welcome to Fast Freight Shipping Company where we offer reliabe service and fast deliver!\n"
				+ "Feel free to use our calculator to figure out rates for your package.\n"
				+ "How big is the package that you will be shipping(in kilograms)?\n");
		//store weight in packageWeight
		package1.setPackageWeight(keyboard.nextDouble());
		
		//store miles in miles
		System.out.print("How many miles do you plan to ship it?\n");
		package1.setMiles(keyboard.nextDouble());
		package1.setCharges();
		
		//display results and rate
		System.out.print("Here is the breakdown:\nMiles Shipped:\t\t" + package1.getMiles()
				+ "\nCharged per 500 miles:\t" + formatter.format(package1.getCharges())
				+ "\nTotal shipping charges:\t" + formatter.format(package1.getShippingCharges()));
		

	}

}
