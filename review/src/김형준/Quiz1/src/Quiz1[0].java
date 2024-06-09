/*
 * [김형준]
 * while 문을 무한루프로 돌리고 if 문으로 탈출 조건을 
 * 설정하여 빠져나오고 factorial 값을 구하는 것까지
 * 코드도 길지 않고 간결하게 잘 짜인 것 같다.
 */

import java.util.Scanner;

public class Quiz1 {

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
