
class Parent {
	// [field] =============================
	int money;
	
	// [constructor] =======================
	public Parent() {
		this.money = 1_000_000;
		System.out.println("[Parent] 매개변수가 없는 생성자 실행됨");
	}
	
	public Parent(int money) {
		this.money = money;
		System.out.println("[Parent] 매개변수가 1개인 생성자 실행됨");
	}
	
	// [method] ============================
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 "	+ this.money + "원입니다.");
	}

}

class Child extends Parent { // 단일 상속 (cf: 다중 상속) - 자바는 단일 상속만 허용한다
	
	// [constructor] =======================
	public Child() {
		super(); // 매개변수가 없는 부모의 생성자 꼭 호출
		System.out.println("[Child] 매개변수가 없는 생성자 실행됨");
	}
	
	public Child(int money) {
		// super()가 들어있다.
//		super.money = money;
		super(money); // 부모 객체 생성자 호출
		System.out.println("[Chile] 매개변수가 1개인 생성자 실행됨");
	}
	
	void showMoney() {
		System.out.println("부모님 돈 " + super.money); // 여기서는 지역변수가 없어서 참조변수 super 안 써도 되지만 권장x
	}
	
}

public class InheritanceEx01 {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.showMoney();
	
		System.out.println();
		
		Child c2 = new Child(500_000); 
		c2.showMoney();
	}

}
