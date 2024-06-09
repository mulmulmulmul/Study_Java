/*파일 전체에 대한 주석
 * [오버라이딩]
 * 자식의 오버라이딩된 메소드는
 * 부모의 멤버 메소드의 접근 제어자보다
 * 크거나 같아야 한다.
 */

package modifier;

class Parent { // class에는 default와 public이 올 수 있다.. public은 파일명과 동일한 class
	public void show() {
		System.out.println("show() 실행");
	}
}

class Child extends Parent {
	
	public void show() {
		System.out.println("[오버라이딩된 메소드] show() 실행");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		
		
	}

}
