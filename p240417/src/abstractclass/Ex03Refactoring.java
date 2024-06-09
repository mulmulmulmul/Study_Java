package abstractclass;

abstract class FruitTwo {
	protected String name;
	protected int count;
	
	public FruitTwo(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	//추상 메소드 [선언]
	abstract public void show();
}

class BananaTwo extends FruitTwo {

	public BananaTwo(String name, int count) {
		super(name, count);
	}
	
	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다";
	}
	
	@Override // 추상 메소드 [정의]
	public void show() {
		System.out.println("------------------------------------------");
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("현재 과일은 " + super.count + "개 입니다.");
		System.out.println("------------------------------------------");
	}
	
}

class AppleTwo extends FruitTwo {

	public AppleTwo(String name, int count) {
		super(name, count);
	}
	
	@Override
	public String toString() {
		return "[Apple] 나는 사과다";
	}
	
	@Override // 추상 메소드 [정의]
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
		BananaTwo banana = new BananaTwo("레드 바나나", 10);
		fruitInfo(banana);
		
		AppleTwo apple = new AppleTwo("홍옥", 5);
		fruitInfo(apple);
	}

}
