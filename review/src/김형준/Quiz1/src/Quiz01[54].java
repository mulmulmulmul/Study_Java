/*
 * [김형준]
 * factorial에서 num아 아닌 userValue를 받아야 맞는 것 같은데
 * num을 받으면서 팩토리얼 값이 잘못 출력 되는 것 같다
 */

import java.util.Scanner;

public class Quiz01 {

	public static int factorial (int num) {
		 int factorial = 1;
		 for( int i =1; i<num ; i++) {
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
			
			if (userValue<1 || userValue>10) {
			} else {
				break;
			}
		}

		System.out.println(userValue+"! : " + factorial(userValue));
		input.close();
	}

}
