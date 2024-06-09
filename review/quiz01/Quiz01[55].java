/*
 * [정은경] ===========================================
 * - 사용자가 1~10 사이의 정수를 입력하지 않았을 경우, 입력이 다시 실행되도록 반복문 코드 작성해야 합니다.
 * - 사용자가 입력한 정수값을 가지고 팩토리얼값을 구하는 코드 작성해야 합니다. (반복문 또는 메소드 정의)
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
