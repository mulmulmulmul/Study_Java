

public class WhileQuiz03 {

	public static void main(String[] args) {

		//====================
		//1~10까지 합을 구하시오.
		//[출력 형태]
		//1~10 누적합 : 55
		//====================
		
		// 3. 누적합 출력
		int num = 1;
		int sum = 0;
		
		while(num < 11) {
			sum += num; // num 누적합
			num++;	// 1 누적합
		}	

		System.out.println("1~10 누적합 : " + sum);
		System.out.println("반복문 실행 후 idx : " + num);
		
	}
	
}

