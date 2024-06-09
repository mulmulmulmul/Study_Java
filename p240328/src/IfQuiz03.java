/*
 * [문제]=============================
 * 사용자에게 정수 2개를 입력받은 후,
 * 큰 값과 작은 값을 출력하시오.
 * 
 * << 입력 형태 >>
 * 정수 2개를 입력하세요...
 * 
 * << 출력 형태 >>
 * 큰 값 : , 작은 값 :  
 * ===================================
 */

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

//		// 1. Scanner 객체 생성
//		Scanner input = new Scanner(System.in); 
//		
//		// 2. 정수 2개 입력
//		System.out.print("정수 2개를 입력하세요...");
//		int numOne = input.nextInt();
//		int numTwo = input.nextInt();
//		
//		// 3. 큰 값, 작은 값 찾아서 출력
//		if (numOne < numTwo) {
//			System.out.println("큰 값 : " + numTwo + ", 작은 값 : " + numOne);
//		} else if (numOne > numTwo) {
//			System.out.println("큰 값 : " + numOne + ", 작은 값 : " + numTwo);
//		}
//		
//		input.close();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요... ");
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		
		if (numOne > numTwo) {
			System.out.printf("큰 값 : %d, 작은 값 : %d", numOne, numTwo);
		} else if (numOne < numTwo) {
			System.out.printf("큰 값 : %d, 작은 값 : %d", numTwo, numOne);
		} else {
			System.out.println("값이 일치합니다.");
		}
		
		input.close();
	}

}
