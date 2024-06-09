package enumtype;
// enum 은 자바에서 나중에 지원
// 상수 값 지정 - private final 필드 / getter로 생성
enum Shoes {
	// 상수 = 참조변수, () = 생성자 호출
	WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("등산화");
	
	private final String name; // enum 상수는 보통 초기화값 고정
	
	// constructor
	// enum의 생성자는 private 
	private Shoes(String name) {
		System.out.println("생성자 실행");
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	// getter
	public String getName() {
		return name;
	}
}

public class Quiz01 {

	public static void main(String[] args) {
//		System.out.println(Shoes.WALKING); // toString() 오버라이딩해서 필드값 출력
//		System.out.println(Shoes.WALKING.getName()); // 게터로 상수 값 출력
		
		// field 에 저장된 값 
		System.out.println("<< 향상된 for문 - 상수 출력 >>");
		for (Shoes shoes: Shoes.values()) { // .values() - static method
			System.out.println(shoes);
		}
		
		// 서수(정수)
		System.out.println("\n<< 향상된 for문 - 서수 출력 >>");
		for (Shoes shoes: Shoes.values()) { 
			System.out.println(shoes.ordinal()); // .ordinal() 
		}
		
		System.out.println(Shoes.WALKING.ordinal()); // 각 상수의 순서 (서수)
		System.out.println(Shoes.RUNNING.ordinal());
		System.out.println(Shoes.TRACKING.ordinal());
	}

}
