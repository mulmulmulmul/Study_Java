/*
 * [김형준]
 * do while 문으로 정수를 입력받아 조건문을 만들고
 * 재귀함수로 factorial 을 써서 코드를 간략히
 * 잘 짜신 것 같다.
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int userValue;
		
		do {
			System.out.print("1~10사이의 정수 입력 : ");
			userValue = input.nextInt();
		} while(userValue<1 || userValue >10);
		
		System.out.printf("%d! : %d\n",userValue,fact(userValue));
		input.close();
		
	}
	
	static int fact(int num) {
		int factorial;
		if(num==1) {
			factorial = 1;
		} else { 
			factorial = num *fact(num-1);
		}
		
		return factorial;
	}

}
