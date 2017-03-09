import java.text.DecimalFormat;

public class CourseGrades {
	//creates an array of objects
	GradedActivity[] grades = new GradedActivity[4];
	
	public CourseGrades() {
		
	}
	/**
	 * sets the grade for the lab activity
	 * @param lab
	 */
	public void setLab(GradedActivity lab) {
		grades[0] = lab;
	}
	/**
	 * sets the grade of the pass fail exam
	 * @param passFailExam
	 */
	public void setPassFailExam(GradedActivity passFailExam) {
		grades[1] = passFailExam;
	}
	/**
	 * sets the grade of essay
	 * @param essay1
	 */
	public void setEssay(GradedActivity essay1) {
		grades[2] = essay1;
	}
	/**
	 * sets the grade of the final exam
	 * @param finalExam
	 */
	public void setFinalExam(GradedActivity finalExam) {
		grades[3] = finalExam;
	}
	
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("##%");
		String str = "Lab Grade:\t" + formatter.format(grades[0].getScore()/100)
				+ "\t" + grades[0].getGrade() + "\nExam Grade:\t"
				+ formatter.format(grades[1].getScore()/100) + "\t" 
				+ grades[1].getGrade() + "\nEssay Score:\t" 
				+ formatter.format(grades[2].getScore()/100) + "\t"
				+ grades[2].getGrade() + "\nFinal Exam Grade:\t" + 
				formatter.format(grades[3].getScore()/100) + "\t" 
				+ grades[3].getGrade() + "\nAverage:\t\t";
		return str;
	}

}
