/*
 * [반복문] while문
 * 기본형태 문법
 * 
 * 초기값 설정;
 * 
 * while(조건식) {  //조건이 true일 동안 영역을 반복한다. 
 * 					//조건이 처음으로 false가 되면 반복문 실행 종료
 * 		명령어;
 * 		증감식;
 * }
 */



public class WhileEx01 {

	public static void main(String[] args) {

		int num = 1;
		
		while(num < 3) { // 조건 : num이 3미
			System.out.println("num >> " + num); 
			num++;			
		}
		
		System.out.println("반복문 실행 후 num >> " + num);
		System.out.println("<< 실행 종료 >>");
		
	}

}
