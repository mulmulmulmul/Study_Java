/*
 * [조유연]
 * 1. factorial값을 구하는 함수에서, i의 증가 범위를 잘못 설정했습니다.
 * 2. 내부에 아무 코드를 포함하고 있지 않은 if문은 잘 사용하지 않습니다.
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
