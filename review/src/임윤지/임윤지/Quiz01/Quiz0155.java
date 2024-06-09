package Quiz01;


// [임윤지]
// 값 출력이 나오지 않습니다.
// 1~10 사이의 정수를 입력하고 팩토리얼을 출력하는 메서드가 없습니다.

import java.util.Scanner;

public class Quiz0155 {

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
