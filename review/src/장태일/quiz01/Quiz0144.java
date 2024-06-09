/*
 * [장태일]
 * 1부터 10사이의 정수일때 출력값이 나와야 하는데 userValue가 1보다 작거나 같을때 다시 입력하라 쓴 부분이 틀렸다.
 * 또한 1보다 작다고 하였어도 or 연산자를 쓰는것 추천
 * 
 * 팩토리얼 정의시 재귀호출 쓰는것 추천.
 * 
 */
import java.util.Scanner;

public class Quiz0144 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		
		while(true) {
			if(userValue > 10) {
				System.out.println("다시입력하세요. ");
				userValue = input.nextInt();
				continue;
			} else if (userValue <= 1) {
				System.out.println("다시입력하세요");
				userValue = input.nextInt();
				continue;
			} else {
				num = userValue;
				break;
			}
		}
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}	
		
		System.out.println(num + "! : " + result);
	}

}