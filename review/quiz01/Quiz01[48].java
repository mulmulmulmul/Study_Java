/*
 * [정은경] =========================================================
 * - 정수 입력을 받는 input.nextInt()도 반복문 내에 들어가야 합니다.
 * - while문의 조건식 부적절 ---> useValue는 1~10에 해당할 때 팩토리얼 출력
 */

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			return;
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
		}
		
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
