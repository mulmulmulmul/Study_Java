/*
 * [이홍준] 코드리뷰 =======================
 *  1. 현재 코드는 반복문이 아닌 경우입니다. 또한 팩토리얼 부분도 작성이 되지 않았습니다.
 *  반복문을 사용할 경우 for, while, do~while 을 사용하는 것이 좋습니다.
 *  
 * 		 // while =================================
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
 *  
 *  
 *  2. 팩토리얼 부분은 for문을 사용하거나 재귀함수를 사용한 메소드를 생성하여 작성되어야 합니다.
 *  int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result *= i;
		}
 */



/*
 * [문항1]  사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하려고 한다.
단, 입력 값은 1에서 부터 10까지의 정수만 입력되도록 한다.
만약 1~10 이외의 값을 입력하면, 다시 입력 받도록 한다.

1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]

 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		System.out.println("입력받은 정수 >> " + userValue);
		
		if(userValue >=1 && userValue <= 10 ) {
			System.out.println();
		} else {
			System.out.println("다시 입력 해주세요.");
		}
	
		
		input.close();

		
	}

}
