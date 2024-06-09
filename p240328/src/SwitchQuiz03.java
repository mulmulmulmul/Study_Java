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

		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 2개 입력
		System.out.print("정수 2개를 입력하세요... ");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		int carculatedValue = 0;
		
		// 3. 연산자 1개 입력
		System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하세요... ");
		String operator = input.next(); //next는 enter를 가져다 쓰지 않아서 버퍼비우기가 필요없다.
		String caculate = valueOne + " " + operator + " " + valueTwo;
		
		char error = 'F';
		
		//4. 출력
		switch(operator) {
		case "+":
//			System.out.println(valueOne + operator + valueTwo + " = " + (valueOne + valueTwo));
			carculatedValue = valueOne + valueTwo;
			break;
		case "-":
			carculatedValue = valueOne - valueTwo;
			break;	
		case "*":
			carculatedValue = valueOne * valueTwo;
			break;
		case "/":
			carculatedValue = valueOne / valueTwo;
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨군요!");	
//		default:
//			error = 'T';
		}
		
		if (error == 'F') {
			System.out.println(caculate + " = " + carculatedValue);
		} else {
			System.out.println("잘못된 연산자를 입력했군요!");
		}
//		switch(error) {
//		case 'F':
//			break;
//		case 'T':
//			break;
//		}
		
		//5. 메모리 해제
		input.close();
	}
}
