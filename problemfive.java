import javax.swing.JOptionPane;

public class problemfive {

	public static void main(String[] args) {
		//global variables
		int maxCookies = 40;
		int COOKIE_CALORIES = 75;
		int cookieCount;
		String inputString;
		double calorieAmount;
		//get the amount of cookies they ate
		inputString = JOptionPane.showInputDialog("How many "
				+ "cookies did you eat?");
		//find out calories per cookie eaten
		cookieCount = Integer.parseInt(inputString);
		calorieAmount = cookieCount * COOKIE_CALORIES;
		//if statement depending on amount eaten
		if(cookieCount > maxCookies){
			JOptionPane.showMessageDialog(null, "There weren't "
					+ "even that many cookies, pig!");
		} else if (cookieCount > 20) {
			JOptionPane.showMessageDialog(null, "Wow, you ate " + calorieAmount + " calories worth "
					+ "of cookies! That must be a record!");
		} else {
			JOptionPane.showMessageDialog(null, "Great job! You only ate " + calorieAmount + " calories "
					+ "calories worth of cookies. Way to have some self control.");
			
		}

	}

}
