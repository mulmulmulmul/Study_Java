/*
 * [변수 종류] 
 * ---------------------------------------------------------------------------------------------------------------
 *                   | 메모리 영역   | 	  메모리 할당 시기 	   | 초기화를 하지 않으면    | 소멸 시기
 * ---------------------------------------------------------------------------------------------------------------
 *  local variable   | stack		 | 해당 영역이 실행   	   |  쓰레기 값				 | 블록(영역)을 벗어날 때
 *  instance field   | heap			 | 객체 생성될 때		   |  0 또는 null(=0) by JVM | 객체가 소멸할 때
 *  static field    	   | static(class) | class가 로드(load)될 때 |  0 또는 null(=0) by JVM | 프로그램이 종료될 때
 *  (=class field)		|				  		|	가장 먼저 할당됨	   |						 |	
 * ---------------------------------------------------------------------------------------------------------------
 * 
 * [static]
 * - static(class) field ==============================================
 * : class가 메모리에 로드(load)될 때, static(class) 영역에 할당
 * : 클래스명으로 관리 --> 클래스명으로 접근 클래스명.field명 
 * : instance(object, 객체) 생성과 상관없이 접근(사용) 가능
 *   --> 객체 생성과 상관없이 field 사용하고자 할 때
 * : [문법] 클래스명.필드명
 * : 해당 클래스로 생성된 객체들이 공유하는 변수
 * 
 * - static(class) method =============================================
 * : class가 메모리에 로드(load)될 때, static(class) 영역에 할당
 * : 클래스명으로 관리 --> 클래스명으로 접근 클래스명.field명 
 * : instance(object, 객체) 생성과 상관없이 호출(사용) 가능
 *   --> 객체 생성과 상관없이 method 호출(사용)하고자 할 때 *
 * : static(class) 메소드 내에서는 static 멤버만 접근(사용) 가능
 *   --> 생성(메모리 할당) 시기가 다름
 *   --> static 멤버가 메모리 할당된 후, 
 *   	 객체 생성 시 instance 멤버가 메모리 할당됨. 객체 생성하지 않으면 메모리 할당x
 *   
 * : [문법] 클래스명.메서드명()	
 * : 해당 클래스로 생성된 객체들이 공유하는 메서드
 *   
 * 
 * 
 */

class Number {
	// field : instance(object) field, static(class) field
	static int one; // 객체 생성과 전혀 연관 없다. 메모리에 미리 올려두고 클래스명을 통해 사용하겠다. static에 할당
	int two; // 객체 생성 시 heap에 할당
	// 메모리에 들어오는 영역이 다르다.
	
	// static은 생성자를 통해 초기화하지 않는다.
	// constructor
	public Number() {}
	
	public Number(int two) {
		this.two = two;
	}
}


public class StaticEx01 {

	public static void main(String[] args) {
		
		System.out.println("[static field] one : " + Number.one); // class명을 통해 외부 접근
		Number number = new Number();
		Number.one = 1;
		System.out.println("[instance field] two : " + number.two); // 객체명(참조변수)을 통해 외부 접근
		
		// static 변수도 참조변수를 통해 접근(인스턴스 필드 접근방법)은 가능하다. (heap의 객체에 먼저 들어온 static 필드의 주소가 있어서)
		// 단, static 변수는 static 방법으로 접근해야 한다. static 접근 방법: 클래스명.field명 
		System.out.println("one >> " + Number.one); // Number.one으로 접근해야 한다.
	}

}
