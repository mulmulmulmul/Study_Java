
public class MethodEx03 {

	public static void main(String[] args) {
		showString(); // 2.호출한 곳
	} // 3.프로그램 종료

	// [method 정의] ================================
	// [형태 3] 매개변수 X, 리턴 X
	// 기능 : 호출하면 문자열 출력
	// 메소드명 : showString, 매개변수 : 없음
	// 이 형태는 외부에서 아무 값도 받지 않는다.
	
	public static void showString() {
		System.out.println("--------------------------------");
		System.out.println("showString() 메소드 실행됨");
		System.out.println("--------------------------------");
	} // 1.메소드 실행 종료 -> 호출한 곳으로 돌아감
	
}
