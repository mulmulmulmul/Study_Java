/*
 * [정은경] 코드리뷰 ===================================================
 * - 1. 정수 입력 문구와 2. 입력 정수 변수에 저장 은 다시 실행되어야 하므로 반복문으로 작성해야 합니다.
 * - 무한루프와 break;를 사용해 작성하면 좋을 것 같습니다.
 *   while(true) {
 *   	System.out.print("1~10 사이의 정수 입력 : ");
		userValue = input.nextInt();
 *   	if (userValue <= 1 || userValue >= 10) 
 *      break;
 *     	}
 * - result *= i; 증감식으로 사용해도 됩니다.
 */

import java.util.Scanner;

public class Qiuz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		while(userValue < 1 || userValue > 10) { 
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
		}
		
		int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			// result *= i; 증감식 사용
			result = result * i;
		}
		System.out.printf("%d! : %d", userValue, result);
		
		input.close();
	}

}
