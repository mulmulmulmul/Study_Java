
public class OperatorEx01 {

	public static void main(String[] args) {

		// 산술 연산자
//		int num1 = 5;
//		int num2 = 3;
		
		int num1 = 5, num2 = 3;
		
		System.out.println("덧셈 : " + (num1 + num2));
		System.out.println("뺄셈 : " + (num1 - num2));
		//코드 직관성을 높이기 위해서 일부러 괄호를 쳐준다.
		System.out.println("곱셈 : " + (num1 * num2));
		System.out.println("몫 : " + (num1 / num2));
		// 나머지: 짝수/홀수 구분, ~배수
		System.out.println("나머지 : " + (num1 % num2));
	
		
	}

}
