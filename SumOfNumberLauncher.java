import java.util.Scanner;
public class SumOfNumberLauncher {

	public static void main(String[] args) {
		int outputNumber;
		String outputString = "yes";
		Scanner keyboard = new Scanner(System.in);
		SumOfNumbers num1 = new SumOfNumbers();		
		while (outputString.equals("yes")) {	
			System.out.print("Enter a positive number:");
			outputNumber = keyboard.nextInt();
			if (outputNumber <= 0) {
				System.out.print("This is an incorrect value");
				continue;
			}
			num1.setNum(outputNumber);
			for (int i = 1; i <= num1.getNum(); i++){
				System.out.print(i + ", ");
				if (i % 10 == 0){
				System.out.print("\n");
			}
		}
		keyboard.nextLine();
		System.out.print("Would you like to rerun(yes or no)?");
		outputString = keyboard.nextLine();
		}
		keyboard.close();
	}

}
