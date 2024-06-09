

public class WhileQuiz02 {

	public static void main(String[] args) {

		//[문제] 2단을 출력하시오. =======
		//[출력형태]
		//2 * 1 = 2
		//2 * 2 = 4
		// ...
		// 2 * 9 = 18
		//===========================
		
		//1.변수 초기값 선언
		int num = 1;
		
		//2. 반복문 while 작성
		while(num <= 9) { // 조건식
//			System.out.println("2 * " + num + " = " + (num * 2));
			System.out.printf("2 * %d = %d\n", num, 2*num);
			num++; // 증감식
		}
		
	}

}
