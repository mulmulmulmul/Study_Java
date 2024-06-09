/*
 * [interface] type, 자료형 ==========================
 * : abstract class 보다 엄격해진 자료형
 * : abstract class의 upgrade된 자료형
 * : 인스턴스 생성 불가능 -> 상속, 다형성 용도
 * : 다중 상속 허용
 * 
 * [field] -------------------------------------------
 * public static final ==> constant(상수) ==> 대문자
 * 
 * [method] ------------------------------------------
 * public abstract ==> 추상 메소드
 * 
 */

package interfacetype;

public interface Method {
	//abstract method
	void one(); 
	public abstract void two();
	
	// default method(instance method) : Java 8 버전부터 지원
	public default void defaultMethod() {
		System.out.println("[Method interface] default 메소드 실행");
	}
	
	// static method : Java 8 부터 지원
	public static void staticMethod() {
		System.out.println("[Method interface] static 메소드 실행");
	}
	
}
