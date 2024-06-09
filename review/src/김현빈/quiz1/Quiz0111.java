/*
 * [김현빈] ===================================
 * 반복문안에서 변수 선언시
 * 메모리 사용량이 증가되요 >> 반복문 밖에서 변수선언 권장합니다
 */
package quiz1;
import java.util.Scanner;

public class Quiz0111 {

	public static void main(String[] args) {
		
		// scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 정수형 변수 userValue를 선언
		int reslut = 1;
		
		// 조건문 실행
		while (true) {
			System.out.print("1 ~ 10 사이의 정수 입력 : ");
			int userValue = input.nextInt(); // 사용자에게 정수 1개를 입력 받아 저장
			
			if (userValue >= 1  && userValue <= 10) { // 사용자가 1~10 이외의 정수를 입력시 다시 입력 받도록 코딩 작성
				for (int i=1; i<=userValue; i++) {
					reslut *= i;
				}
				System.out.printf("%d! : %d", userValue, reslut);
				break;
			}
		}
		// 메모리 해제
		input.close();
	}
}
