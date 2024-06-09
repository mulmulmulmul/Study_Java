import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {

//		// 1. Scanner 객체 생성
//		Scanner input = new Scanner(System.in);
//		
//		// 2-1. 문자열 입력 : next() - 첫번째 공백 전까지만 입력
//		System.out.print("문자열 입력하세요...");
//		String strOne = input.next();
//		
//		// 2-2. 문자열 입력 : nextLine() - 엔터까지 입력
//		// (windows 기준) Enter : CRLF - \r\n
//		// CR : Carriage Return -> \r  -> 커서를 가장 왼쪽으로 가져간다
//		// LF : Line Feed 		-> \n  -> 다음 줄로 커서를 내린다
//		
//		System.out.print("문자열 입력하세요...");
//		String strTwo = input.next();
//		
//		System.out.println("strOne >> " + strOne);
//		System.out.println("strTwo >> " + strTwo);
//		
//		// 메모리 해제
//		input.close();

		
	Scanner input = new Scanner(System.in);
	
	System.out.print("문자열 1개 입력하세요... ");
	String strOne = input.next();
	
	System.out.print("정수 1개 입력하세요... ");
	int strTwo = input.nextInt();
	
	System.out.println(strOne + ", " + strTwo);
		
	input.close();
	}

}
