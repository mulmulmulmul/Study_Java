
public class MethodEx04 {

	public static void main(String[] args) {
		// 리턴값이 있을 때 가능한 형태 
		// 1. 변수에 저장
		String str = returnString();
		System.out.println("returnString() 호출 결과 >> " + str);
		
		// 2. 바로 사용
		System.out.println(returnString());
	}

	// [method 정의] ================================
	// [형태 4] 매개변수 X, 리턴 O
	// 기능 : 호출하면 문자열 리턴
	// 메소드명 : returnString, 매개변수 : 없음

	public static String returnString() {
		return "안녕~";
	}
	
}
