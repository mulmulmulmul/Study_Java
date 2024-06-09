import java.util.Scanner;

/* [소국진] ===============================
 * 
 * 
 * 안녕하세요.
 * 
 * 팩토리얼을 굳이 재귀함수를 쓰지 않고 간단하게 작성하셔서 가독성이 좋습니다.
 * 
 * 다만 강사님 말을 따라서, 실행 코드가 한 줄일 때 괄호를 생략해주시면 더 좋을 것 같습니다.
 * 
 * 전체적으로 잘 읽히는 코드라고 생각합니다. 고생하셨습니다.
 * 
 */

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
