
/*
 [송서현] =========================================
  
  1. else 뒤에 { 이 없는것 같습니다.  
  2. "1~10 사이의 정수 입력 : "이란 표현보다 
  	 "1~10 사이의 정수 다시 입력해주세요."라는 
  	 표현이 더 적당한 것 같습니다. 
  3. 마지막에 scan.close(); 가 없는것 같습니다.
  =================================================
  
 */


import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
		Scanner scan = new Scanner(System.in);
		System.out.printf("1~10 사이의 정수 입력 : ");
		int userValue = scan.nextInt();
		
		//1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
		while(true) {
			if(userValue>10 || userValue<1) {
				System.out.printf("1~10 사이의 정수 입력 : ");
				userValue = scan.nextInt();
				
			}else
				break;
		}

		
		//1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
		int result = 1;
		for(int i = 1; i<=userValue; i++) {
			result*=i;
		}
		
		System.out.printf("%d! : %d", userValue, result);
	}

}
