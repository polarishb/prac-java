package ch04;

public class StudnetTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Compose", "Lee");
		studentLee.studentAddress = "Seoul";
		
		Student studentKim = new Student(101, "Twosome", "Kim");
		studentKim.studentAddress = "New York";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentLee.getStudentName());
		System.out.println(studentKim);
		System.out.println(studentKim.getStudentName());
	}

}
