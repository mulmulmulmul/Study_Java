/*
 * [이홍준] 코드리뷰 ======================
 * 
 * 1. 문제는 "1~10까지의 정수를 입력하세요"를 반복하여 출력하게 하며 정수를 입력받는 형식이었습니다.
 * 	변수 선언까지는 문제 없었으나 while(true) 무한루프를 사용할 시 조건문은 1~10 사이의 정수를 
 *  입력을 받았을 때 팩토리얼 계산이므로 1~10 사이의 정수를 입력받았을때 반복문을 나오게끔 
 *  설정하는게 좋습니다.
 *  2. 조건은 연산자를 통해 && 또는 ||를 사용하여 간결하게 표시하는 것이 좋습니다.
 * while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		
		while(true) {
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
	}

}
