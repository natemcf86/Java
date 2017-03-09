import java.text.DecimalFormat;

public abstract class BankAccount {
	double balance;		//holds balance of bank account
	int deposits;		//holds number of deposits for the month
	int withdrawals;	//holds number of withdrawals for the month
	double intRate;		//holds annual interest rate
	double monCharges;	//holds monthly charges
	public BankAccount(double ir, double b) {
		this.intRate = ir;
		this.balance = b;
		
	}
	/**
	 * adds a deposit to the balance and then accrued deposit count
	 * @param a
	 */
	public void deposit (double a) {
		balance += a;
		deposits++;
	}
	/**
	 * subtracts a withdraw to the balance and then accrues the withdraw count
	 * @param b
	 */
	public void withdraw (double b) {
		balance -= b;
		withdrawals++;
	}
	/**
	 * adds monthly interest(annual interest/12) to the deposit
	 */
	public void calcInterest() {
		double monthlyRate = intRate/12;
		double monthlyInterest = balance * monthlyRate;
		balance += monthlyInterest;
	}
	/**
	 * subtracts monthly charges and resets the counts of deposit and withdraw
	 */
	public void monthlyProcess() {
		balance -= monCharges;
		deposits = 0;
		withdrawals = 0;
		monCharges = 0;
	}
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		DecimalFormat percent = new DecimalFormat("##%");
		String str = "";
		str = "Account Information\n**************\nBalance:\t\t" + formatter.format(balance)
			 	+ "\nInterest Rate:\t\t" + percent.format(intRate);
		return str;
	}
	
	
}
