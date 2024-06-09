/*
 * [이홍준] 코드리뷰 ===============================
 * 1. 변수 선언 시 초기화를 하지 않을 경우 쓰레기값이 생성되기 때문에
 * 	변수 선언 시 정수는 0으로 문자열인 경우는 "" 로 초기화도 같이 해주면 좋을 것 같습니다.
 * 2. 팩토리얼 부분을 재귀함수를 사용하여 메소드를 생성하여 활용해주신 부분도 좋은것 같습니다. 
 * 
 */


import java.util.Scanner;

public class Quiz01 {

	static int factorial(int num) {
		if(num == 1)
			return 1;
		
		return num * factorial(num-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int userValue;

		while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = sc.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		sc.close();
		
	}
}
