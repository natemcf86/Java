
public class TestScores {
	private double[] testScores;		//holds an array of test scores
	private double sum;				//holds the sum of the testscores
	private double average;			//holds the average of the testscores
	private double count;
	/**
	 * constructor that calls fields
	 * @param testScores
	 */
	public TestScores(double[] testScores) {
		this.testScores = testScores;
		sum = 0;
		average = 0;
	}
	/**
	 * adds test scores to sum and throws error if score is negative or above 100
	 * @throws InvalidTestScore
	 */
	public void setSum() throws InvalidTestScore{
		try{
		for (int i = 0; i < testScores.length; i++) {
			if (testScores[i] < 0 || testScores[i] > 100) {
				throw new InvalidTestScore(testScores[i]);
			} else {
				sum += testScores[i];
				count++;
			}
		}
		} catch(InvalidTestScore e) {
			System.out.println(e.getMessage());
		}
		
	}
	/**
	 * returns sum
	 * @return
	 */
	public double getSum() {
		return sum;
	}
	/**
	 * gets average of all test scores
	 * @return
	 */
	public double getAverage() {
		average = sum / count;
		return average;
	}

}
