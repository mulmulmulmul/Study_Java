/*
 * [양한재]=====================
 * 우선 if의 범위가 이상합니다.
 * 작성하신 코드 대로라면,
 * usevalue가 음수일때도 1~10의 정수라고 출력됩니다.
 * 그리고 11이상일 때는 아무것도 출력되지 않습니다.
 * 
 * 1~10의 정수가 아닐 때, uservalue를 입력 받는 코드도 없습니다.
 * 
 * 팩토리얼 출력문이 없습니다.
 * =============================
 */
import java.util.Scanner;

public class Quiz01 {

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
