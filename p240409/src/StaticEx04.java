
class Person {
	// [field] =================================
	static int count;   // static field
	int age;  			// instance field, non-static field
	
	
	// [method] ================================ 
	// static method - static method는 static field에만 접근이 가능하다.
	static void staticShow() { // static 메소드 - static에 할당
		System.out.println("** static method staticshow() **"); 
		System.out.println("현재 인원 : " + count); // static field
//		System.out.println("나이 : " + age); // instance field 접근 불가능!
		
		staticMethod();   // static method 호출 가능
//		instanceMethod(); // instance method 호출 불가능
	}
	
	static void staticMethod() {
		System.out.println("[static method]");
	}
	
	// instance method - static 멤버, instance멤버 모두 다에 접근이 가능
	void show() { // instance 메소드 - heap에 할당
		System.out.println("** instance method show() **"); 
		System.out.println("현재 인원 : " + count); // static field (static에 이미 올라와있는 count에 찾아갈 수 있다) 
		System.out.println("나이 : " + age); // instance field
		
		staticMethod();		//static method 호출 가능
		instanceMethod();	// instance method 호출 가능
	}

	void instanceMethod() {
		System.out.println("[instance method]");
	}
	
}


public class StaticEx04 {

	public static void main(String[] args) {
		
		Person p = new Person();
		
	}

}
