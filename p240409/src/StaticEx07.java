/*
 * class는 자료형
 */


public class StaticEx07 {

	// static field
	String str;
	static final StaticEx07 s = new StaticEx07(); // 참조변수가 class 영역에 만들어지면서 인스턴스도 생성
	// class가 메모리에 들어올 때 static 할당
	
	// instance field
	int num = 100; 
	
	// instance method
	void show() {
		System.out.println("num >> " + num);
	}
	
	public static void main(String[] args) {
//		System.out.println(num);	
		s.show();
	}

}
