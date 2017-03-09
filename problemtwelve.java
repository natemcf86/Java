import java.util.Scanner;
public class problemtwelve {

	public static void main(String[] args) {
		String inputInfo;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your favorite city?");
		inputInfo = keyboard.nextLine();
		int length = inputInfo.length();
		String inputInfoLower = inputInfo.toLowerCase();
		String inputInfoUpper = inputInfo.toUpperCase();
		char inputInfoFirst = inputInfo.charAt(0);
		System.out.print("There are " + length + " characters in that city. \nUppercase: " + inputInfoUpper + 
				"\nLowercase: " + inputInfoLower + "\nFirst character: " + inputInfoFirst);
			

	}

}
