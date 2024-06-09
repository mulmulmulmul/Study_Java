/*
 * [문항1]  사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하려고 한다.
단, 입력 값은 1에서 부터 10까지의 정수만 입력되도록 한다.
만약 1~10 이외의 값을 입력하면, 다시 입력 받도록 한다.

1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]

 */

//노태윤=================
//
//============================
import java.util.Scanner;

public class Quiz0146 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 위에 변수선언을 우선해야함 int userValue; 이값에 우리가 값을 넣어야하기때문
		
		// while문 반복문 작성을해서 if문을 안에넣는게 좋아보임 반복이실행이 되지않고있다
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		// 필요없는 코드작성 입력받은 정수를 우린 알지않아도되며 그 팩토리얼값이 궁금하기때문
		System.out.println("입력받은 정수 >> " + userValue);
		
		if(userValue >=1 && userValue <= 10 ) {
			System.out.println();
		} else {
			System.out.println("다시 입력 해주세요.");
		} // if문에 break;를 넣고 아닌경우 위로돌아가서 1~10을 출력하라고만들어야함
		// } 다시 닫아줘야함
	
		// 그리고 팩토리얼이 출력되는 코드작성이필요함
		// int result = 1; // 변수선언
		// for (int i = 1; i < = userValue; i++) {
		// result *= i;
		// }  // 반복문 작성 for문으로 
		
		// !과 : 를 출력하고 값을 출력하는 sysout코드.
		input.close();

		
	}

}
