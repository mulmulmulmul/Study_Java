
public class TypeEx01 {
	public static void main(String[] args) {
		
		// [변수 선언] 자료형 변수명;
		byte num;
		// 자역변수는 사용하기 전에 반드시 초기화해야 함 
		// (멤버변수는 jvm이 기본값으로 초기화해줌)
//		System.out.println(num);
		
		// [변수 초기화] 여기서 =는 대입연산자(오른쪽 값을 왼쪽에 저장)
		num = 5;
		System.out.println(num);
		
		// [변수 값 변경] 이미 초기화된 값을 변경 ( 초기화 x )
		num = 11;
		System.out.println(num);
		
		// [변수 선언과 동시에 초기화] 권장하는 형태 (특히, 지역변수일 경우)	
		int var = 7;
		System.out.println(var);
	}
}
