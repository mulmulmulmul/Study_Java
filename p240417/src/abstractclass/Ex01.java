/*
 * [추상 클래스] abstract class ==============================================
 * - 추상 클래스 내 abstract method는 있을 수도, 없을 수도 있다. (보통은 있음)
 * - 추상 클래스는 인스턴스화할 수 없음 (인스턴스 생성용 타입 X)
 * - 다형성 또는 상속 용도로 사용
 * 
 * [추상 메소드] abstract method =============================================
 * - body가 없는 메소드 --> 미완성 메소드
 * - 구현은 자식이 함
 * - 반드시 추상 클래스 내에 존재해야 함
 * - abstract method가 있는 abstract class를 상속 받은 자식 클래스는
 * 	 반드시 abstract method를 오버라이딩해야 함 --> 오버라이딩 강제성
 * - 오버라이딩된 자식의 메소드는 부모의 추상 메소드 접근 제어자보다 허용범위가 같거나 커야 함 
 * 
 */

package abstractclass;

abstract class Parent {
	// field
	private int num; //instance field
	private static int var; // static field
	
	// abstract method : 미완성된 메소드
	// 반환형 메소드명(매개변수); 
	// { body } 가 생략되고, 종결연산자를 넣어줘야 함
	// 추상 메소드는 추상 클래스 안에 있어야 함
	// 추상 클래스 안에 추상 메소드는 있을 수 있고, 없을 수도 있다.
	// 자식 클래스에 오버라이딩을 강제
	public abstract void methodOne(); 
	
	// 추상 메소드: static 불가능. 완성되지 않아서 메모리에 미리 올라갈 수 없다.
//	abstract static void methodTwo(); 
	
	// method : instance method
	public void methodTthree() {
		System.out.println("[Parent] methodThree() 실행!");
	}
	
	// method : static method
	public static void methodFour() {
		System.out.println("[Parent] methodFour() 실행!");
	}
	
}

class Child extends Parent {
	@Override
	public void methodOne() { // 부모의 추상 메소드 오버라이딩
		System.out.println("[Child] 오버라이딩된 추상 메소드"); // 부모의 미완성된 메소드를 완성시킴
	}
	
	public void print() {
		System.out.println("[Child] print() 실행!");
	}
	
}


public class Ex01 {

	public static void main(String[] args) {

		// 1. 추상 클래스 인스턴스 생성 : 불가능
//		Parent p = new Parent(); 
		
		// 2. 자식 클래스 인스턴스 생성 : 가능
		Child c = new Child();
		c.methodOne();
		c.methodTthree(); // 부모의 instance method
		c.print();
		Parent.methodFour(); // 부모의 static method (클래스명.메소드)
		
		// 3. 다형성 구현 가능
		Parent p = new Child(); //
		p.methodTthree();
		p.methodOne(); // 부모쪽 - 추상, "자식 - 오버라이딩"
//		p.print(); Error 
	}

}
