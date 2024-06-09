// [노태윤] ========================

//
//==================================
//

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
		Scanner scan = new Scanner(System.in);
		System.out.printf("1~10 사이의 정수 입력 : "); // 반복문안에다 작성해두됨 두번작성안해도된다
		int userValue = scan.nextInt();
		// 변수를 먼저 선언하는게 좋음 반복문에 변수선언하기보다는
		// 그래서 userValue = scan.nextInt();
		
		//1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
		while(true) {
			if(userValue>10 || userValue<1) { // 작은수가 앞에 오는게좋으며 괄호를(>= , <= 로바꿈)
				System.out.printf("1~10 사이의 정수 입력 : "); // if문위로 올리는게 좋아보인다.
				userValue = scan.nextInt();
				
			}else {
				break; // break; 대신 System.out.println("잘못된 입력입니다. 1~10 사이의 정수를 입력해주세요.");
				//를 입력해준다
		}
	  }
		// else 에 괄호를 안해서 제대로 괄호를 써야함
		
		//1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
		int result = 1;
		for(int i = 1; i<=userValue; i++) {
			result*=i;
		}
		
		System.out.printf("%d! : %d", userValue, result);
	}
		// 스캐너를 닫아줘야한다 scan.close();
}
