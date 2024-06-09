package abstractclass;

abstract class Animal {
	protected String name;
	
	public Animal() {
		this("미입력");
	}
	
	public Animal(String name) {
		this.name = name;
	}

	// abstract method
	public abstract void play();
	
	public String getName() {
		return this.name;
	}
	
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void play() {
		System.out.println(super.name + "는 낚싯대 놀이 중입니다."); // 시각적으로 부모 멤버임 알려줌
	}
}

class Dog extends Animal {
	
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void play() {
		System.out.println(super.name + "는 터그 놀이 중입니다.");
	}
}

public class Quiz01 {
	
	public static void animalPlay(Animal animal) { // 추상 클래스 Animal 참조변수 선언 (다형성 구현)
		animal.play();
	}
	
	public static void main(String[] args) {
		Dog roy = new Dog("로이");
		Cat bear = new Cat("베어");
		
		animalPlay(roy); //로이는 터그 놀이 중입니다.
		animalPlay(bear); //베어는 낚싯대 놀이 중입니다. 
	}
	
}
