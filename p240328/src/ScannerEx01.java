import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		
		// 변수 선언
		// int num; // int 자료형으로 선언된 변수 num;
		int num = 5;
		System.out.println("num에 저장된 값 >> " + num);
		
		// [Scanner 객체 생성]
		Scanner input = new Scanner(System.in); // 입력 받을 준비 완료
		
		System.out.print("정수 1개 입력하세요... ");
		
		// [정수 입력]
		num = input.nextInt();
		System.out.println("입력 받은 값 >> " + num);
		
		input.close();
	}

}
