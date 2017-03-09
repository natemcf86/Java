import java.util.Random;

public class Employee {
private String employeeName;		//holds the employee's name
private String employeeNum;			//holds the employee's num ###-X
private String hireDate;			//holds the employee's hiring date
Random rand = new Random();			//random number object for use in employeeNum
/**
 * no arg constructor	
 */
public Employee() {
		hireDate = "";
		employeeName = "";
		employeeNum = "";
	}
	//returns the employee's name
	public String getEmployeeName() {
		return employeeName;
	}
	//sets the employee's name
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	//gets the employee's ID number
	public String getEmployeeNum() {
		return employeeNum;
	}
	//Randomizes employee's number based on ###-X
	public void setEmployeeNum() {
		int a = rand.nextInt(10);
		int b = rand.nextInt(10);
		int c = rand.nextInt(10);
		int d = rand.nextInt(13);
		char e = 'a';
		switch(d) {
		case 0:
			e = 'A';
			break;
		case 1:
			e = 'B';
			break;
		case 2:
			e = 'C';
			break;
		case 3:
			e = 'D';
			break;
		case 4:
			e = 'E';
			break;
		case 5:
			e = 'F';
			break;
		case 6:
			e = 'G';
			break;
		case 7:
			e = 'H';
			break;
		case 8:
			e = 'I';
			break;
		case 9:
			e = 'J';
			break;
		case 10:
			e = 'K';
			break;
		case 11:
			e = 'L';
			break;
		case 12:
			e = 'M';
			break;
		default:
			System.out.print("Error. Closing");
			System.exit(0);
		}
		employeeNum = a + "" + b + "" + c + "-" + e;
	}
	//sets the hire date of the employee
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	//returning hiring date in format 'January 01, 2001
	public String getHireDate() {
		return hireDate;
	}
	public String toString() {
		String str;
		str = "Employee Information\n**********************\nEmployee Name:\t\t"
			+ employeeName + "\n" + "Employee Number:\t"
			+ employeeNum + "\n" + "Hire Date:\t\t" 
			+ hireDate + "\n";
		return str;
	}
	
}
