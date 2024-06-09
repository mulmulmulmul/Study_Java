/*
 * [메소드 오버로딩] method overlodaing
 * - 같은 이름, 같은 기능의 메소드를 여러 개 정의
 * - 단, 매개변수의 정보가 달라야 함
 *		---------------- 	
 *	   	(개수 또는 타입)
 * - 반환형(리턴형)과는 관련 없음
 */
public class MethodEx02 {

	public static void main(String[] args) {
		
		// [method 호출] =================================
		sum(2, 3); //정수일 때 
		sum(2.1, 3.3); // 실수일 때
		
		// 여러 타입을 처리하는 똑같은 메서드
		System.out.println(5);
		System.out.println(5.1);
		System.out.println('A');
		System.out.println("안녕");
		System.out.println(true);
		
	}
	
	// [다른 타입의 동일한 method 정의] =====================================
	//이름은 같지만 매개변수의 정보가 다른 두 메서드 (메소드 오버로딩)
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	
	public static void sum(double n1, double n2) {
		
	}
	
	public static void sum(double n1, int n2) {
		
	}
	
	public static void sum(int n1, double n2) {
		
	}
	
	// ======================================================================
}
