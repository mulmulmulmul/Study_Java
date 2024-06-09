/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> X
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> X
 * 
 * 평가 : 1. 변수 이름(factorial로 하기 보다는 result라고 하는 편이 더 나았을 것 같음)
 * 
 * 
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
