package modifier;

class Person {
	private int age;
	private String name;
	
	Person(int age, String name) { // private 생성자 - 외부에서 인스턴트 생성 금지
//		super(); Object생성자 호출
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Person p = new Person(25, "홍길동"); // 25는 heap, "홍길동"은 constant pool, "홍길동"의 주소는 heap
		//p.age = 26; // private은 외부접근을 통한 filed 값 변경은 불가능
				      // 멤버 메소드를 통한 값 변경만 가능
		System.out.println(p.getAge());
	}

}
