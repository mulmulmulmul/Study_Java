/*
 * [최은지]===============================================================
 * 
 * 입력 받은 정수에 대해 팩토리얼 값을 계산하는 코드가 작성되지 않았습니다.

 * ========================================================================
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
