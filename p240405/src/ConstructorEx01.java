
class Student {
	// field : instance field
	int age;
	String name;

	// constructor
	Student() {}
//		this(5);
//	}
	
	Student(int age) {
		this.age = age;
	}
	
	// setter
	void setAge(int age) {
//		setName("또리");
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("나이 >> " + age);
	}
	
	int getAge() {
		return age;
//		return name;
	}
	
}

public class ConstructorEx01 {

	public static void main(String[] args) {

		// 홍길동 객체(인스턴스) 생성
		System.out.println("** 홍길동 학생 정보 **");
		Student hong = new Student(25);
		hong.showInfo();
		hong.setAge(26);
		hong.showInfo();
		
		// 박보검 객체(인스턴스) 생성
		System.out.println("** 박보검 학생 정보 **");
		Student park = new Student(); // jvm이 0으로 초기화
		park.showInfo();
		park.setAge(35);
		park.showInfo();

		/*
		 *  [ contructor와 setter 차이 ] ======================
		 *  
		 *  			constructor			   setter
		 *  ---------------------------------------------------
		 *  하는 일	   field 값 설정  	 	field 값 설정
		 *  시기		객체 생성			객체 생성 후		
		 *  횟수		  1번				  여러번
		 *  의미		초기화				  값 변경
		 * 
		 * 
		 * 
		 */
		
		
		
		
//		[constructor와 setter 차이] ===============================
//		  
////		1. 생성자는 객체를 생성하는 중에 호출하고, setter는 객체를 생성한 후에 호출한다.
//			Student hong = new Student(); // 객체 생성 과정에서 생성자 호출
//			hong.setAge(3);// 객체 생성 이후 setter 호출
//		
////		2. 생성자는 객체를 생성하면서 동시에 변수 초기화, setter는 객체 생성 후에 변수를 설정(변경)한다.
//		
////		3. 객체 생성 시 동일한 생성자는 1번만 실행되고, setter는 객체 생성 후 여러번 실행할 수 있다.
//			Student hong = new Student(); // <-- error) Duplicate local variable hong
////		hong.setAge(2);
//			hong.setAge(10);
////		  
////		4. 생성자는 반환형이 없으며 명시하지 않지만, setter는 반환형이 없어도 반드시 명시한다.
////		:생성자 
////		Student(int age) {
////			this.age = age;
////		}
////		:setter
////		void setAge(int age) {
////			this.age = age;
////		}
//		
////		5. 생성자명 : 클래스명과 동일 / setter명 : set+멤버변수명(첫글자 대문자)
////		  
////		6. 생성자는 생성자 안에서 다른 생성자를 호출할 수 있지만, setter는 불가능하다.
//		Student park = new Student(); // student() 기본 생성자에서 student(int age)생성자 호출
//		System.out.println("park의 나이 : " + park.getAge()); // -->park의 나이 : 5 
//		
////		7. 생성자의 this는 생성자 안에서 다른 생성자를 호출하는 의미이고, 
////		   setter의 this는 해당 객체의 주소를 표현하는 참조변수이다. (멤버변수임을 표현)
		
	}

}
