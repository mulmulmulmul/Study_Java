package book;

public class AnimalInfo {

	private String name;
	private int age;
	
	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showAnimalInfo() {
		System.out.printf("name >> %s\n", name);
		System.out.printf("age >> %d\n\n", age);
	}
}
