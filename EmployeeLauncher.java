
public class EmployeeLauncher {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		System.out.print("Name\t\tID Number\tDepartment\tPosition\n"
				+ "------------------------------------------------------------\n");
		employee1.setName("Susan Meyers");
		employee2.setName("Mark Jones");
		employee3.setName("Joy Rogers");
		employee1.setIdNumber(47899);
		employee2.setIdNumber(39119);
		employee3.setIdNumber(81774);
		employee1.setDepartment("Accounting");
		employee2.setDepartment("IT");
		employee3.setDepartment("Manufacturing");
		employee1.setPosition("Vice President");
		employee2.setPosition("Programmer");
		employee3.setPosition("Engineer");
		System.out.print(employee1.getName() + "\t" + employee1.getIdNumber() + "\t\t" + employee1.getDepartment()
				+ "\t" + employee1.getPosition()+ "\n");
		System.out.print(employee2.getName() + "\t" + employee2.getIdNumber() + "\t\t" + employee2.getDepartment()
				+ "\t\t" + employee2.getPosition()+ "\n");
		System.out.print(employee3.getName() + "\t" + employee3.getIdNumber() + "\t\t" + employee3.getDepartment()
				+ "\t" + employee3.getPosition()+ "\n");

	}

}
