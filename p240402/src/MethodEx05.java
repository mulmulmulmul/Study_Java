
public class MethodEx05 {

	public static void main(String[] args) {
		div(5, 2);
		div(7, 0);
	}

	public static void div(int n1, int n2) { // 매개변수는 타입생략을 할 수 없다.
		// 숙제
		// 분모가 0이면, '분모가 0으로 계산 불능입니다.'를 화면에 출력하시오.
		// 분모가 0이면 아래 두줄은 출력되면 안 된다.
		
		
		//2. return 사용하고 풀어보기 
		if(n2 == 0) {
			System.out.println("분모가 0으로 계산 불능입니다.");
			return; // 메서드 실행 끝
		}
		
		int result = n1 / n2;
		System.out.println("몫 : " + result);
				
	}
	
}
