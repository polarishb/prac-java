package ch08;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1, "Lee");
		studentLee.setKoreanSubject("Korean", 100);
		studentLee.setMathSubject("Math", 90);
		
		Student studentKim = new Student(2, "Kim");
		studentKim.setKoreanSubject("Korean", 80);
		studentKim.setMathSubject("Math", 99);

		studentKim.showStudentScore();
		studentLee.showStudentScore();
	}
}
