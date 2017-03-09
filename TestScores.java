
public class TestScores {
	//variables
private double test1;
private double test2;
private double test3;
private double grade;
//constructor with arguments for test 1, 2, and 3 scores
	public TestScores(double a, double b, double c) {
		this.test1 = a;
		this.test2 = b;
		this.test3 = c;
	}
//method to find out average between the 3 tests.
public double averageTest() {
	return (test1 + test2 + test3) / 3.0;
}

public String letterGrade(double a) {
	this.grade = a;
	String letterGrade = "";
	if (grade >= 90) {
		letterGrade = "A";
	} else if (grade >= 80) {
		letterGrade = "B";
	} else if (grade >= 70) {
		letterGrade = "C";
	} else if (grade >= 60) {
		letterGrade = "D";
	} else {
		letterGrade = "F";
	}
	return letterGrade;
}


}
