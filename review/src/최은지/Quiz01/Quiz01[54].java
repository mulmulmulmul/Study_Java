/*
 * [최은지]================================================
 * 팩토리얼 값을 계산하는 코드가 적절하게 작성되지 않았습니다.
 * 	- 5일 경우 120이 출력되어야 하는데 4부터 팩토리얼값이 계산
 * 	- for문의 조건 범위에 = 이 포함되어야 함
 * =======================================================
 * 
 */
import java.util.Scanner;

public class Quiz01 {

	public static int factorial (int num) {
		 int factorial = 1;
		 for( int i =1; i<num ; i++) {
			 factorial = factorial * i;
		 }
		return factorial;
		 
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if (userValue<1 || userValue>10) {
			} else {
				break;
			}
		}

		System.out.println(userValue+"! : " + factorial(userValue));
		input.close();
	}

}
