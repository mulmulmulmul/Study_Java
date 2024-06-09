package book;

public class AnimalInfo {

	private String name;
	private int age;
	
	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void showAnimalInfo() {
		System.out.printf("name >> %s\n", this.name);
		System.out.printf("age >> %d\n\n", this.age);
	}
	
}