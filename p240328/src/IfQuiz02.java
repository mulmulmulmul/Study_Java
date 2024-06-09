/*
 * [문제]
 * 성별(1 or 2 or 3 or 4)을 입력받은 후,
 * '남자입니다.' 또는 '여자입니다.'를 출력하시오.
 * 
 * 1, 2, 3, 4 이외의 값을 입력했을 경우,
 * '잘못된 값을 입력했습니다.'를 출력하시오.
 * 
 *  << 입력 형태 >>
 *  성별 1, 2, 3, 4 중 하나를 입력하세요...
 *  
 *  << 출력 형태 >>
 *  남자입니다.
 * 
 */

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {

//		//Scanner 생성
//		Scanner input = new Scanner(System.in);
//		
//		//입력문, 입력
//		System.out.println("성별 1, 2, 3, 4 중 하나를 입력하세요...");
//		byte gender = input.nextByte();
//		
//		//출력
//		if (gender == 1 || gender == 3) {
//			System.out.println("남자입니다.");
//		} else if (gender == 2 || gender == 4) {
//			System.out.println("여자입니다.");
//		} else {
//			System.out.println("잘못된 값을 입력했습니다.");
//		}
//		
//		input.close();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("성별 1, 2, 3, 4 중 하나를 입력하세요... ");
		int num = input.nextInt();
		
		if (num == 1 || num == 3) {
			System.out.println("남자입니다.");
		} else if (num == 2 || num == 4) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못된 값을 입력했습니다.");
		}
		
		input.close();
	}
	
}
