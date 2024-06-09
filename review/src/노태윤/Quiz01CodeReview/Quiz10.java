//노태윤===================

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userValue = 0;
		int factorial = 1; // 이 코드를 재귀함수 위에다 쓰는게좋아보인다.

		while (true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = scanner.nextInt();

			if (userValue >= 1 && userValue <= 10) {
				break;
			} 
		}

		for (int i = 1; i <= userValue; i++) {
			factorial *= i;
		}
		System.out.println(userValue + "! : " + factorial);

		scanner.close();
	}

}
