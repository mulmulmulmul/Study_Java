
class ParentTwo {
	int money = 1_000_000;
	
	void work() {
	}
	
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "원입니다.");
	}
}

class ChildTwo extends ParentTwo {
	
	void study() {
		System.out.println("저는 공부하고 있습니다.");
	}
	
	// [오버라이딩] 반드시 상속관계여야 한다.
	void buy(int money) {
		System.out.println("\n<< method overriding >>");
		System.out.println("부모님 용돈 " + money + "원 주세요!!");
	}	

	// child의 위 메소드, parent의 메소드와 [오버로딩] 반드시 상속관계일 필요 없다. 
	void buy() {
		System.out.println("\n<< method overloading >>");
		System.out.println("용돈 주세요! 용돈 주세요!");
	}
	
}

public class InheritanceEx03 {

	public static void main(String[] args) {

		ChildTwo c1 = new ChildTwo();
		c1.study();
		c1.buy(100_000); // 1. 자기거에서 buy메소드 탐색 2. 부모거에서 탐색
		c1.buy();
//		c1.work();
	}

}
