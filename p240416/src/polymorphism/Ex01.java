package polymorphism;

class Thing {
	@Override
	public String toString() {
		return "[Thing] 나는 사물이다";
	}
}

class Person {
	@Override
	public String toString() {
		return "[Person] 저는 사람입니다";
	}
}

public class Ex01 {
	// 다형성을 쓰면 오버로딩할 필요가 x
	public static void printInfo(Object obj) { // 다형성 구현 - 부모 type 참조변수로 자식 객체의 부모 멤버, 오버라이딩된 자식 멤버 찾아감
		System.out.println("=================================");
		System.out.println(obj);
		System.out.println("=================================");
	}
	
	public static void main(String[] args) {

		// 둘 다 Object의 자식클래스, toString 오버라이딩
		Thing thing = new Thing();
		Person person = new Person();
		
		printInfo(thing);
		printInfo(person);
		
//		System.out.println(thing); // toString() 문자열 바로 출력
//		System.out.println(person);
		
	}

}
