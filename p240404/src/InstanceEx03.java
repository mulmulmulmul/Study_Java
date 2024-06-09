
// Dog class(타입) 정의
class Dog {
	int age;
	
	void showInfo() {
		System.out.println("this >> " + this);
	}
	
}

public class InstanceEx03 {

	public static void main(String[] args) {

		// Dog class로 생성된 max 객체
		// 객체는 이름이 없지만, 힙에 저장된 객체를 찾아가기 위해서 참조변수의 이름을 사용하므로
		Dog max = new Dog();
		// 일반적으로 참조변수 이름을 객체명처럼 사용한다. Dog 클래스로 생성된 [max 인스턴스]
		System.out.println("참조변수 max에 저장된 객체의 주소 >> " + max);
		max.showInfo();
		
		Dog bella = new Dog(); // Dog 클래스로 생성된 [bella 인스턴스]
		System.out.println("참조변수 bella에 저장된 주소 >> " + bella);
		bella.showInfo();
		
	}

}
