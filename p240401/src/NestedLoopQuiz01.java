
public class NestedLoopQuiz01 {

	public static void main(String[] args) {

		/* [문제] =================================
		 * 중첩 for문을 사용하여, 구구단 2~9단 출력하시오.
		 * 2 * 1= 2
		 * 2 * 2= 4
		 * ...
		 * 2 * 9 = 18
		 * 단과 단 사이에 화이트라인
		 * 3 * 1 = 3
		 * =======================================
		 */ 
		
		for(int numOne=2; numOne <=9; numOne++) { // 1. 바깥쪽 for문 - 2단 ~ 9단 표현
			
			for(int numTwo=1; numTwo<=9; numTwo++) { // 2. 안쪽 for - *1 ~ *9표현
				System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo)); // 구구단 출력
			}
			
			System.out.println(); // 단과 단 사이에 화이트라인 삽입
			
		}
		
	}

}