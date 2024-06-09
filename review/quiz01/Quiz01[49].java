/*
 * [정은경]==================================================
 */

import java.util.Scanner;

public class Quiz01 {
	
	// 리뷰 : factorila 메소드 정의 대신 for문 작성해도 됩니다ㅣ.
	public static int factorial(int userValue) {
		if (userValue == 1) {
			return 1; 
		} else { // 위에서 return을 사용했으므로 else문은 if문 밖으로 빼줘도 됩니다.
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
