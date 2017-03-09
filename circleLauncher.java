import java.util.Scanner;

public class circleLauncher {

	public static void main(String[] args) {
		//new object
		circle circle1 = new circle();
		Scanner keyboard = new Scanner(System.in);
		//find radius
		System.out.print("What is the circle's radius(in inches)?\n");
		circle1.setRadius(keyboard.nextDouble());
		//display area, diameter and circumference of circle
		System.out.printf("The radius of your circle is %.2f inches.\n"
				+ "The area is %,.2f inches.\nThe diameter is %,.2f inches.\n"
				+ "The circumference is %,.2f inches.", circle1.getRadius(), circle1.getArea(), 
				circle1.getDiameter(), circle1.getCircumference());

	}

}
