
public class CourseGradesLauncher {

	public static void main(String[] args) {
		CourseGrades tests = new CourseGrades();
		GradedActivity lab = new GradedActivity(90);
		GradedActivity passFailExam = new GradedActivity(75);
		GradedActivity essay1 = new GradedActivity(90);
		GradedActivity finalExam = new GradedActivity(100);
		tests.setLab(lab);
		tests.setPassFailExam(passFailExam);
		tests.setEssay(essay1);
		tests.setFinalExam(finalExam);
		System.out.print(tests);
	}
}
