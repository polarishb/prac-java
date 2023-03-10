package problem;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		char grade;
		int score;
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
//		grade = (score >= 90) ? 'A' : 'B';
		
		if ( score >= 90) grade = 'A';
		else grade = 'B';
		
		System.out.println(grade);
	}

}
