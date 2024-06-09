
class Parent {
	// [field] instance field 
	int money = 1_000_000; // 1000단위 구분기호 _
	
	// [constructor]
	Parent(){
		System.out.println("[Parent] 생성자 실행");
	}
	
	// [method]
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "원 입니다.");
	}
	
}

class Child extends Parent {
	// constructor
	Child() {
		super(); //부모의 생성자 실행~메모리 할당
		System.out.println("[Child] 생성자 실행");
	}
	
	// [method overriding] 메소드 오버라이딩 ===================================
	// : 메소드 재정의
	// : 반드시 상속관계에서 자식 class가 부모 class의 멤버 메소드를 재정의
	// : 부모 class의 멤버 메소드의 선언부는 동일, 바디(기능)만 수정
	// : 선언부 동일 - 반환형, 메서드명, 매개변수 정보가 같아야 함
	void buy(int money) {
		System.out.println("부모님 용돈 " + money + "원 주세요.");
	}	
	
	// [method overloading] 메소드 오버로딩 ====================================
	// : 같은 이름의 메소드 여러 정의
	// : 단, 매개변수의 정보(자료형, 개수)가 달라야 함
	// : 반환형과는 관련 없음
	// : 상속관계에서만 이루어지지 않음
	void buy() {
		System.out.println("용돈 주세요~");
	}
}

public class InheritanceEx01 {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.buy(10000);
		c1.buy();
		
	}

}
