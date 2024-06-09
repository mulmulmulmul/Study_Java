/*
 * [이홍준] 코드리뷰 ===============================
 * 	
 * 1. do ~ while 은 잘 사용해주신것 같습니다.
 * 2. userValue 선언 시 초기화를 해주지 않은 경우 쓰레기값이 저장이 되기 때문에
 * 		굳이 해줄 필요는 없을 것 같지만 초기화를 해주는 것이 좋을 것 같습니다.
 * 3. 재귀함수 사용한 메소드를 활용하신 것도 좋은 방법인 것 같습니다.
 * 
 */

import java.util.Scanner;

public class Quiz01 {
	
	public static int fact(int num) {
		int factorial;
		if(num==1) {
			factorial = 1;
		} else { 
			factorial = num *fact(num-1);
		}
		
		return factorial;
	}
		
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int userValue;
		
		do {
			System.out.print("1~10사이의 정수 입력 : ");
			userValue = input.nextInt();
		} while(userValue<1 || userValue >10);
		
		System.out.printf("%d! : %d\n",userValue,fact(userValue));
		input.close();
		
	}
	
//	static int fact(int num) {
//		int factorial;
//		if(num==1) {
//			factorial = 1;
//		} else { 
//			factorial = num *fact(num-1);
//		}
//		
//		return factorial;
//	}

}
