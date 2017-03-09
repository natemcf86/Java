
public class Payroll {
	//variables
	private String name;
	private int idNumber;
	private double hourPay;
	private double hourWorked;
	public Payroll(String a, int b) {
		this.name = a;
		this.idNumber = b;
	}
	public String getName() {
		return name;
	}
	//getters and setters
	public void setName(String nm) {
		this.name = nm;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int num) {
		this.idNumber = num;
	}
	public double getHourPay() {
		return hourPay;
	}
	public void setHourPay(double HP) {
		this.hourPay = HP;
	}
	public double getHourWorked() {
		return hourWorked;
	}
	public void setHourWorked(double HW) {
		this.hourWorked = HW;
	}
	//math to get gross pay
	public double grossPay() {
		return hourPay * hourWorked;
	}
}
