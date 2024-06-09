package two;		// 현재 파일 위치, 첫 라인, 1개

import one.TestA;   // 다른 타입의 위치, 여러개
import one.TestB;   
import one.*;   // 별표(아스테리크) : 해당 패키지의 모든 타입 - 어떤 타입 썼는지 알 수 없어서 권장 x

public class TestC {
	// field : 객체 생성
	TestA  a = new TestA();
	
	// method
	void show() {
//		System.out.println(a.num1); // private
//		System.out.println(a.num2); // default
//		System.out.println(a.num3); // protected //다른 패키지일 경우, 상속일 때만 허용
		// 객체 선언 후 참조변수를 통해 외부접근
		System.out.println(a.num4); // public
	}
	
}

