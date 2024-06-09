//=========================
//노태윤
//========================

import java.util.Scanner;

public class Quiz0142 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int userValue;
		
		do {
			System.out.print("1~10사이의 정수 입력 : ");
			userValue = input.nextInt();
		} while(userValue < 1 || userValue > 10);
		
		System.out.printf("%d! : %d\n",userValue,fact(userValue));
		input.close();
		
	}
		// 팩토리얼을 출력하는 코드를 심플하게 쓸수있을것같다.
		//	 int result = 1;
		//   for (int i = 1; i <= userValue; i++) {
		//       result *= i;
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
