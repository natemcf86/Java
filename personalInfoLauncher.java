
public class personalInfoLauncher {

	public static void main(String[] args) {
		//new objects
		PersonalInfo person1 = new PersonalInfo();
		PersonalInfo person2 = new PersonalInfo();
		PersonalInfo person3 = new PersonalInfo();
		//input info into person1
		person1.setName("Nathaniel McFarland");
		person1.setAddress("379 Coachway Lane");
		person1.setAge(30);
		person1.setPhoneNumber("314-681-8336");
		//input info info person2
		person2.setName("Seth Carter");
		person2.setAddress("6842 Ellesville Rd");
		person2.setAge(21);
		person2.setPhoneNumber("618-472-6646");
		//input info info person3
		person3.setName("Clint Coughlin");
		person3.setAddress("1622 Fuller Lane");
		person3.setAge(24);
		person3.setPhoneNumber("314-581-1700");
		//display info
		System.out.print("Name\t\t\tAddress\t\t\tAge\tPhone Number\n"
				+ "----------------------------------------------------------------------\n");
		System.out.print(person1.getName() + "\t" + person1.getAddress() + "\t" + person1.getAge()
				+ "\t" + person1.getPhoneNumber() + "\n");
		System.out.print(person2.getName() + "\t\t" + person2.getAddress() + "\t" + person2.getAge()
		+ "\t" + person2.getPhoneNumber() + "\n");
		System.out.print(person3.getName() + "\t\t" + person3.getAddress() + "\t" + person3.getAge()
		+ "\t" + person3.getPhoneNumber() + "\n");
		

	}

}
