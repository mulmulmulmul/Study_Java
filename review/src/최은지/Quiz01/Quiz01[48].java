/*
 * [최은지]================================================================
 * 
 * 첫번째 while문 정수 입력 조건에 음수와 0에 대한 입력값 조건 검사가 빠졌습니다.
 * 반복문 내에 값 입력에 대한 코드가 작성되지 않아, 
 * 값을 한번 입력하면 반복문을 빠져나와서
 * 1~10외 정수를 입력하였을 때 재입력이 불가합니다.
 *
 * =========================================================================
 */

import java.util.Scanner;

public class Quiz01[48] {
	
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

