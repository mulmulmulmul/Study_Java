/*
 * [양한재]=====================
 * 입력 받은 uservalue가 쓰이지 않았습니다.
 * 그리고, 1-2에서 조건문의 범위가 
 * 왜 11~20, 20 이상인지 잘 모르겠습니다.
 * 다시 입력하세요 출력 뒤에, uservalue를 입력받는 코드가 없습니다.
 * =============================
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

