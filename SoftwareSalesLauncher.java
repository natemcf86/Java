import java.util.Scanner;
import java.text.DecimalFormat;
public class SoftwareSalesLauncher {

	public static void main(String[] args) {
		//new objects for imported Scanner and DecimalFormat
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("##%");
		DecimalFormat dollar = new DecimalFormat("$##,###.00");
		
		//output to user to find amount of packages
		System.out.print("We are selling packages for $99. They come with everything you need.\n"
				+ "We have discounts depending on how many you buy.\nHow many would you like?");
		
		//find out amountOfPackages and create new object
		SoftwareSales sale1 = new SoftwareSales(keyboard.nextDouble());
		
		//set discount amount
		sale1.setDiscount();
		//display results
		System.out.print("Here's the details on your purhase:\n"
				+ "Amount of Packages =\t" + sale1.getamountOfPackage()
				+ "\nBefore Discount =\t" + dollar.format(sale1.subTotal())
				+ "\nDiscount =\t\t" + formatter.format(sale1.getDiscount())
				+ "\nTotal Cost =\t\t" + dollar.format(sale1.totalCost()));
		

	}

}
