package polymorphism;

class Animal {
	protected int age;
	protected String name;
	
	public Animal() {};
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class Cat extends Animal {

	public Cat(int age, String name) {
		super(age, name);
	}

	@Override
	public String toString() {
		return super.name;
	}
	
}

class Dog extends Animal {

	public Dog(int age, String name) {
		super(age, name);
	}

	@Override
	public String toString() {
		return super.name;
	}
	
}


public class Ex02 {

	public static void showInfo(Animal animal) { // 특정 부모의 자식들
		System.out.println("================");
		System.out.println(animal);
		System.out.println("================");
	}
	
	public static void main(String[] args) {
		Cat mimi = new Cat(5, "미미");
		Dog hoya = new Dog(3, "호야");
		
		showInfo(mimi);
		showInfo(hoya);
		
//		System.out.println(mimi);
//		System.out.println(hoya);
	}

}
