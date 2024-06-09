import java.util.Scanner;

public class ScannerQuiz01 {

	public static void main(String[] args) {

		/*
		 * =================================
		 * 정수 2개를 입력받은 후, 덧셈 결과를 출력하시오.
		 * 출력 문구 : 정수 2개 입력하세요...
		 * 
		 * 1. 문제 이해
		 * 2. 처리 순서 (대략적인 뼈대) 구성
		 * 3. 코드 작성
		 * 4. 코드 수정
		 * ==================================
		 */
		
	
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("정수 2개를 입력하세요...");
//	
//		
//		int numOne = input.nextInt();
//		int numTwo = input.nextInt();
//	
//		System.out.println("두 정수의 합 : " + (numOne + numTwo));
//		
//		input.close();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개 입력하세요... ");
		
		System.out.println("두 정수의 합 : " + (input.nextInt() +  input.nextInt()));
	}

}
