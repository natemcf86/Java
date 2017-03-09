import java.util.Scanner;

public class WidgetLauncher {

	public static void main(String[] args) {
		double num;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many widgets do you need to make?");
		num = keyboard.nextDouble();
		Widget wjt = new Widget(num);
		System.out.print("It will take you " + Math.floor(wjt.getDays()) + "days and " 
				+ Math.floor(wjt.getHours()) + " hours to make that many widgets");

	}

}
