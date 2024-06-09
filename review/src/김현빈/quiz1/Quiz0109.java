/*
 * [김현빈] ===================================
 * 정수입력문 중복, 한줄로 줄이면 좋을것 같아요
 * 정수 잘못 입력하면 재입력 안되요 조건식 true로 무한반복하게 할 수 있습니다
 * while문에 return 불필요해요
 * userValue에 증감식을 쓰면 값이 바뀌어 버림 > 다른 대체 변수 사용
 * 
 */
package quiz1;
import java.util.Scanner;

public class Quiz0109 {
	
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
