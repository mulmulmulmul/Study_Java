
public class ForQuiz01 {

	public static void main(String[] args) {

		// =====================
		// 구구단 2단을 출력하시오.
		//[출력형태]
		//2 * 1 = 2
		//2 * 2 = 4
		// ...
		// 2 * 9 = 18
		// =====================  
		
		
		
		// for문 안에서 num 변수 선언 후 2단 출력
		for(int num = 1; num <= 9; num++) {
			System.out.printf("2 * %d = %d\n",num ,2*num);
		} // 명령어가 1개이면 FOR의 {}는 생략 가능하나, 해주는 게 좋다.
	// for문이 종료될 때 num은 메모리에서 사라진다.	
	}

}