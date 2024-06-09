/*
 * 1. 무한 루프(loop)
 * - while(true)
 * - 좋다, 나쁘다의 개념으로 접근하는 것이 아니다!
 * - 반복문 내에 break 명시
 * 
 * 2. break
 * - 반복문 내에서 조건문과 함께 사용 (단독으로 사용하면 반복문 1번만 출력됨)
 * - 의미 : 반복문 탈출
 * 
 */


public class WhileEx02 {

	public static void main(String[] args) {

		int index = 1; //1씩 증가하는 변수는 보통 index로 선언
		
//		// 무한 반복문 구현 ==================================
//		while(true) {
//			System.out.println("index >> " + index);
//			
//			if(index == 3) { // 반복문 탈출 조건
//				break; // 반복문 탈출 
//			}
//			
//			index++;
//		}

		// 위 [무한 루프문]을 [조건식이 있는 while문]으로 변경 =========
		
		while(index <= 3) {
			System.out.println("index >> " + index);
			index++;
		}
		
		System.out.println("<< 프로그램 종료 >>");
		
	}

}
