
/*
 [송서현] =========================================
  
  1. "1~10 사이의 정수 입력 : "이란 표현보다 
  	 "1~10 사이의 정수 다시 입력해주세요."라는 
  	 표현이 더 적당한 것 같습니다. 
  	 
 
  =================================================
  
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
