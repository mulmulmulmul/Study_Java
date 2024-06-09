import java.util.Scanner;

public class SwitchQuiz03Refactoring {

	public static void main(String[] args) {

		/*
		 * [문제] ===============================
		 * 정수 2개와 사칙연산 기호를 입력받은 후, 
		 * 식과 계산된 값을 출력하시오.
		 * 단, 정수 먼저 입력받기
		 * 
		 * [입력 형태]
		 * 정수 2개를 입력하세요... 5 2
		 * 사칙연산(+, -, *, /) 중 하나를 입력하세요... +
		 * 
		 * [출력 형태]
		 * 5 + 2 = 7
		 * 
		 * +, -, *, / 이외의 사칙연산 기호를 입력했을 경우,
		 * '잘못된 연산자를 입력했군요!' 를 출력하시오.
		 * =====================================
		 */

		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 2개 입력
		System.out.print("정수 2개를 입력하세요... ");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		
		// 3. 연산자 1개 입력
		System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하세요... ");
		String operator = input.next();
		
		int result = 0;
		
		boolean isOperator = true; // 상태를 묻는 변수는 is를 붙이면 좋다.
		
		// 4. 계산값 출력
		switch(operator) {
		case "+":
			result = valueOne + valueTwo;
			break;
		case "-":
			result = valueOne - valueTwo;
			break;	
		case "*":
			result = valueOne * valueTwo;
			break;
		case "/":
			result = valueOne / valueTwo;
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨군요!");	
			isOperator = false;
		}

		// 5. 연산자 잘못 입력 시 계산식 출력하지 않기
		if (isOperator) {
		 System.out.printf("%d %s %d = %d\n",valueOne, operator, valueTwo, result);
		} 

		//6. 메모리 해제
		input.close();
		
	}
	
}