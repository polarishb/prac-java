package ch04;

public class Student {

	int studentId;
	String studentNameFirst;
	String studentNameLast;
	String studentAddress;
	
	public Student() {}
	
	public Student(int studentId, String studentNameFirst, String studentNameLast) {
		this.studentId = studentId;
		this.studentNameFirst = studentNameFirst;
		this.studentNameLast = studentNameLast;
	}
	
	public void showStudentInfo() {
		System.out.println(getStudentName() + ", " + studentAddress);
	}
	
	public String getStudentName() {
		return studentNameFirst + " " + studentNameLast;
	}
	
	
}
