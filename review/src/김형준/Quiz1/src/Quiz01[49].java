/*
 * [김형준]
 * userValue에 입력된 값을 재귀함수로 factorial 코드를
 * 짠 것 같다.
 * if 문이 조금더 짧고 보기쉽게 코드를 짤 수 있는 것 같다. 
 */

import java.util.Scanner;

public class Quiz01 {
	
	public static int factorial(int userValue) {
		if (userValue == 1) {
			return 1;
		} else {
			return userValue * factorial(userValue-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
			break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		
		input.close();
	}
	
}
