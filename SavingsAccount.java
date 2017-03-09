
public class SavingsAccount extends BankAccount {
	
	boolean active;
	
	public SavingsAccount(double ir, double b) {
		super(ir, b);
	}
	/**
	 * sees if account is active. if account dips below $25 account because inactive
	 * @return
	 */
	public boolean isActive() {
		if (balance > 25) {
			active = true;
		} else {
			active = false;
		}
		return active;
	}
	
	/**
	 * finds out if account is active and then calls withdraw from BankAccount
	 */
	public void withdraw(double b) {
		if (isActive() == true) {
			super.withdraw(b);
		} else {
			System.out.print("Error. Account is inactive.\n");
		}
	}
	/**
	 * finds out if account is active and then calls deposit from BankAccount
	 */
	public void deposit(double a) {
		if (isActive() == true) {
			super.deposit(a);
		} else {
			System.out.print("Error. Account is inactive.\n");
		}
	}
	/**
	 * calls calcInterest from BankAccount and adds widthrawals to monthly charges
	 */
	public void monthlyProcess() {
		calcInterest();
		if (withdrawals > 4) {
			monCharges += withdrawals;
		}
		super.monthlyProcess();
	}
	public String toString() {
		String str;
		str = super.toString() + "\nAccount Status:\t\t" + isActive();
		return str;
	}
	
}
