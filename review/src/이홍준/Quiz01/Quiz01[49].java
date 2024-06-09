/*
 * [이홍준] 코드리뷰 =======================
 * 재귀 메소드도 잘 사용하셨고 while문도 적절하게 잘 사용하셨습니다.
 * 
 * while문의 다른 경우도 공유드립니다.
 * // while =================================
//		while(userValue < 1 || userValue > 10) {
//			System.out.print("1~10 사이의 정수 입력 : ");
//			userValue = input.nextInt();
//		}
 * // do~while ==============================
//		do {
//			System.out.print("1~10사이의 정수 입력 : ");
//			userValue = input.nextInt();
//		} while(userValue<1 || userValue >10);
//		
 * 
 */

import java.util.Scanner;

public class Quiz01 {
	
	public static int factorial(int userValue) {
		if (userValue == 1) {
			return 1;
		} else {
			return userValue * factorial(userValue-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
			break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		
		input.close();
	}
	
}
