package Quiz01;

//[임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다. 
// userValue가 1일 때 팩토리얼이 종료될 수 있도록 return 1;을 쓰신 점이 좋았습니다.

import java.util.Scanner;

public class Quiz0149 {
	
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
