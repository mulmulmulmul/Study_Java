import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {	
		/*
		 * [문제]========================================
		 * 정수 1개를 입력받은 후, 0인지 아닌지를 출력
		 * 
		 * - 입력 문구 : 정수 하나 입력하세요...
		 * - 출력 문구 : 입력한 숫자는 0입니다.
		 * 				 입력한 숫자는 0이 아닙니다.
		 * ==============================================
		 */
		
//		// 1. Scanner 객체 생성 (입력받을 준비) - '입력'을 받아야 하기 때문.
//		Scanner input = new Scanner(System.in);
//		
//		
//		// 2. 정수 1개 입력
//		System.out.println("정수 하나 입력하세요...");
//		int num = input.nextInt();
//
//		// 3. 출력	
//		if (num == 0) {
//			System.out.println("입력한 숫자는 0입니다.");
//		} else {
//			System.out.println("입력한 숫자는 0이 아닙니다.");
//		}
//		
//		input.close();
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 하나 입력하세요... ");
		int num = input.nextInt();
		
		if (num == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		} else {
			System.out.println("입력한 숫자는 0이 아닙니다.");
		}
		
		input.close();
	}

}
