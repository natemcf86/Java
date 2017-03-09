import java.util.Scanner;
import java.text.DecimalFormat;

public class FatGramLauncher {

	public static void main(String[] args) {
		double calories;			//sets calories of item
		double fatGram;				//sets fatGrams of item
		String inputString = "yes";	//sets string for loop statement
		//import objects
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("##%");
		FatGram item1 = new FatGram();
		System.out.print("Let's find out how many calories come from fat!\n"
				+ "Enter the amount of calories in a food item:");
		item1.setCalories(keyboard.nextDouble());
		//loop statement to make sure correct value of fat grams is correct
		while (inputString.equals("yes")){
			System.out.print("Enter the fat grams in the same food item?");
				item1.setFatGrams(keyboard.nextDouble());
				item1.setFat();
			if (item1.getFat() > item1.getCalories()) {
				System.out.print("This is an incorrect value. The fat is too high. Please try again.\n");
			} else {
				inputString = "no";
			}
		}
		if (item1.fatPercent() < .3) {
			System.out.print("Your food item has " + formatter.format(item1.fatPercent()) + " calories from fat. It's low fat! Congrats");
		} else {
			System.out.print("Your food item has " + formatter.format(item1.fatPercent()) + " calories from fat.");
		}
		
		
		keyboard.close();
	}

}
