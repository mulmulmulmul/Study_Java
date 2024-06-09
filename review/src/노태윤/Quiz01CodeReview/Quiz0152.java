// 노태윤================
//=======================

import java.util.Scanner;
public class Quiz0152 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("정수 1개를 입력하세요");
		int userValue = input.nextInt();
		
		
		// 조건문을 반복문안에 넣는게좋아보임 그리고 1~10 정수를 입력하지않았을때 다시 출력을하는게없음
		if (userValue < 10);
		System.out.println("정수 1개를 입력하세요");
		
		// 조건문은 2개가 맞는것같다. 1~10이 거나 아니거나
		if (userValue == 1) 
			System.out.println(userValue + "! : " + "1");
		else if (userValue == 2)
			System.out.println(userValue + "! : " + "2");
		else if (userValue == 3)
			System.out.println(userValue + "! : " + "6");
		else if (userValue == 4)
			System.out.println(userValue + "! : " + "24");
		else if (userValue == 5)
			System.out.println(userValue + "! : " + "120");
		else if (userValue == 6)
			System.out.println(userValue + "! : " + "720");
		else if (userValue == 7)
			System.out.println(userValue + "! : " + "5040");
		else if (userValue == 8)
			System.out.println(userValue + "! : " + "40320");
		else if (userValue == 9)
			System.out.println(userValue + "! : " + "362880");
		else if (userValue == 10)
			System.out.println(userValue + "! : " + "3628800");
	 // 팩토리얼 출력하는 함수가없다.
	}
	 // 스캐너를 닫아줘야함
}

