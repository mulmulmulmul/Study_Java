
public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
		 * [반복문] ===========================
		 * while문을 사용하여, 1~10 출력
		 * 
		 * [출력 형태]
		 * 1 2 3 4 5 6 7 8 9 10 (가로로 출력)
		 * ==================================
		 */
		
		// 1. 변수 초기값 선언
		int num = 1; // 출력을 시작할 숫자
		
		// 2. 반복문 while 작성
		while (num <= 10) { //조건식
			System.out.printf("%d ", num);
			num++; //증감식
		}
		
	}

}
