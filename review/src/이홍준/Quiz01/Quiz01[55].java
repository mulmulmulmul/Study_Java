/*
 * [이홍준] 코드리뷰 ============================
 * 1. 해당 문제는 반복문을 통해 작성되어야 합니다. 
 * 작성해주신 코드는 정수를 입력받은 후 판별만 하는 코드입니다.
 * 
 * 반복문은 for, while, do~while 이 사용되어야 하며 
 * 반복문을 통해 1~10사이의 정수를 판별하여야 합니다. 
 * // while =================================
//		while(userValue < 1 || userValue > 10) {
//			System.out.print("1~10 사이의 정수 입력 : ");
//			userValue = input.nextInt();
//		}
		// while(true) ===========================
//		while(true) {
//			System.out.printf("1~10 사이의 정수 입력 : ");
//			userValue = input.nextInt();
//			
//			if(userValue >= 1 && userValue <= 10)
//				break;
//		}
		// do~while ==============================
//		do {
//			System.out.print("1~10사이의 정수 입력 : ");
//			userValue = input.nextInt();
//		} while(userValue<1 || userValue >10);
//		
 * 2. 판별된 userValue는 팩토리얼 계산을 해야됩니다.
 * 방법은 두가지 입니다.
 * for의 재귀메소드를 사용하여 호출하는 방법과 
 * 일반 for문을 사용하는 방법이 있습니다.
 * 
 * // for문
		int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result *= i;
		}
 * // 재귀메소드
//	public static int fact(int num) {
//		int factorial;
//		if(num==1) {
//			factorial = 1;
//		} else { 
//			factorial = num *fact(num-1);
//		}
//		
//		return factorial;
//	}
 */


import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//1번
		Scanner input = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력하세요.");
		int userValue = input.nextInt();
		
		if(userValue <= 10) {
			System.out.println("1~10사이의 정수입니다");
		} else if(userValue != 10) {
			System.out.println("1~10사이의 정수가 아닙니다");
		}
		
		
		input.close();
	}
		
}
