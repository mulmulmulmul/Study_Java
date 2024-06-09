
class Student {
	// field : 필드, 멤버변수
	int age;
	String name;
	
	// constructor
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	// method
	void showInfo() {
		System.out.println("나이 : " + this.age);
		System.out.println("이름 : " + this.name);
	}
}


public class ArrayEx02 {

	public static void main(String[] args) {
		// 객체 배열 : 1차원 배열
		// 타입[] 배열명(=참조변수) = new 타입[길이]; (열의 길이)
		// 객체 배열의 요소는 참조 변수로 구성됨
		Student[] smart = new Student[3]; // 인스턴스 생성 X. 3개 객체의 각 주소가 연속으로 나열된 배열 생성.
//		System.out.println(smart[0]);
		
		smart[0] = new Student(20, "hong");
		smart[1] = new Student(35, "park");
		smart[2] = new Student(50, "lee");
		
		// 1) 배열의 요소는 참조변수로 구성됨
		// 1-1) 일반 for문: 내장변수 length
//		for(int i=0;i<smart.length;i++) {
//			System.out.println(smart[i]);
//		}
//		System.out.println();
//		
//		// 1-2)향상된 for문
//		for(Student student: smart) { 
//			System.out.println(student);
//		}
//		System.out.println();
		
		// 2) 학생의 정보 출력 : showInfo() 호출
		// 2-1) 일반 for문: 내장변수 length
		for(int i=0;i<smart.length;i++) {
			smart[i].showInfo();
			System.out.println();
		}
		
		// 2-2) 향상된 for문
		for(Student student: smart) { 
			student.showInfo();
			System.out.println();
		}

		// 3) 향상된 for문 : 모든 학생의 나이를 1증가
		for(Student student: smart) {
			student.age += 1; //필드 age 값 변경
		}
		
		// 4) 향상된 for문 : showInfo() 호출
		System.out.println("\n** age 값 변경 후 showInfo() 실행 **");
		for(Student student: smart) {
			student.showInfo();
			System.out.println();
		}
		
	}
}
