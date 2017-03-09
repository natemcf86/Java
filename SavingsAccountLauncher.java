
public class SavingsAccountLauncher {

	public static void main(String[] args) {
		SavingsAccount account1 = new SavingsAccount(.05, 150000);
		account1.deposit(3000);
		account1.withdraw(152000);
		account1.withdraw(500);
		account1.withdraw(100);
		account1.withdraw(100);
		account1.withdraw(100);
		account1.monthlyProcess();
		System.out.print(account1);

	}

}
