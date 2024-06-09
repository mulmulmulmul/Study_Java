package one;

public class TestD extends TestA{
	void show() {
//		System.out.println(num1); // private - 상속관계 자식이어도, 부모의 private 멤버에는 접근 불가
		System.out.println(num2); // default - 같은 패키지
		System.out.println(num3); // protected - 같은 패키지, 상속
		System.out.println(num4); // public
	}
}
