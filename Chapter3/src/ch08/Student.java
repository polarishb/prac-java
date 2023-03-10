package ch08;

public class Student {

	private int studentId;
	private String studentName;
	
	Subject math;
	Subject korean;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(String subjectName, int score) {
		korean.subjectName = subjectName;
		korean.score = score;
	}
	
	public void setMathSubject(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korean.score + math.score;
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�.");
	}

	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
}
