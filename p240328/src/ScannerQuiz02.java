import java.util.Scanner;

public class ScannerQuiz02 {

	public static void main(String[] args) {

		/*
		 * [문제]===========================================
		 * 사용자에게 정수 2개를 입력받은 후, 큰 값만 출력
		 * 
		 * <출력 문구>
		 * 서로 다른 정수 2개 입력 :
		 * 큰 값 >>
		 * =================================================
		 */
		
//		//1. Scanner 객체 생성
//		Scanner input = new Scanner(System.in);
//		
//		//2. 정수 입력
//		System.out.print("서로 다른 정수 2개 입력 : ");
//		
//		int numOne = input.nextInt();
//		int numTwo = input.nextInt();
//		
////		//3. 큰 값 찾기
////		int result = (numOne > numTwo) ? numOne : numTwo;
////		
////		//4. 큰 값 출력
////		System.out.println("큰 값 >> " + result);
//		
//		int max; // 메인메서드 영역에 만들어진 변수. 메인메서드 영역이 끝날때까지 존재하는 변수
//		
//		if(numOne > numTwo) {
//			 max = numOne; //{} 영역 안에 만들어진 변수 = 지역 변수. 영역이 끝나면 사라지는 변수다.
//		} else {
//			 max = numTwo;
//		}
//		
//		System.out.println("큰 값 >> " + max);
//		//5. 메모리 해제
//		input.close();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("서로 다른 정수 2개 입력... ");
		
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		
		int max = (numOne > numTwo) ? numOne : numTwo;
		
		System.out.println("큰 값 >> " + max);
		
		input.close();
	}	

}
