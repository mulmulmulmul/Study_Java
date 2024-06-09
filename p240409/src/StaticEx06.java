

public class StaticEx06 {

	// [메서드 정의] =======================================
	static void sum(int n1, int n2) { // non-static
		int result = n1 + n2;
		System.out.println("덧셈 결과 : " + result);
	}
	
	// [main method] ========================================
	public static void main(String[] args) { //main 메서드도 static영역에 바로 들어오고 StaticEx06 이름으로 관리
		// main 메소드에서 쓰려는 멤버 메소드는 static메소드여야 한다.
		
		sum(1,2); // sum 메소드가 메모리에 없다
		
	}

}
