import java.util.Scanner;

public class TemperatureLauncher {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the temperature(In Fahrenheit)?");
		temp1.setFtemp(keyboard.nextDouble());
		double a = temp1.getFtemp();
		double b = temp1.getCelsius();
		double c = temp1.getKelvin();
		System.out.printf("%.0f Fahrenheit is equal to:\n"
				+ "%.0f Celsius\n" 
				+ "%.0f Kelvin", a, b, c);
		

	}

}
