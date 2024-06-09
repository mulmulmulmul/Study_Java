/*
 * [ 생성자 ] constructor - 객체가 생성될 때, 생성자도 메모리에 들어온다.
 * 생성자는 객체가 생성이 될 때 하나의 생성자만 실행된다. (두개 이상 동시에 실행x)
 * 
 * 
 * << 생성자를 사용하는 이유 >> 
 * - 객체 생성하는 과정 중에, 멤버변수를 초기화
 * - 객체를 생성하면서, 원하는 기능을 실행하기 위해
 * 						(특정 멤버 메서드를 호출)
 * 
 * - 객체 생성시, 무조건 하나의 생성자 호출
 * - 생성자는 일반적으로 '메소드'라고 본다 -> '메소드 오버로딩' 가능 -> 생성자는 여러 개 정의 가능
 * 		cf) 메소드 오버로딩
 * 			* 메서드명이 같고, 매개변수 정보(개수 또는 타입)가 다르다
 * 			* 단, 반환형과는 관련 없다
 * - 생성자는 반환값이 없다 -> 반환형을 명시하지 않음
 * - 생성자명은 클래스명과 같아야 한다
 * 
 *  << defalut constructor >> 기본 생성자
 * - 생성자를 명시하지 않으면, 기본 생성자가 실행. 컴파일러가 추가해준다
 * - 매개변수가 없고, 하는 일도 없다 --> 형식상 실행
 * - 생성자가 하나라도 명시되어 있다면, 기본 생성자는 실행되지 않는다
 * 
 */

class Car { // 멤버 순서는 일반적으로 필드 -> 생성자 -> 메서드
	// instance field =======================================
	int door;
	String color;
	
	// default constructor 기본 생성자 ================================== 컴파일러가 추가. 눈에 안 보임
	//	Car() {}
	
	// constructor ================================================== 아래는 오버로딩 형태
	Car() {
		System.out.println("[매개변수가 없는 생성자 실행]");
	}
	
	Car(int door) {
		this.door = door;
		System.out.println("[매개변수가 1개인 생성자 실행] int");
	}
	
	Car(String color) {
		this.color = color;
		System.out.println("[매개변수가 1개인 생성자 실행] String");
	}
	
	Car(int door, String color) {
		this.door = door;
		this.color = color;
		System.out.println("[매개변수가 2개인 생성자 실행]");
	}
	
	// instance method ======================================
	void setDoor(int door) {
		this.door = door;
	}

	void showInfo() {
		System.out.printf("door : %d, color : %s\n\n", door, color);
	}
}

public class InstanceEx07 {

	public static void main(String[] args) {
		Car c1 = new Car(4); // int door = 4; 초기화 형태와 같다.
		c1.showInfo();
		
//		Car c2 = new Car();
//		c2.showInfo();
		
		Car c3 = new Car("black");
		c3.showInfo(); // door : 0, color : black
		
		Car c4 = new Car(2, "white");
		c4.showInfo(); // door : 2, color : while
		
	}

}
