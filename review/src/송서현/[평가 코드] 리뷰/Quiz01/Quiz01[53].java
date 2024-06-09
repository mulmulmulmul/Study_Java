/*
 [송서현] =========================================
  
    1. "1~10 사이의 정수 입력 : "이란 표현보다 
  	  "1~10 사이의 정수 다시 입력해주세요."라는 
  	  표현이 더 적당한 것 같습니다.   
   2. 마지막에 input.close();가 없는것 같습니다.
  =================================================
  
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("1~10 사이의 정수 입력 : ");
			int userValue = input.nextInt();
			if(userValue<=10 && userValue>=1 ) {
				System.out.println(userValue+"! = " + factorial(userValue));
				break;
			}
		}

	}
	public static int factorial(int num) {
		if(num==1)
			return 1;
		else
			return num * factorial(num-1);
	}

}
