package two;

import one.TestA;

public class TestE extends TestA {
	// method
	void show() {
//		System.out.println(num1); // private -  자식
//		System.out.println(num2); // 다른 패키지
		System.out.println(num3); // 다른 패키지, 상속
		System.out.println(num4); // public
	}
}