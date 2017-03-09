
public class Essay extends GradedActivity {
	private int grammer; 		//grammer score up to 30 points
	private int spelling;		//spelling score up to 20 points
	private int correctLength;	//length score up to 20 points
	private int content;		//content score up to 30 points
	private double totalGrade;
	public Essay() {

	}
	
	public Essay(int grammer, int spelling, int correctLength, int content, double totalGrade) {
		this.grammer = grammer;
		this.spelling = spelling;
		this.correctLength = correctLength;
		this.content = content;
		this.totalGrade = totalGrade;
	}

	public int getGrammer() {
		return grammer;
	}
	//sets grammer 1-30
	public void setGrammer(int grammer) {
		this.grammer = grammer;
	}
	
	public int getSpelling() {
		return spelling;
	}
	//sets spelling 1-20
	public void setSpelling(int spelling) {
		this.spelling = spelling;
	}
	public int getCorrectLength() {
		return correctLength;
	}
	public void setCorrectLength(int correctLength) {
		this.correctLength = correctLength;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	
	public void setTotalGrade() {
		totalGrade = grammer + spelling + correctLength + content;
	}
	public double getTotalGrade() {
		return totalGrade;
	}

}
