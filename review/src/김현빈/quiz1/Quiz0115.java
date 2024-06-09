package quiz1;
/*
 * [김현빈] ===================================
 * 탈출문 if 의 else를 빼고 조건문을 수정해도 될것같아요
 * 
 */
import java.util.Scanner;

public class Quiz0115 {

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
