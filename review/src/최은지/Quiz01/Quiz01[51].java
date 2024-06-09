/*
 * [최은지]================================================
 * 
 * 정수값을 입력받고 조건식 검사가 먼저 이루어져야 합니다.
 * 
 * 팩토리얼 값을 계산하는 코드 작성이 적절하게 이루어지지 않음.
 * -메인 메소드내, 조건식 검사가 끝난 값 
 *    -> 호출을 통해 누적곱 값 계산이 필요.	
 * -또는 메인 메소드 내 새로운 반복문 작성을 통해 계산 가능.
 *======================================================
 * 
 */

import java.util.Scanner;

public class Quiz01 {
	
	public static void factorial(int userValue) {
		int factorial = 1;
		
		for(int i=1; i<=userValue; i++) {
			factorial = factorial * i;
		}
		
		System.out.printf("%d! = %d\n", userValue, factorial);
	}
	

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10사이의 정수 1개 입력 >> ");
		int userValue = input.nextInt();
		
		input.close();
			
	}

}
