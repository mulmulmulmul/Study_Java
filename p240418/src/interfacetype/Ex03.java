package interfacetype;

class Sub implements Method {
	
	@Override
	public void one() { // 인터페이스 메소드는 가시성이 기본 public
		System.out.println("[Sub] 오버라이딩된 메소드 one() 실행");
	}
	
	@Override
	public void two() {
		System.out.println("[Sub] 오버라이딩된 메소드 two() 실행");
	}
	
	// default, static은 오버라이딩 강제 x
	
}


public class Ex03 {

	public static void main(String[] args) {
		// 1. interface 인스턴스 생성 : 불가능
//		Method m = new Method();
		
		// 2. 다형성
		Method m = new Sub();
		m.one();
		m.two();
		m.defaultMethod(); //부모 instance 메소드
		Method.staticMethod(); // 부모 static 메소드
		
	}

}
