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

public class NestedLoopQuiz04re {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
	// 1. 정수 입력
	System.out.print("짝수 단은 0, 홀수 단은 1을 입력하세요... ");
	int userValue = input.nextInt();
	
	//2. 시작 단 설정 - if문으로 작성해보고 조건이 단 2개일 경우 삼항연산자 작성
	int startNum = (userValue == 0)? 2: 3;
	
	//3. FOR문으로 구구단 작성
	for(int i=startNum;i<=9;i+=2) // i는 2씩 증가
		for(int j=1;j<=9;j++) {
			System.out.printf("%d * %d = %d\n", i, j, i*j);
		}
		//4. 메모리 해제
		input.close();

	}
	
}
	