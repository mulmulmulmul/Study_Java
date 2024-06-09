package one;

public class TestB {
	// instance field
	TestA a = new TestA(); // 같은 패키지 내라서 import 필요없음
	
	// method
	void show() {
//		System.out.println(a.num1); // Error! private
		System.out.println(a.num2); // default 
		System.out.println(a.num3); // protected - 같은 패키지일 경우에도 당연히 접근 허용
		System.out.println(a.num4); // public
	}
}
