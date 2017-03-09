/**
 * A class that holds a grade for a graded activity
 * @author Nathaniel
 *
 */
public class GradedActivity {
	private double score;		//Numeric score
	/**
	 * no arg constructor
	 */
	public GradedActivity() {
		
	}
	/**
	 * arg that calls field
	 * @param score
	 */
	public GradedActivity(double score) {
		this.score = score;
	}
	
	/**
	 * The setScore method stores its argument in the score field
	 */
	public void setScore(double s) {
		score = s;
	}
	/**
	 * Sets score
	 */
	public double getScore() {
		return score;
	}
	/**
	 * The getGrade method returns a letter grade determined from the score
	 * field
	 */
	
	public char getGrade() {
		char letterGrade; //To hold the grade
		if (score >= 90) 
			letterGrade = 'A';
		else if (score >= 80) 
			letterGrade = 'B';
		else if (score >= 70)
			letterGrade = 'C';
		else if (score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		return letterGrade;
	}

}
