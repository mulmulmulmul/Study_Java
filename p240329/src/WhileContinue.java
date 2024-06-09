/*
 * [continue]
 * - 반복문 내에서 조건문과 함께 사용
 * - 의미 : continue 아래의 라인을 실행에서 제외
 * 
 * 
 */


public class WhileContinue {

	public static void main(String[] args) {

		int idx = 0;
		
		while(idx < 10) {
			idx++;
			
			if(idx % 2 == 0) // 나머지가 0이면 짝수, 1이면 홀수
				continue; // if가 true여서 continue를 만나면 밑으로 안 내려가고 바로 다시 조건문검사
			
			System.out.println("idx >> " + idx);
			
		}
		
		// 위 코드를 continue를 사용하지 않은 형태로 변경
		// 다른 사람이 이해할 수 있게 쉬운 코드로 작성
//		while(idx < 10) {
//			idx++;
//			
//			if(idx % 2 == 1)
//				System.out.println("idx >> " + idx);
//		}	
//		
//		System.out.println("반복문 실행 후 idx >> " + idx);
//		System.out.println("<< 프로그램 실행 종료>> ");
		
	}

}
