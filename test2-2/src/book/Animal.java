package book;

public class Animal {

	private Long id;
	private String name;
	private int age;

	public Animal(Long id, String name, int age) {
	this.id = id;
	this.name = name;
	this.age = age;
}
	
	public Long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("번호: %d, 이름 : %s, 나이 : %d\n", id, name, age);
	}
	
}
