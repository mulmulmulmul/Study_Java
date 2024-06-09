import java.util.Scanner;

public class WhileQuiz05 {

	public static void main(String[] args) {

		/* ==================================
		 * 사용자에게 정수를 입력받은 후, 누적합 출력
		 * 
		 * [입력 형태]
		 * 정수를 입력하세요(종료 -1 입력) >>
		 * 정수를 입력하세요(종료 -1 입력) >> 
		 * 정수를 입력하세요(종료 -1 입력) >>
		 * 정수를 입력하세요(종료 -1 입력) >> 
		 * 
		 * [출력 형태]
		 * 총합 >> 
		 *  ==================================
		 */
	
		//1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		//2. while 반복문-무한루프 만들기
		int userValue = 0; // 입력값 변수 선언
		int sumOfValue = 0; // 입력값의 총합 변수 선언
		
		while(true) {
			//2-1. 정수 입력
			System.out.print("정수를 입력하세요(종료 -1 입력) >> ");
			userValue = input.nextInt(); 
			
			//2-2. 탈출 조건
			if (userValue == -1) // 입력값이 -1일 때 반복문 탈출
				break; 
			//2-3. 누적합
			sumOfValue += userValue; // 입력값 -1은 총합 연산에서 제외
		}

		//3. 입력값 총합 출력
		System.out.printf("총합 >> %d", sumOfValue);
		
		//4. 자원 해제
		input.close();
		
	}
	
}