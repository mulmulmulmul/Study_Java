
/*
 [송서현] =========================================
  
   1. "1~10 사이의 정수 입력 : "이란 표현보다 
  	  "1~10 사이의 정수 다시 입력해주세요."라는 
  	  표현이 더 적당한 것 같습니다. 
 	
 	2. 2중 while문 보다 심플하게 "userValue >= 1 && userValue <= 10"
 		하면 더 좋을 것 같습니다.
    =================================================
  
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		
		while(true) {
			if(userValue > 10) {
				System.out.println("다시입력하세요. ");
				userValue = input.nextInt();
				continue;
			} else if (userValue <= 1) {
				System.out.println("다시입력하세요");
				userValue = input.nextInt();
				continue;
			} else {
				num = userValue;
				break;
			}
		}
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}	
		
		System.out.println(num + "! : " + result);
	}

}
