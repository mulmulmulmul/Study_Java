package book;

public class AnimalInfo{
	private String name;
	private int age;
	private int index;
	
	public AnimalInfo(String name, int age, int index) {
		this.name = name;
		this.age = age;
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showAnimalInfo() {
		System.out.println("name >> " + name);
		System.out.println("age >> " + age);
	}
}