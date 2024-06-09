/*
 * [김현빈] ===================================
 * 멋져요
 */
package quiz1;

import java.util.Scanner;

public class Quiz0103 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userValue;

		do {
			System.out.print("1~10사이의 정수 입력 : ");
			userValue = input.nextInt();
		} while (userValue < 1 || userValue > 10);

		System.out.printf("%d! : %d\n", userValue, fact(userValue));
		input.close();

	}

	static int fact(int num) {
		int factorial;
		if (num == 1) {
			factorial = 1;
		} else {
			factorial = num * fact(num - 1);
		}

		return factorial;
	}

}
