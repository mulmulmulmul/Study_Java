import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {

		// 스캐너 객체 생성
		Scanner input = new Scanner(System.in);
		
		// nextInt로 정수 입력받고, 변수에 저장 
		System.out.print("정수 1개 입력 >> ");
		int numOne = input.nextInt();
		System.out.print("정수 1개 입력 >> ");
		int numTwo = input.nextInt();
		
		// 입력값 출력
		System.out.printf("one: %d, two: %d", numOne, numTwo);
		
		input.close();
	}

}
