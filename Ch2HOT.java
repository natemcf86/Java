
public class Ch2HOT {

	public static void main(String[] args) {
		final int NUM_BARS = 567;
		final double PURCHASE_PRICE = 11562;
		final double SELLING_PRICE = 13243;
		final double BROKER_COMM_RATE = .03;
		double goldPurchase = (double)NUM_BARS * PURCHASE_PRICE;
		double purchaseComm = goldPurchase * BROKER_COMM_RATE;
		double amountPaid = goldPurchase + purchaseComm;
		double stockSale = (double)NUM_BARS * SELLING_PRICE;
		double sellingComm = stockSale * BROKER_COMM_RATE;
		double amountReceived = stockSale - sellingComm;
		double profitOrLoss = amountReceived - amountPaid;
		System.out.printf("Jack paid $%,.2f for the gold."
				+ "\nJack paid his broker a commission of $%,.2f on the purchase."
				+ "\nSo, Jack paid a total of $%,.2f"
				+ "\n"
				+ "\nJack sold the gold for $%,.2f."
				+ "\nJack paid his broker a commission of $%,.2f on the sale."
				+ "\nSo, Jack recieved a total of $%,.2f"
				+ "\n"
				+ "\nJack's profit or loss: $%,.2f ", 
				goldPurchase, purchaseComm, amountPaid, stockSale, sellingComm, amountReceived, profitOrLoss);
		
		

	}

}
