/* [final] : 금지 =====================
 * cf) final ------------------------------
 * final field : 값 변경 금지
 * final method : 상속에서 오버라이딩 금지
 * final class : 상속 금지 (자식을 두지 않는다)
 * ----------------------------------------
 */

package final_ex;

 class Parent {
	public void show() {
		System.out.println("[Parent] show() 실행");
	}
}

class Child extends Parent {
	@Override
	public void show() {
//		super.show();
		System.out.println("[Child] 오버라이딩된 메소드 show() 실행");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.show(); // child의 메소드
		
	}
}
