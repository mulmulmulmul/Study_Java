/*
 * [if문]
 * 
 * << 조건이 1개일 경우 >>
 * if (조건식) {
 * 		조건이 true일 때 실행되는 영역
 * 		명령어;
 *  }
 *  
 * << 조건이 2개일 경우 >>
 * if (조건식) {
 * 		조건이 true일 때 실행되는 영역
 * 		명령어;
 *  } else {
 *  	조건이 false일 때 실행되는 영역
 *  	명령어;
 *  }
 * 
 * << 조건이 3개 이상일 때 >>
 * if (조건식1) {
 * 		조건식 1이 true일 때 실행되는 영역
 * 		명령어;
 *  } else if (조건식2) {
 *  	조건식 2가 true일 때 실행되는 영역
 *  	명령어;
 *  } else {
 *	  나머지일 때 실행되는 영역
 *		명령어;
 *  }
 * 
 * 
 */


public class IfEx03 {

	public static void main(String[] args) {

		int num = 0;

		
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
					
		System.out.println("프로그램 종료!");
		
	}

}
