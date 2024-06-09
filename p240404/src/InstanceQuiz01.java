
// [문제] class 정의 =====================================

class Animal {
	// field : instance field
	String name;

	// setter / getter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// ================================================

public class InstanceQuiz01 {
	
	public static void main(String[] args) {

		Animal dog = new Animal();
		dog.setName("또리");
		System.out.println("강아지 이름 : " + dog.getName());
		
		Animal cat = new Animal();
		cat.setName("나봉");
		System.out.println("고양이 이름 : " + cat.getName());
		
	}
}
