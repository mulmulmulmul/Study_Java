
class Person {
	// [overriding] 오버라이딩 ==================
	@Override //어노테이션
	public String toString() {
		return "[오버라이딩] Person";
	}

}

public class StringEx02 {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p); // p만 써도 println으로 출력해서 기본적으로 문자열로 변환된다.
		System.out.println(p.toString()); 
		System.out.println(p.getClass());
		System.out.println(p.getClass().getName());
		
		String str = "안녕"; //오버라이딩
		System.out.println(str);
		System.out.println(str.toString());
		
		String str2 = new String("안녕");
		System.out.println(str2);
		System.out.println(str2.toString());
		
	}

}
