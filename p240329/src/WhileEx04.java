/*
 * [지역 변수] local variable
 * 영역 내에 선언된 변수
 * 영역 내에서만 사용(접근) 가능
 * --> 영역 밖에서는 사용(접근) 불가능
 */




public class WhileEx04 {

	public static void main(String[] args) {

		int idx = 1;		// 초기값 설정
		
		while(idx <= 10) {	// 조건식
			int num = 100;	// 지역 변수
			System.out.println("while문 내 선언된 변수 num : " + num);
			
			idx++;
			num++; // 증감식
		}
		
		System.out.println(idx);
//		System.out.println("while문 밖에서 선언된 num 접근 : " + num);
		
	}

}
