import java.util.Scanner;

public class productionWorkerLauncher {

	public static void main(String[] args) {
		String output = "";
		int count = 0;
		ProductionWorker employee1 = new ProductionWorker();//new object
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the name of the employee?\n");
		employee1.setEmployeeName(keyboard.nextLine());
		employee1.setEmployeeNum();
		System.out.print("When was the employee hiring date? "
				+ "Use the format '01/01/2000'");
		employee1.setHireDate(keyboard.nextLine());
		while (count == 0) {
			System.out.print("Does this employee work days or nights?\n");
			output = keyboard.nextLine();
			if (output.equalsIgnoreCase("days")) {
				employee1.setShift(1);
				count++;
			} else if (output.equalsIgnoreCase("nights")) {
				employee1.setShift(2);
				count++;
			} else {
				System.out.print("You've entered the wrong input. Please enter "
					+ "'days' or 'nights'\n");
			}
		}
		System.out.print("What is the hourly rate of this employee?\n");
		employee1.setHourlyRate(keyboard.nextDouble());
		System.out.print(employee1 + "\n\n");
		ShiftSupervisor supervisor = new ShiftSupervisor();
		supervisor.setEmployeeName("Lekia");
		supervisor.setEmployeeNum();
		supervisor.setHireDate("05/28/1997");
		supervisor.setAnnualSalary(150000.22);
		supervisor.setAnnualBonus(20000.00);
		System.out.println(supervisor);
		keyboard.close();
		

	}

}
