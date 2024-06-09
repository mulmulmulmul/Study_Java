
public class MethodEx02 {

	// [main method] =====================================
	public static void main(String[] args) {
		System.out.println("** main method 시작 **");
		
		// 이후에 리턴값을 사용하기 위해 변수에 저장
		int sumResult = sum(2, 5); // sum메서드로부터 넘겨받아 값은 7로 변하고 메소드 종료
		System.out.println("sum(2, 5) 호출 결과 >> " + sumResult);
		
		System.out.println("sum(1, 4) 호출 : " + sum(1, 4)); // 결과값을 이후에 못 씀
		
		System.out.println("** main method 종료 **");
	}
	
	// [method 정의] =====================================
	// [형태 2] 매개변수 있고, 리턴 있음
	// 기능 : 인수로 정수 2개를 받은 후, 덧셈 결과 리턴
	// 메소드명 : sum, 매개변수 : 2개, 리턴 있음
	public static int sum(int num1, int num2) { // num1, num2는 지역 변수 local variable
		int result = num1 + num2;
		return result; //호출한 쪽(메인 메소드)로 result 값을 넘겨준다
		// System.out.println("sum 메소드 실행 종료");
	}
}

/*
 * [return의 의미]
 * -1. 메소드 실행 끝 (반드시 가져야 하는 의미)
 * -2. 리턴값을 호출한 쪽으로 넘겨 줌 (코드에 따라 가질 때도 있고 안 가질 때도 있는 의미)
 *  리턴값은 하나만 가능하다.
 */

// return 넘겨줄 때
// 변수의 타입을 리턴형에서 확인하고 메인메소드로 넘겨준다.

// [메소드 실행 끝]
// - return (우선순위 높음) 메소드가 실행되다가 return을 만나면 무조건 실행 중지
// - method body의 }