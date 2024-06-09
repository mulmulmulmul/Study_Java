
class Student { // extends Object 모든 클래스는 최상위 객체 부모로 가진다 
	
	 @Override // 어노테이션 기능 : 1. '오버라이딩되었다'는 정보 전달 2.오버라이딩이 잘 되었는지 문법 검사
	public String toString() { // 해당 메소드가 부모에 있거나, 
		return "Student class...";
	}
	
}

public class InheritanceEx04 {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());
	}

}
