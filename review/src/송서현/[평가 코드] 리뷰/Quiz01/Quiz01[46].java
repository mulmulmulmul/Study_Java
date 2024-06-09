/*
 [송서현] =========================================
  
	1. 결과값이 나오지 않았습니다.
	2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을
		작성하지 않았습니다.
	3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 
		작성하지 않았습니다.
		
  =================================================

 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		System.out.println("입력받은 정수 >> " + userValue);
		
		if(userValue >=1 && userValue <= 10 ) {
			System.out.println();
		} else {
			System.out.println("다시 입력 해주세요.");
		}
	
		
		input.close();

		
	}

}
