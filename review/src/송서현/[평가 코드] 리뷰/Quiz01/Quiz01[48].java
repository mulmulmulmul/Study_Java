
/*
 [송서현] =========================================
  
  1. "1~10 사이의 정수 입력 : "이란 표현보다 
  	 "1~10 사이의 정수 다시 입력해주세요."라는 
  	 표현이 더 적당한 것 같습니다. 
  2. 정수 아닌 숫자를 입력하고 다시 입력했을 시 
  	 입력이 안된거 같습니다.
 
  =================================================
  
 */

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			return;
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
		}
		
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
