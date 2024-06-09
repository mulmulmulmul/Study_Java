/*
 * [최은지]============================================
 * 
 * if문의 조건식에  && 나 || 연산자를 사용하여 
 * 조건식의 반복되는 형태를 줄일 수 있습니다.
 * 
 * 정수 재입력을 요구하는 문구를 출력할 때,  
 * System.out.println("1~10까지의 정수를 입력하세요");를 
 * while문 내 한번 입력하여 반복 출력할 수 있습니다.
 * 
 * ================================================
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
