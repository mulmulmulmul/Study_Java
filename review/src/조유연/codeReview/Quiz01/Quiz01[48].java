/*
 * [조유연]
 * 1. 입력을 다시 받아야하는 경우의 범위를 잘못 설정했습니다.
 * 2. 불필요한 범위 설정이 포함되어있습니다.
 * 3. 연산자를 이용한 조건식을 좀 더 깔끔하게 작성할 수 있을 듯 싶습니다.
 * 
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
