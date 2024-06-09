/*
 * [정은경] ===================================================
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		
		// 리뷰 : 입력문구와 input.nextInt()를 무한루프 시키고, 정수가 1~10에 해당하는 값일 때 탈출시키면 더 간결하게 코드작성 가능할 것 같습니다.
		while(true) {
			// 리뷰 : userValue > 10, userValue <=1 ---> 논리연산자를 사용해 userValue < 1 || userValue > 10로 작성 가능 
			if(userValue > 10) {
				System.out.println("다시입력하세요. ");
				userValue = input.nextInt();
				continue; 
			} else if (userValue <= 1) {
				System.out.println("다시입력하세요");
				userValue = input.nextInt();
				continue;
			} else {
				num = userValue;
				break;
			}
		}
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}	
		
		System.out.println(num + "! : " + result);
		
		// 리뷰 : Scanner 객체 자원 해제해줘야 합니다
	}

}
