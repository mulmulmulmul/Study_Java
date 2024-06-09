package polymorphism;

class Fruit {
	protected String name;
	protected int count;
	
	public Fruit(String name, int coun) {
		this.name = name;
		this.count = coun;
	}
	
}

class Banana extends Fruit {

	public Banana(String name, int coun) {
		super(name, coun);
	}
	
	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다";
	}
	
	public void nameAndCount() {
		System.out.println("------------------------------------------");
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("현재 과일은 " + super.count + "개 입니다.");
		System.out.println("------------------------------------------");
	}
	
}

class Apple extends Fruit {

	public Apple(String name, int coun) {
		super(name, coun);
	}
	
	@Override
	public String toString() {
		return "[Apple] 나는 사과다";
	}
	
	public void showInfo() {
		System.out.println("------------------------------------------");
		System.out.println(">> 사과 종류는 " + super.name + "입니다.");
		System.out.println(">> 수량은 " + super.count + "입니다.");
		System.out.println("------------------------------------------");
	}
	
}

public class Ex03 {

	public static void fruitInfo(Fruit fruit) { // 다형성 구현
		System.out.println(fruit); // toString 반환된 문자열 출력
		
		/* [문제] ==========================================================
		 * fruit이 banana 객체의 주소를 저장하면, nameAndCount() 호출하고
		 * fruit이 apple 객체의 주소를 저장하면, showInfo() 호출
		 * =================================================================
		 */
		if (fruit instanceof Banana) { // 참조변수를 찾아가면 (다형성 구현된)Banana 객체가 있음
			((Banana) fruit).nameAndCount();
		} else if (fruit instanceof Apple){ // 참조변수를 찾아가면 (다형성 구현된)Apple 객체가 있음
			((Apple) fruit).showInfo();
		}
	}
	
	public static void main(String[] args) {
		Banana banana = new Banana("레드 바나나", 10); // 자식 객체 참조변수 선언
//		System.out.println(banana);
//		banana.nameAndCount();
		fruitInfo(banana);
		
		Apple apple = new Apple("홍옥", 5);
//		System.out.println(apple);
//		apple.showInfo();
		fruitInfo(apple);
	}

}