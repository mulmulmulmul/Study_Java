package Quiz01;


// [임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다. 
// while 루프를 사용하여 1 ~ 10까지의 정수 입력 후 for문 사용하여 factorial 값을 잘 나타내었습니다.

import java.util.Scanner;

public class Quiz100 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userValue = 0;
		int factorial = 1;

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
