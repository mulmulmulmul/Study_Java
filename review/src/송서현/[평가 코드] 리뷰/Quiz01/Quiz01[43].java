
/*
 [송서현] =========================================
  
   1. "1~10 사이의 정수 입력 : "이란 표현보다 
  	  "1~10 사이의 정수 다시 입력해주세요."라는 
  	  표현이 더 적당한 것 같습니다. 
 
    =================================================
  
 */


import java.util.Scanner;

public class Quiz01 {

	static int factorial(int num) {
		if(num == 1)
			return 1;
		
		return num * factorial(num-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int userValue;

		while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = sc.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		sc.close();
		
	}
}
