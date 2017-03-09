
public class problem18 {
//stock transaction
	public static void main(String[] args) {
		//global variables
		//Shares bought
		double SHARES_BOUGHT = 32.87 * 1000;
		double COMMISSION_SHARES_BOUGHT = SHARES_BOUGHT * .02;
		double TOTAL_SHARES_BOUGHT = SHARES_BOUGHT + COMMISSION_SHARES_BOUGHT;
		//Shares sold
		double SHARES_SOLD = 33.92 * 1000;
		double COMMISSION_SHARES_SOLD = SHARES_SOLD * .02;
		double TOTAL_SHARES_SOLD = SHARES_SOLD - COMMISSION_SHARES_SOLD;
		//Difference between two
		double loss = TOTAL_SHARES_BOUGHT -TOTAL_SHARES_SOLD;
		//Console output
		System.out.printf("Joe bought %,.2f in stock."
				+ " He was charged $%,.2f in commission \nby his broker."
				+ " Two weeks later, Joe sold the stock for $%,.2f and "
				+ "was \ncharged $%.2f commission by his broker. "
				+ "Joe lost $%.2f in this \ntransaction.", SHARES_BOUGHT, COMMISSION_SHARES_BOUGHT,
				SHARES_SOLD, COMMISSION_SHARES_SOLD, loss);
		

	}

}
