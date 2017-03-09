import java.util.Scanner;

public class PetLauncher {

	public static void main(String[] args) {
		//make new objective
		Pet pet1 = new Pet();
		Scanner keyboard = new Scanner(System.in);
		//get name, age, and type of pet
		System.out.print("What is the name of your pet?\n");
		pet1.setName(keyboard.nextLine());
		System.out.print("What type of pet do you have?\n");
		pet1.setType(keyboard.nextLine());
		System.out.printf("How old is your %s?\n", pet1.getType());
		pet1.setAge(keyboard.nextInt());
		//display information
		System.out.printf("Type:\t%s\nName:\t%s\nAge:\t%d years old", 
				pet1.getType(), pet1.getName(), pet1.getAge());

	}

}
