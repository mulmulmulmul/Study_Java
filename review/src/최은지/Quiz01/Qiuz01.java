/*
 * [최은지]================================================
 * 
 * 정수 입력 요쳥문구가 두번 작성되었습니다.
 * 반복문을 통해 한번만 작성해도 재출력이 가능합니다.
 * 
 * =========================================================
 */
import java.util.Scanner;

public class Qiuz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		while(userValue < 1 || userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
		}
		
		int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result = result * i;
		}
		System.out.printf("%d! : %d", userValue, result);
		
		input.close();
	}

}
