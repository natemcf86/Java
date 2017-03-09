import javax.swing.JOptionPane;

public class problem17 {

	public static void main(String[] args) {
		//global variables
		String name;
		String age;
		String city;
		String college;
		String job;
		String animal;
		String pet;
		
		//find out name
		name = JOptionPane.showInputDialog("What is your name?");
		
		//find out age
		age = JOptionPane.showInputDialog("How old are you?");
		
		//find out city
		city = JOptionPane.showInputDialog("What city are you in?");
		
		//find out college
		college = JOptionPane.showInputDialog("What college do you attend?");
		
		//find out job
		job = JOptionPane.showInputDialog("What job would you like?");
		
		//find out pet type
		animal = JOptionPane.showInputDialog("What animal do you want as a pet?");
		
		//find out pet name
		pet = JOptionPane.showInputDialog("What is the name of your pet?");
		
		//console output
		JOptionPane.showMessageDialog(null, "There once was a person named "
				+ name + " who lived in " + city + ". At the age \nof " + age
				+ ", " + name + " went to college at " + college + ". " + name +
				" graduated and went to \nwork as a " + job + ". Then, " + name + 
				" adopted a " + animal + " named \n" + pet + ". They both lived happily"
				+ " ever afer!");
		
		

	}

}
