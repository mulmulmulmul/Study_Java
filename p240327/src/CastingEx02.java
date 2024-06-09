public class CastingEx02 {
	public static void main(String[] args) {
		/*
		 * [-------- 정수 ----------] [---- 실수 ----]  
		 *  byte - short - int - long - float - double
		 */
		int num = 100;
		int i = 5;
		
		//(같은 자료형: 정수형) 강제 형변환 : 큰 크기 -> 작은 크기
		// 정수형 기본형: int
		short sh = (short)num;
		byte by = (byte)num;
		
		//(다른 자료형) 강제 형변환
		// 실수형 기본형: double
		float fo2 = 2.34F; // DOUBLE은 매번 FLOAT으로 바꿔줘야 해서 접미사 F가 있다.
		int numTwo = (int)fo2; // 실수를 정수로 형변환
		
		//(같은 기본형) 자동 형변환 : 작은 크기 -> 큰 크기
		long lo = num;
		
		//(다른 자료형) 자동 형변환
		float fo = num; // 정수 -> 실수: 자동 형변환 (.0 붙음)
		System.out.println("fo: " + fo); // =100.0
		
		// 정수형 long -> 실수형 float
		//			8				4
		// 변환법이 달라서 모든 실수는 모든 정수보다 큼
		long loTwo = 200;
		float foTwo = loTwo;
		System.out.println("foTwo : " + foTwo);
	}
}