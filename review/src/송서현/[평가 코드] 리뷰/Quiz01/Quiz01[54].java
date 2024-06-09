/*
 [송서현] =========================================
  
    1. "1~10 사이의 정수 입력 : "이란 표현보다 
  	  "1~10 사이의 정수 다시 입력해주세요."라는 
  	  표현이 더 적당한 것 같습니다.   
    2. 결과깂이 이상한것 같습니다.4,5등을 입력할 경우. 
   	3. 범위 1~10사이에서 1과 10은 포함해야 할 것 같습니다.
   
  =================================================
  
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
