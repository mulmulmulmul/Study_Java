/*
 * [최은지]==========================================================
 * 
 * 
 * if문의 조건식이 적절하지 않습니다.
 *   > if(userValue <= 10) : 1보다 작은 정수도 포함
 *   > else if(userValue != 10)
 *    : 위 조건식에서 10미만의 정수는 else if 의 조건식과 동일한 범위에 속함
 * 
 * 조건식을 충족할 때,
 * 팩토리얼 값을 계산하는 코드 작성이 이루어지지 않았습니다.
 *
 * ==================================================================
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
