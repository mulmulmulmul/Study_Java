/*
 * [정은경] =========================================================
 * - main메서드는 하나만 존재해야 합니다. ---> 자바 파일 실행 시 main메서드를 찾아가 실행하기 때문에 팩토리얼 출력 코드가 먼저 실행되고 끝남
 * - 입력문구 출력과 input.nextInt()메소드는 사용자가 1~10 이외의 정수를 입력할 경우 다시 실행되어야 하므로 반복문으로 작성해야 합니다.
 * - int num1, int num2 변수는 필요하지 않습니다. 조건식에는 userValue 사용
 * - if문의 조건식 부적절 ---> useValue가 1이상, 10이하일 경우 팩토리얼 값을 출력해야 함
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main1(String[] args) {
//		[메서드 정의]
//		사용자에게 정수 2개를 받아 팩토리얼 값을 구하려고 한다.	
//		입력 값은 1에서부터 10까지의 정수만 가능하다.
//		만약 1~10 이외의 값을 입력하면 다시 입력 받도록 한다.
		
//		[1-1] 정수형 userValue를 선언하여, 사용자에게 정수 1개 입력 받아 저장하기
		
//		1-1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
//		1-2. 정수 1개 입력 및 출력
		System.out.print("정수 1개 입력하세요");
		int UservalueOne = input.nextInt();
				
//		[1-2] 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하기
		int num1 = 15; 
		if(num1>=11 && num1<=20) {
			System.out.println("다시 입력하세요");
		
		int num2 = 22;
		if(num2>=20) {
			System.out.println("다시 입력하세요");
					
		}
		
		}
//      [1-3] 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하기		
		public static int factorial(int num) {
			if(num == 1)
				return 1;
			else
				return num * factorial(num-1);
		}
		
		public static void main(String[] args) {
			System.out.println("10! = " + factorial(10));
		}
				
		
}

}

