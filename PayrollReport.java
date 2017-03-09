
public class PayrollReport {
private double IDNumber;			//stores ID number of employee
private double grossPay;			//stores grosspay of employee
private double stateTax;			//stores state tax that employee will be deducted
private double fedTax;				//stores federal tax that employee will be deducted
private double FICA;				//stores FICA holdings from employee
private double maxGrossPay;			//stores grosspay of all employee
private double maxStateTax;			//stores all state tax for employees
private double maxFedTax;			//stores all federal tax that employee will be deducted
private double maxFICA;				//stores FICA holdings from employee
	public PayrollReport() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * returns netpay calculated as gross - state tax - federal tax - FICA withholdings
	 * @return
	 */
	public double getNetPay() {
		return grossPay - stateTax - fedTax - FICA;
	}
	/**
	 * returns employee ID number
	 * @return
	 */
	public double getIDNumber() {
		return IDNumber;
	}
	/**
	 * sets employee ID Number
	 * @param iDNumber
	 */
	public void setIDNumber(double in) {
		IDNumber = in;
	}
	/**
	 * returns grosspay of employee
	 * @return
	 */
	public double getGrossPay() {
		return grossPay;
	}
	/**
	 * sets grosspay of employee based on input
	 * @param grossPay
	 */
	public void setGrossPay(double gp) {
		this.grossPay = gp;
	}
	/**
	 * return state tax of employee
	 * @return
	 */
	public double getStateTax() {
		return stateTax;
	}
	/**
	 * sets state tax of employee based on input
	 * @param stateTax
	 */
	public void setStateTax(double st) {
		this.stateTax = st;
	}
	/**
	 * returns federal tax of employee
	 * @return
	 */
	public double getFedTax() {
		return fedTax;
	}
	/**
	 * sets federal tax of employee based on input
	 * @param fedTax
	 */
	public void setFedTax(double fedTax) {
		this.fedTax = fedTax;
	}
	/**
	 * returns FICA withholdings
	 * @return
	 */
	public double getFICA() {
		return FICA;
	}
	/**
	 * sets FICA withholdings based on input
	 * @param fICA
	 */
	public void setFICA(double fICA) {
		FICA = fICA;
	}
	/**
	 * returns taxes combined to display error if taxes > grosspay.
	 * @return
	 */
	public double errorlarge() {
		return stateTax + fedTax + FICA;
	}
	/**
	 * adds current gross pay to total gross pay
	 */
	public void setMaxGrossPay() {
		maxGrossPay += grossPay;
	}
	/**
	 * adds the current state tax to total state tax
	 */
	public void setMaxStateTax() {
		maxStateTax += stateTax;
		}
	/**
	 * adds the current federal tax to the total federal tax
	 */
	public void setMaxFedTax() {
		maxFedTax += fedTax;
	}
	/**
	 * adds the current FICA to the total FICA
	 */
	public void setMaxFICA() {
		maxFICA += FICA;
	}
	/**
	 * returns the total max gross pay
	 * @return
	 */
	public double getMaxGrossPay() {
		return maxGrossPay;
	}
	/**
	 * returns the total state tax
	 * @return
	 */
	public double getMaxStateTax() {
		return maxStateTax;
	}
	/**
	 * returns the total federal tax
	 * @return
	 */
	public double getMaxFedTax() {
		return maxFedTax;
	}
	/**
	 * returns the total fica withholdings
	 * @return
	 */
	public double getMaxFICA() {
		return maxFICA;
	}
}
