class Person {
	// 멤버 변수 :  instance field   cf) 지역변수 local variable
	int age;
	String name;
	
	// setter / getter method
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}


public class InstanceEx06 {

	// [메서드 정의] ===================================================================
	// 메서드명 : show, 매개변수 : 참조형 , 리턴값 : 없음
	public static void show(Person person) { // 보통 타입과 똑같은 이름을 넣어준다.
		System.out.printf("이름 : %s, 나이 : %d\n", person.getName(), person.getAge());
	}	
	// person이 stack에 만들어지고 person에 있는 주소가 복사된다
	// 하나의 객체를 여러개의 참조변수로 가리키고 있는 형태
	
	// [ GC : Garbage Collection ]
	// heap 영역에 있는 객체는 주소만 알면 어디서든 접근할 수 있다. 
	// stack 영역에 있는 메소드와 지역변수는 주소를 알 수 없다. (주소로 접근하지 않는다)
	// stack은 main메서드가 끝나면 할당된 게 자동으로 사라지지만, heap 영역에 할당된 객체는 원래 직접 메모리해제를 해줘야 한다. 
	// [GC:garbage collection] 단, java는 jvm이 알아서 해제해준다. 해제 시점: 일정시간 동안 아무도 해당 객체를 참조하지 않을 때
	// stack과 heap은 메모리(ram)이고 실행중인 모든 프로그램이 들어오므로 사용하지 않는(실행이 끝난) 것들은 해제되어야 한다.
	// 메모리 누수 : 메모리 공간에 할당받은게 프로그램이 종료 후에도 메모리를 차지하고 있다
	// =================================================================================
	
	public static void main(String[] args) {
		// hong 인스턴스 생성
		Person hong	= new Person();
		
		// 멤버변수 설정
		hong.setName("홍길동");
		hong.setAge(25);
		
		//[메서드 호출]
		show(hong); //show와 매개변수 person(hong주소가 복사)이 stack에 생성됐다가 출력 후 사라진다.
		show(new Person()); // 메서드를 호출하면서 객체를 생성. 해당 객체는 이후에 객체를 쓸 수 없다.
		
		// park 인스턴스 생성
		Person park = new Person();
		
		// 멤버 변수 설정
		park.setName("박보검");
		park.setAge(35);
		
		//[메서드 호출]
		show(park);//show와 매개변수 person(park주소가 복사)이 sthack에 생성됐다가 출력 후 사라진다.
		
	}	

}
