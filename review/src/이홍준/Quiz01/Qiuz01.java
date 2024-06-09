/*
 * [이홍준] 코드리뷰 =============================
 * System.out.print("1~10 사이의 정수 입력 : "); : 반복되므로 
 * while문 안에서만 반복될 수 있도록
 * 입력값을 저장하는 변수를 변수선언과 동시에 0으로 초기화를 시킨다음 
 *  while문 안에서 문구출력과 같이 입력 받을 수 있도록 하며 
 *  횟수가 정해지지 않았기 때문에 무한루프를 통해 진행해주는 것이 좋을 것으로 보입니다.
 *  while(true)를 통해 while문 안에 if문으로 조건을 넣어주며 break를 통해 해당조건 만족이 되면
 *  조건을 빠져나와 팩토리얼 계산 부분으로 넘어가도록 하는게 좋지만 
 *  조건이 간단하기때문에 while문에 조건을 넣어주는 방법도 좋을 것 같습니다
 *  	while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
 * 
 */

import java.util.Scanner;

public class Qiuz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		while(userValue < 1 || userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
		}
		
		int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result = result * i;
		}
		System.out.printf("%d! : %d", userValue, result);
		
		input.close();
	}

}
