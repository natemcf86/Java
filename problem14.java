
public class problem14 {
//Finds total cost of stock plus commission
	public static void main(String[] args) {
		//variables and math
		double stockPrice = 25.50;
		double stockCost = stockPrice * 1000;
		double commissionPrice = stockCost * .02;
		double totalAmount = stockCost + commissionPrice;
		//console output
		System.out.printf("Kathryn bought 1000 shares of a stock at $25.50 per "
				+ "\nshare. She had to pay her broker 2%% commision."
				+ "\nCost of stock:   $%,9.2f"
				+ "\nCommission cost:    $%5.2f"
				+ "\nTotal cost:      $%,9.2f", stockCost, commissionPrice, totalAmount);

	}

}
