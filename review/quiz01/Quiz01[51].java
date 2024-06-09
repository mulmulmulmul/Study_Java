/*
 * [정은경] ===================================================== 
 * - main메서드 실행 시 사용자가 정수를 입력하면 파일 실행이 종료됩니다.
 * - main메서드에서 정수 입력을 반복문으로 만들고, 사용자의 입력값에 따라 탈출하도록 작성한 뒤 
 *   정의한 factorial(int userValue) 메소드를 호출해야 합니다.
 */

//		사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하려고 한다.
//		단, 입력 값은 1에서 부터 10까지의 정수만 입력되도록 한다.
//		만약 1~10 이외의 값을 입력하면, 다시 입력 받도록 한다.
//
//		1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
//		1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
//		1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]

import java.util.Scanner;

public class Quiz01 {
	
	public static void factorial(int userValue) {
		int factorial = 1;
		
		for(int i=1; i<=userValue; i++) {
			factorial = factorial * i;
		}
		
		System.out.printf("%d! = %d\n", userValue, factorial);
	}
	

	public static void main(String[] args) { 
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10사이의 정수 1개 입력 >> ");
		int userValue = input.nextInt();
		
		input.close();
			
	}

}
