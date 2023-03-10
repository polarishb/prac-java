package problem;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

//		다이아몬드 출력
		
		System.out.println("How many: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int space = num / 2 + 1;
		int star = 1;
		
		for( int i = 0; i < num; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {
				System.out.print('*');
			}
			if( i < num/2) {
				space -= 1;
				star += 2;
			}
			else {
				space += 1;
				star -= 2;
			}
			System.out.println();
		}
	}
	
}
