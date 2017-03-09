
public class BankCharges {
	private double checkCost;			//discount for checks written
	private double MONTHLY_FEE = 10;	//$10 monthly fee
	private double amountOfChecks;		//checks written a month
	private double balance;				//balance of account
	private double serviceFee;			//total service fee 
	
	public BankCharges() {
		
	}
	//getters and setters
	public void setAmountOfChecks(double a){
		this.amountOfChecks = a;
	}
	public double getAmountofChecks(){
		return amountOfChecks;
	}
	public void setBalance(double b){
		this.balance = b;
	}
	public double getBalance() {
		return balance;
	}
	//finding discount of checks based on checks written
	public void setcheckCost() {
		if (amountOfChecks >= 60){
			checkCost = .04;
		} else if (amountOfChecks >= 40){
			checkCost = .06;
		} else if (amountOfChecks >= 20){
			checkCost = .08;
		} else if (amountOfChecks >= 0) {
			checkCost = .10;
		} else {
			System.out.print("There has been an error. Closing...");
			System.exit(0);
		}
	}
	public double getcheckCost() {
		return checkCost;
	}
	//set service fees based on bank balance. if bank balance is less than 400, add 15 dollars.
	public void setserviceFees(){
		if (balance <= 400) {
			serviceFee = MONTHLY_FEE + (amountOfChecks * checkCost) + 15;
		} else {
			serviceFee = MONTHLY_FEE + (amountOfChecks * checkCost);
		}
	}
	public double getserviceFees() {
		return serviceFee;
	}
	//balance after service fees have been applied
	public double NewBalance() {
		return balance - serviceFee;
	}
	
}
