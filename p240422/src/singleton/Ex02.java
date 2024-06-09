package singleton;

class Dog {
	// field
	int age = 5;
	
	// method
	public void showAge() {
		System.out.println("나이 >> " + age);
	}
	
	public static void createInstance() { // static 메소드 내에서 인스턴스 생성 = 메모리에 미리 올려둔다
		// 클래스에서 자기 클래스를 사용할 수 있다.
		Dog dog = new Dog();
		dog.showAge();
	}
}

// 클래스에서 자기 클래스를 사용할 수 있다.
public class Ex02 {
	// instance field =====================================
	int num = 5;
	
	// static method ======================================
	public static void main(String[] args) {
		
		Ex02 type = new Ex02();
		System.out.println(type.num);
		
		Dog.createInstance();
		
	}

}
