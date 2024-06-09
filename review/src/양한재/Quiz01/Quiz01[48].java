/*
 * [양한재]=====================
 *  while문의 범위가, 10 초과 라서
 *  0이하의 정수는 포함되지 않았습니다.
 *  그리고 10 초과 일때도 
 *  user value를 다시 입력받는 코드가 없습니다.
 * =============================
 */
import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			return;
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
		}
		
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
