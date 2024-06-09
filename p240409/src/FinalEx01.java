/*
 * [final]
 * : 금지 
 * 
 * cf) final ========================
 * final 변수
 * final 메소드
 * final 클래스
 * ==================================
 * 
 * [final 변수]
 * : 초기화한 값으로 변수의 값 고정
 * : 값 변경 금지
 * : 변수를 상수화 ==> 상수 constant
 * : 이름 있음
 * 
 * [literal] 리터럴
 * : 값 그 자체
 * : 이름 없음
 * 
 */



public class FinalEx01 {

	public static void main(String[] args) {
		// [지역 변수] ============================
		// 변수 선언과 동시에 초기화
		final float PI = 3.14F;
		
		// 변수 선언
		final int num;
		
		// 변수 초기화
		num = 5;
		System.out.println("num : " + num);
		
		// 변수 값 변경 금지
//		num = 10;
//		System.out.println("num : " + num);
		
	}

}
