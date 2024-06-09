package singleton;

class Pattern {
	
	// private 'static' 클래스 참조변수 = 클래스 인스턴스 생성 [필드로 자기 클래스 객체 생성/주소저장 한 참조변수를 갖는다.]
	private static final Pattern member_field = new Pattern(); // 외부에서 참조변수 주소 변경 금지
	
	// private constructor : 외부에서 인스턴스 생성 불가능
	private Pattern() {}
	
	// 'public' 'static' 클래스 게터인스턴스 - 인스턴스 객체 참조변수를 return
	public static Pattern getPattern() { // 외부에서 접근 가능한 게터로 인스턴스 관리
		System.out.println("[Pattern class 내] member_field >> " + member_field );
		return member_field;
	}
	
	@Override
	public String toString() {
		return "Pattern 클래스입니다.";
	}
	
	// [문제] 멤버변수(field) i에 설정된 값을 외부에서 사용하려면?
//	// [방법1] 인스턴스 멤버 -----------------------
//	private int i = 100;
//	
//	public int getI() {
//		return i;
//	}
	
	// [방법2] static 멤버 ----------------------
	private static int i = 100; // static인데 private 이다 -> 타입이 로드되자마자 메모리에 할당을 하겠다. (드러나지는 않는다)
	
	public static int getI() {
		return i;
	}
}

public class Ex03 {
	public static void main(String[] args) {
//	 	1. 인스턴스 생성 : 불가능
//		Pattern p = new Pattern();
		
//		2. static 멤버 접근
//		Pattern p = Pattern.member_field;
//		System.out.println(p);
		
//		Pattern.member_field = null;
		
//		3. static method를 통해 생성된 인스턴스 주소 리턴
		Pattern p = Pattern.getPattern(); // Pattern class가 메모리에 load되는 시점
		System.out.println(p);
		
		System.out.println("field i값 출력 >> " + Pattern.getI());
		
	}
}
