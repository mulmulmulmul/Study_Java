package quiz1;
/*
 * [김현빈] ===================================
 * 반복문을 사용해 재입력을 받아야해요!
 * 팩토리얼을 계산 코드 필요해요
 */
import java.util.Scanner;

public class Quiz0116 {

	public static void main(String[] args) {
		//1번
		Scanner input = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력하세요.");
		int userValue = input.nextInt();
		
		if(userValue <= 10) {
			System.out.println("1~10사이의 정수입니다");
		} else if(userValue != 10) {
			System.out.println("1~10사이의 정수가 아닙니다");
		}
		
		
		input.close();
	}
		
}
