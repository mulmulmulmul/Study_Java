// Fruit 타입 정의  
class Fruit {
	
	//멤버 변수
	int count;
	
	// 멤버 메소드
	void setCount(int count) {
		// this = 멤버 참조변수
		this.count = count;
	}
	
	// 멤버 메소드
	int getCount() {
		return count;
	}
}

public class InstanceEx033 {

	public static void main(String[] args) {
		
		// Fruit 타입의 객체를 힙영역에 생성 후 stack영역의 참조변수 apple에 주소 저장
		Fruit apple = new Fruit(); // Fruit class로 생성한 apple 인스턴스
		apple.setCount(3); 
		System.out.println("사과의 개수 >> " + apple.getCount()); //getter 메서드 호출

		// Fruit 타입의 객체를 힙영역에 생성 stack영역의 참조변수 grape에 주소 저장
		Fruit grape = new Fruit(); // Fruit class로 생성한 grape 인스턴스
		grape.setCount(5);
		System.out.println("포도의 개수 >> " + grape.getCount());
		
		// 객체 총 2번 생성
	}

}
