package inheritance;

class Parent {
	String nation;
	
	public Parent() {
//		this("대한민국");
		System.out.println("2. Parent 생성자 실행");
	}	
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("1. Parent 생성자 실행");
	}
}

class Child extends Parent {
	String name;
	
	public Child() { 
//		this("홍길동"); // 컴파일러가 자동으로 부모 생성자 호출 super()
		System.out.println("4. Child 생성자 실행");
	}
	
//	public Child(String name) {
//		// 매개변수가 있는 super(name)를 호출하지 않았으므로 super() 자동 생성.
//		this.name = name;
//		System.out.println("3. Child 생성자 실행");
//	}
}

public class Constructor {
	public static void main(String[] args) {
		Child c1 = new Child();
	}
}
