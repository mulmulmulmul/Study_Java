/*
 * [클래스] class =======================================================
 * - 클래스는 '자료형'이다!
 * - 사용자 정의 자료형
 * - 참조형 (reference type)
 *   cf) 기본형 (primitive type) : int, float, double, ...
 *  
 * - 클래스명 : 대문자로 시작
 * - 클래스 내 멤버 : 변수(값, 특징 저장), 메소드(기능, 동작 구현)
 * 
 * - 참조(reference) 변수 선언 형태
 *	 클래스명 변수명;
 *	 cf) int num;
 * =====================================================================
 */

// [class 정의] 자료형을 만든다. ====================

import java.util.Hashtable;

class Student {
	// 멤버 변수 - 보통 초기화하지 않은 형태로 사용한다. 자바 가상머신이 초기화해준다.
	int age; // jvm이 0으로 초기화해준다.
	String name; 
	// String은 기본형이 아니라 참조형. name에는 값이 아닌 시작주소가 온다. 
	// jvm이 주소를 null로 초기화해주는데, null은 아스키코드 값으로 0이다. 
	// null은 '주소가 없다'는 뜻. 의미전달상 0보다 null이 적합. "가리키는 곳(찾아갈 곳)이 없습니다"
	
	// 멤버 메소드
	void study() {
		System.out.println("열심히 공부 중!");
	}
}

public class InstanceEx01 {

	public static void main(String[] args) {
		// [변수 선언] ----------------------------------------
		// [기본 자료형 (기본형)] 
		// 자료형 변수명;
		int num = 1;
		System.out.println("num >> " + num);
		
		// [참조 자료형 (참조형)]
		// 참조변수 선언 - 객체의 주소가 저장되는 변수
		// 클래스 변수명;
		Student hong; //Student 클래스를 가지고 생성된 변수의 주소 저장 
		// hong은 쓰레기값을 갖는 지역변수(main 메서드 안에 있으므로). stack에 저장된다.
		
		// [객체 생성]
		// 객체 생성 JAVA는 모든 객체(인스턴스)를 heap에 만든다.
		// 멤버변수를 초기화하지 않았다면, 자바가상머신이 heap에 있는 멤버변수를 초기화해준다.
		// new 클래스명();
		hong = new Student(); // new연산자: heap 영역에 할당하세요 // student타입으로 heap영역에 할당하세요
	// heap에 생성된 객체(=인스턴스. 안에는 student의 멤버변수, 멤버메소드가 들어있다.)의 주소를 stack에 생성된 지역변수 hong에 저장한다.
	// hong에 저장된 인스턴스의 주소를 통해 heap에 있는 인스턴스를 찾아간다.
		
		// 멤버 접근
		System.out.println("멤버 변수 age 초기값 >> "
				+ hong.age); // .은 접근연산자. hong을 통해 힙의 객체를 찾아가 지역변수 age를 가져온다
		
		// 멤버변수를 초기화하지 않았다면, 자바가상머신이 heap에 있는 멤버변수를 초기화해준다.
		
		System.out.println("멤버 변수 name 초기값 >> "
				+ hong.name); // hong을 통해 heap의 student를 가리킨다(접근한다)
		
		// 멤버 변수에 값 설정
		hong.age = 35;
		System.out.println("멤버변수 age >> " + hong.age);
		
		// 멤버 메소드 study 호출
		hong.study();
		// 자바에서 heap에 있는 정보를 곧바로 찾아갈 수 있는 방법 x stack에 저장된 hong을 통해 간접 접근
		
		
		// 참조변수 선언과 동시에 초기화
		Student park = new Student();
	// 1.stack에 지역변수 park 할당  2.heap 영역에 객체 생성
	// 3. 2에서 생성된 객체의 주소가 1에 생성된 park에 저장
		// 참조변수 만들 때 사용한 자료형과 객체 생성에 사용한 타입은 일치해야 한다.
		
		System.out.println("박보검의 나이 >> " + park.age);
		
		//1회용으로 생성된 객체. 이렇게 작성 시 객체를 찾아갈 방법이 없다. (주소가 없어서)
		new Student().study(); //객체 생성하고 바로 멤버에 접근은 할 수 있따.
		// 단, 라인을 벗어나면 이 객체는 다시 쓸 수 없다.
		
	}

}
