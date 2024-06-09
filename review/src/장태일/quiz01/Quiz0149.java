/*
 * [장태일]
 * 더 좋았을 것이라 생각. 
 * 왜냐면 그래야 출력부분도 줄어들고 userValue의 초기값도 설정할 필요가 없으며
 * 구문이 줄어들것이라 생각든다.
 * 
 */
import java.util.Scanner;

public class Quiz0149 {
	
	public static int factorial(int userValue) {
		if (userValue == 1) {
			return 1;
		} else {
			return userValue * factorial(userValue-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
			break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		
		input.close();
	}
	
}
