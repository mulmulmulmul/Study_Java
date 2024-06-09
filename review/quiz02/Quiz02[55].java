/*
 * [정은경]==============================
 * - 랜덤값은 화면에 출력하지 않아도 됩니다.
 * - 사용자가 정수를 입력하고, 랜덤값과 비교-출력하는 반복문이 필요합니다.
 * - 반복문 실행 횟수 변수 count가 필요합니다.
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤값을 동일하게 입력하세요.");
		
		int userValue = input.nextInt();
		
		
		int random = (int)(Math.random() *10) + 1;
		System.out.println("1~10 랜덤값 : " + random);

		if(userValue == random) {
			System.out.println("%s번만에 정답입니다");
		} else if (userValue >= random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다");
		} else {
			System.out.println("컴퓨터의 숫자가 더 큽니다");
		}
		input.close();

		
	}

}
