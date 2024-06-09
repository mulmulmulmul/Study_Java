package quiz1;
/*
 * [김현빈] ===================================
 * 팩토리얼문을 재귀함수로 구현 가능
 * if문안에 팩토리얼 계산식을 넣어 간략화 할 수 있음
 * do-while 사용 가능
 */
import java.util.Scanner;

public class Quiz117 {

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
