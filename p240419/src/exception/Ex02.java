package exception;

import java.util.Scanner;

class NegativeNumberException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NegativeNumberException(int number) {
		super("음수 " + number + "를 입력하셨군요!");
	}
	
}

public class Ex02 {

	public static void inputNumber() throws NegativeNumberException {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 1개 입력하세요...");
		
		int userNumber = input.nextInt();
		input.close();
		
		if(userNumber < 0) {
			throw new NegativeNumberException(userNumber); // 예외 class instance 생성 (예외 발생)
		}
		
		System.out.println("입력된 값 : " + userNumber);
		
	}
	
	public static void main(String[] args) {
		System.out.println("[main] 시작");
		
		try {
			inputNumber();
		} catch (NegativeNumberException e) {
			System.out.println("e >> " + e);
		} 
		
		System.out.println("[main] 종료");
	}

}
