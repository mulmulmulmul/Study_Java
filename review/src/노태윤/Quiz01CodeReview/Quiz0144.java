//노태윤============================
//
//==================================
//=====================================

import java.util.Scanner;

public class Quiz0144 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		// 변수 선언을 밖에서하는게 좋음 (good)
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		// 이거를 굳이안쓰고 while문안에 넣어두됨
		
		while(true) {
			if(userValue > 10) {
				System.out.println("다시입력하세요. ");
				userValue = input.nextInt();
				continue; // continue는 굳이 쓰지않아도 되고,
						  // 다시입력하세요 대신 1~10까지 정수를 입력하세요 를 써야함
			} else if (userValue <= 1) { // 조건문에서  3가지조건대신 2가지조건으로 줄일수있다.
										 // 2가지조건 1번 1~10사이거나 2번 아니거나
				System.out.println("다시입력하세요");
				userValue = input.nextInt();
				continue;
			} else {
				num = userValue; //반복문안에서 변수선언은 좋지않습니다
				break;
			}
		}
		// 여기다 int result = 1; 을 적는게좋아보임
		for(int i = 1; i <= num; i++) {
			result *= i;
		}	
		
		System.out.println(num + "! : " + result);
	}

}
