
public class NestedLoopQuiz02 {

	public static void main(String[] args) {

		/* [문제]
		 * 중첩 while문을 사용하여, 구구단 2~9단 출력하시오.
		 * 2 * 1= 2
		 * 2 * 2= 4
		 * ...
		 * 2 * 9 = 18
		 * 단과 단 사이에 화이트라인
		 * 3 * 1 = 3
		 */
		
		//1. 두 정수 변수 초기화
		int numOne = 2;
		int numTwo = 1;
		
		//2.중첩 while문 작성
		while(numOne <=9) { //바깥 while문 - 2단 ~ 9단
			
			while(numTwo <= 9) { // 안쪽 while문 - *1 ~ *9
				System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
				numTwo++; // 증감식
			}
			
			System.out.println(); // 단 종료시 화이트라인 삽입
			
			numOne++; 
			numTwo = 1; // 안쪽 while문에서 직전에 저장된 값 10을 다시 1로 설정 // 시작할 때 해도 된다.
		} 

	}
		
}