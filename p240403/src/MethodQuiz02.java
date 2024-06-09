
public class MethodQuiz02 {

	// [메소드 정의]
	// - 기능 : 정수 1개를 받아서 제곱값 출력
	// - 메서드명 : square, 매개변수 : 1개, 리턴값 : 없음
	// - 출력형태 : 5의 제곱은 25입니다.
	// - 출력형태 : 4의 제곱은 16입니다.
	
	public static void main(String[] args) {
		square(5); // 25
		square(4); // 16
		square(7); // 49
	}

	public static void square(int num) {
		int result = 0;
		
		result = num * num;
		System.out.printf("%d의 제곱은 %d입니다.\n", num, result);
	}
	
}