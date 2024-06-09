package test;
import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

/*
 * 지역변수 영역 유의
 */

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userValue = 0;
		int factorial = 1;
		
		// 1. 무한 루프 while문
//		while(true){
//			System.out.print("1~10 사이의 정수 입력 : ");
//			userValue = input.nextInt();
//			
//			// 탈출 조건
//			if(userValue<=10 && userValue>=1 ) 
//				break;
//		}
		
		// 2. 무한 루프 do~while문
		do {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
		} while (userValue < 1 || userValue > 10);
		
		input.close();
		
		// 1. 팩토리얼 출력 for문
		for(int i = 1; i <= userValue; i++) {
			factorial *= i; 
		}
			System.out.println(userValue + "! = " + factorial);
		
		// 2. factorial 재귀메소드 호출 
		
	}
	
}
