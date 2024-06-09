/*
 * [문제]
 * 짝수 단과 홀수 단을 출력하시오.
 * 사용자가 0을 입력하면, 짝수 단 출력
 * 사용자가 1을 입력하면, 홀수 단 출력

 * [입력 형태]
 * 짝수 단은 0, 홀수 단은 1을 입력하세요... 1
 * 
 * [출력 형태]
 * 3 * 1 = 3
 * ...
 * 
 * 5 * 1 = 5
 * ...
 * 
 * 9 * 9 = 81
 */

import java.util.Scanner;

public class NestedLoopQuiz04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// 1. 정수 1개 입력
		System.out.print("짝수 단은 0, 홀수 단은 1을 입력하세요... ");
		int user = input.nextInt();

		// 2. 시작 단 구분
		int choice = (user == 0) ? 2 : 3;
		
		// 3. 구구단 출력
		for(int a=choice; a<=9; a+=2) { // 홀수단, 짝수단 구분을 위해 출력 후 a = a + 2 
			for(int b=1; b<=9; b++)
				System.out.printf("%d * %d = %d\n", a, b, a*b);
			System.out.println(); // 단 사이에 화이트라인 생성
		}
		
		// 3. 자원 해제
		input.close();
		
	}
	
}	

// 2. 시작 단 구분
//		if(user == 0)
//			choice = 2; // 2단부터 시작
//		else
//			choice = 3; // 3단부터 시작

//				if(user == 0) { // 짝수 단
//				} else { // 홀수 단
//					System.out.printf("%d * %d = %d\n", choice, b, choice*b); //3단부터 시작
//				}