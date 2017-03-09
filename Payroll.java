
public class Payroll {
	//variables
	private String name;		//holds name of employee
	private int idNumber;		//holds employee id
	private double hourPay;		//holds pay(per hour)
	private double hourWorked;	//holds worked
	/**
	 * constructors calls the fields name and employee id
	 * @param a
	 * @param b
	 */
	public Payroll(String a, int b) {
		this.name = a;
		this.idNumber = b;
	}
	/**
	 * getters and setters for name, employee id, paid per hour, and hours worked
	 * @return
	 */
	public String getName() {
		return name;
	}
	
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
	/**
	 * math to get gross pay calculated amount earned per hour * hours worked.
	 * @return
	 */
	public double grossPay() {
		return hourPay * hourWorked;
	}
}
