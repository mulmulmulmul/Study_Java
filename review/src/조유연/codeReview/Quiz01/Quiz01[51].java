/*
 * [조유연]
 * 1. main() 함수에서 factorial 함수를 호출하지 않았습니다.
 * 2. 사용자의 입력값에 따라 다른 반응을 보이는 프로그램을 설계하지 않았습니다.
 */

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
