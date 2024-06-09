/*
 * [정은경] 코드리뷰 ===================================================
 * - 1. 정수 입력 문구와 2. 입력 정수 변수에 저장 은 다시 실행되어야 하므로 반복문으로 작성해야 합니다.
 * - while 무한반복문은 탈출문을 만나기 전까지 명령어가 반복되므로, 반복문 안에서 따로 if문을 작성하지 않아도 됩니다.
 *   (무한반복문 안에서 if문은 탈출조건으로 작성)
 * - scan.close()로 자원해제 해줘야 합니다.
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
		Scanner scan = new Scanner(System.in);
		System.out.printf("1~10 사이의 정수 입력 : ");
		int userValue = scan.nextInt();
		
		//1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
		while(true) {
			if(userValue>10 || userValue<1) {
				System.out.printf("1~10 사이의 정수 입력 : ");
				userValue = scan.nextInt();
				
			}else
				break;
		}
		
		//1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
		int result = 1;
		for(int i = 1; i<=userValue; i++) {
			result*=i;
		}
		
		System.out.printf("%d! : %d", userValue, result);
	}

}
