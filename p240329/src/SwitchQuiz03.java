import java.util.Scanner;

public class SwitchQuiz03 {

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
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요... ");
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		
		System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하세요... ");
		String sym = input.next();
		
		int value = 0;
		boolean isOperator = true;
		
		input.close();
		
		switch(sym) {
		case "+":
			value = numOne + numTwo;
			break;
		case "-":
			value = numOne - numTwo;
			break;
		case "*":
			value = numOne * numTwo;
			break;
		case "/":
			value = numOne / numTwo;
			break;
		default:
			isOperator = false;
			System.out.println("잘못된 연산자를 입력했군요!");
		}
		
		if (isOperator) {
			System.out.printf("%d %s %d = %d", numOne, sym, numTwo, value);
		}
	}
}
