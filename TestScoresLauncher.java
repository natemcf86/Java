import java.text.DecimalFormat;

public class TestScoresLauncher {

	public static void main(String[] args) {
		//holds array of test scores
		double[] testScores = {55, 100, 50, 95, 98, -55};
		//creates new object with test scores
		TestScores tests = new TestScores(testScores);
		DecimalFormat formatter = new DecimalFormat("##%");
		tests.setSum();
		//output information
		System.out.print("The average of your tests is: " 
		+ formatter.format(tests.getAverage()/100));
		

	}

}
