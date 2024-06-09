package test;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1. 컴퓨터 : 랜덤값 생성
		int random = (int)(Math.random()*10)+1;
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		
		int count = 0;
		int userValue;
		
		// 2. 무한 루프
		//	  반복문 구현 : 사용자 값 입력, 비교 후 출력
		while(true) {
			count++;
			
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();

			if(random>userValue) {
				System.out.println("컴퓨터의 숫자가 큽니다.");
			} else if (random<userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (random == userValue) { // 같니 비교는 나머지. else if 필요 x
				System.out.println(count + "번만에 정답입니다.");
				break;
			}
			
		}
		// 3. 횟수 출력
		
		input.close();
	}

}