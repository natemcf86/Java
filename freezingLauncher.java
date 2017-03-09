import java.util.Scanner;
public class freezingLauncher {

	public static void main(String[] args) {
		String output = "At that temperature:\n";			//holds results;
		Scanner keyboard = new Scanner(System.in);
		freezing temp1 = new freezing();
		System.out.print("Enter a temperature in Fahrenheit:");
		temp1.setTemperature(keyboard.nextDouble());
		if (temp1.isEthylFreezing() == true) {
			output += "Ethyl is freezing.\n";
		}

		if (temp1.isEthylBoiling() == true) {
			output += "Ethyl is boiling.\n";
		}
		if (temp1.isOxygenFreezing() == true) {
			output += "Oxygen is freezing.\n";
		}
		if (temp1.isOxygenBoiling() == true) {
			output += "Oxygen is boiling.\n";
		}
		if (temp1.isWaterFreezing() == true) {
			output += "Water is freezing.\n";
		}
		if (temp1.isWaterBoiling() == true) {
			output += "Water is boiling.\n";
		}
		System.out.print(output);
		keyboard.close();
	}

}
