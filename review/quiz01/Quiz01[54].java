/*
 * [정은경]===================================================
 */

import java.util.Scanner;

public class Quiz01 {

	public static int factorial (int num) {
		 int factorial = 1;
		 for( int i =1; i<num ; i++) { // 조건식은 i<=num 이어야 함
			 factorial = factorial * i;
		 }
		return factorial;
		 
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if (userValue<1 || userValue>10) { // 탈출문 if의 조건식 --> userValue >= 1 && userValue <= 10
			} else { // 조건식을 위와같이 작성했다면 else문 없이 break 바로 작성하면 될 것 같습니다. 
				break;
			}
		}

		System.out.println(userValue+"! : " + factorial(userValue));
		input.close();
	}

}
