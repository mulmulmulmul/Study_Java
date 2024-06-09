/*
 * [조유연]
 * 1. 문제의 요구사항대로 입력값을 받아야합니다.
 * 2. 중복되는 코드가 많으니 줄일 필요가 있습니다.
 * 3. continue가 불필요하게 많이 사용되고 있습니다. 무한루프 while문의 동작 원리를 다시 공부하시면 더 좋습니다.
 * 수고하셨습니다 :)
 */
import java.util.Scanner;

public class Quiz01 {

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
