class Person {
	//멤버 변수
	int age;
//	클래스명 참조변수;
	
	// 멤버 메소드
	void showInfo() {
		System.out.println("** 정보 **");
	}
}
// 객체 생성 : 클래스를 실제화시켰다. class가 메모리에 들어왔다. 

public class InstanceEx02 {

	public static void main(String[] args) {
		// 객체 생성
		Person p1 = new Person(); 
		
		// 객체 멤버에 접근
		System.out.println(p1.age); //p1에는 주소가 있다. (주소.age) 주소에 접근해서 person타입의 객체에서 age값을 가져온다.
		
		// 참조변수 p1에 저장된 주소
		System.out.println(p1);
		
		// 모든 참조변수가 지역변수는 아니다. main메서드 내에 선언되었기 때문에 지역변수
		// [주소 복사] p1에 있는 주소가 p2로 복사되었다. 같은 객체를 가리킨다(접근한다).
		Person p2 = p1;
		// 하나의 객체를 여러개의 참조변수를 통해 찾아갈 수 있다.
		System.out.println("p2에 저장된 주소 >> " + p2);
		
	}

}
