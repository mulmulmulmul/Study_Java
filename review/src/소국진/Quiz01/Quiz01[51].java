
//		사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하려고 한다.
//		단, 입력 값은 1에서 부터 10까지의 정수만 입력되도록 한다.
//		만약 1~10 이외의 값을 입력하면, 다시 입력 받도록 한다.
//
//		1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
//		1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
//		1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]

import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * 반복해서 글자를 표시하고, 입력을 받기 위해서 반복문을 사용하시면 좋을 것 같습니다.
 * 저는 몇 번을 반복해야 할지 모르기 때문에 for문 보다는 while을 통해 무한루프로 작성했고
 * 조건이 맞는 경우에만 break 키워드를 통해 탈출시켰습니다.
 * 
 * 팩토리얼을 for문을 통해서 하셨는데 개인적으로는 재귀함수로 구현하는 코드보다 가독성이 좋았어요.
 * System.out.printf("%d! = %d\n", userValue, factorial); 출력하는 부분도 반복문을 탈출시킨 다음에 출력되도록 하면 좋을 것 같습니다.
 * 고생하셨습니다.
 * 
 */
public class Quiz01 {
	
	public static void factorial(int userValue) {
		int factorial = 1;
		
		for(int i=1; i<=userValue; i++) {
			factorial = factorial * i;
		}
		
		System.out.printf("%d! = %d\n", userValue, factorial);
	}
	

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10사이의 정수 1개 입력 >> ");
		int userValue = input.nextInt();
		
		input.close();
			
	}

}
