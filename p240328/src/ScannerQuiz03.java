import java.util.Scanner;

public class ScannerQuiz03 {

		public static void main(String[] args) {
			
			/*
			 * [문제]
			 * 1. 정수	 1개를 입력받은 후 출력
			 * 2. 문자열 1개를 입력받은 후 출력
			 */

//			// 1. Scanner 객체 생성
//			Scanner input = new Scanner(System.in);
//			
//			// 2. 정수 1개 입력
//			System.out.print("정수 1개 입력하세요...");
//			int number = input.nextInt();
//			
//			// 3. 정수 1개 출력
//			System.out.println("입력받은 정수 >> " + number);
//			
//			// 4. 문자열 1개 입력
//			System.out.print("문자열 1개 입력하세요...");
//			input.nextLine(); // 버퍼 비우기용. 정수 출력 후 남아있는 \r\n을 가져와서 입력버퍼에 남아있는걸 비워준다.
//			String str = input.nextLine();
//			
//			// 5. 문자열 1개 출력
//			System.out.println("입력받은 문자열 >> " + str);		
//			
//			input.close();		
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("정수 1개 입력하세요... ");
			int num = input.nextInt();
			
			System.out.println("입력받은 정수 >> " + num);
			
			input.nextLine();
			System.out.print("문자열 1개 입력하세요... ");
			String str = input.nextLine();
			
			System.out.println("입력받은 문자열 >> " + str);
			
			input.close();
		}
}
