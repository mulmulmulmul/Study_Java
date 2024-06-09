/*
 * [가변 인자] variable arguments =========
 * - JDK 1.5부터 지원
 * - 선언 형태 : type... parameter
 * - 내부적으로 배열 생성
 * - 파라미터 마지막 위치에 선언해야 한다
 * 
 * 
 */
public class ParameterEx01 {
//	public static void sum(int n1, int n2) {
//		int sum = n1 + n2;
//		System.out.println("덧셈 결과 >> " + sum);
//	}
	
	// Error!
	// : The variable argument type int of the method add must be the last parameter
//	public static void add(int n1, int...args, int n2) { // 가변인자 인수는 매개변수의 마지막에 와야 한다.
//		
//	}
	
	// 가변 인자 : 인수의 개수가 정해지지 않은 파라미터
	public static void sum(Integer...args) { 
		System.out.println("\n** 가변 인자 **");
		System.out.println("args : " + args);
		
		// inhanced for loop 향상된 for문
		for(Integer ar: args) {
			System.out.print(ar+" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 메서드 호출 시 우선순위: 1. 매개변수가 일치하는 메소드 2. 가변 인자 메소드
		sum();
		sum(3, 5); // sum(int n1, int n2)를 찾아간다.
		sum(1);
		sum(2, 4, 6);
		sum(1, 7, 9, 11);
	}
	
	// 출력 타입은 배열
	// args : [I@5b2133b1
	// args : [I@33c7353a
	// args : [I@681a9515
}
