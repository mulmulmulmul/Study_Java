/*
 * [if문]
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
 */


public class IfEx01 {
	public static void main(String[] args) {

		int num = 5;

		if(num >= 10) {
			num++;		//영역 안에 들어왔으면 줄바꿈 해주는 게 가독성 좋다
			System.out.println("true일 때, 실행되는 영역");
		}
		
		System.out.println("num : " + num);
		
		
	}
}
