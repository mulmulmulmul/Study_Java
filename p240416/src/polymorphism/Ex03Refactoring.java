package polymorphism;

abstract class FruitTwo {
	protected String name;
	protected int count;
	
	public FruitTwo(String name, int coun) {
		this.name = name;
		this.count = coun;
	}
	
	// 오버라이딩을 강제할 수 있다. 
	abstract public void show();
//		System.out.println("[Fruit]..."); // 기능은 필요없다
}

class BananaTwo extends FruitTwo {

	public BananaTwo(String name, int coun) {
		super(name, coun);
	}
	
	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다";
	}
	
	public void show() {
		System.out.println("------------------------------------------");
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("현재 과일은 " + super.count + "개 입니다.");
		System.out.println("------------------------------------------");
	}
	
}

class AppleTwo extends FruitTwo {

	public AppleTwo(String name, int coun) {
		super(name, coun);
	}
	
	@Override
	public String toString() {
		return "[Apple] 나는 사과다";
	}
	
	public void show() {
		System.out.println("------------------------------------------");
		System.out.println(">> 사과 종류는 " + super.name + "입니다.");
		System.out.println(">> 수량은 " + super.count + "입니다.");
		System.out.println("------------------------------------------");
	}
	
}


public class Ex03Refactoring {

	public static void fruitInfo(FruitTwo fruit) { 
		System.out.println(fruit);
		fruit.show(); // 오버라이딩된 메소드
	}
	
	public static void main(String[] args) {
		BananaTwo banana = new BananaTwo("레드 바나나", 10); // 바나나 객체 생성 -> 부모 필드 값설정
		fruitInfo(banana); // 바나나 참조변수를 다형성 구현
		
		AppleTwo apple = new AppleTwo("홍옥", 5);
		fruitInfo(apple);
	}

}
