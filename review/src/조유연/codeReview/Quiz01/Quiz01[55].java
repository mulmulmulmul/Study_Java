/*
 * [조유연]
 * 1. for문, while문, 메서드 등을 사용하지 못했습니다.
 * 2. 입력값의 범위에 따른 프로그램의 반응을 구현하지 못했습니다.
 * 3. factorial 과 관련된 코드가 전혀 작성되지 않았습니다.
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//1번
		Scanner input = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력하세요.");
		int userValue = input.nextInt();
		
		if(userValue <= 10) {
			System.out.println("1~10사이의 정수입니다");
		} else if(userValue != 10) {
			System.out.println("1~10사이의 정수가 아닙니다");
		}
		
		
		input.close();
	}
		
}
