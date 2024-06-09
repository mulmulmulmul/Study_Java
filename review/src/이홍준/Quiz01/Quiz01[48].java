/*
 * [이홍준] 코드리뷰 =======================
 *  1. 첫번째 while문은 1~10사이의 정수를 판별하는 코드가 작성되어야 합니다.
 *    
 *  반복문의 종류는 for, while, do~while 이 있으며 아래 처럼 사용이 됩니다.
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
 * 
 * 2. 두번째 while문은 팩토리얼 계산을 하는 코드로 보입니다만... while문 보다는
 * 		for문을 통해 작성하면서 재귀 메소드를 작성하셔서 메소드를 호출시키는 방법과
 * 		아래처럼 사용하셔도 됩니다.
 * 	int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result *= i;
		}
 * 
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
