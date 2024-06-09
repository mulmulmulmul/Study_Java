/*
 * [문제]================================
 * 월을 입력받은 후, 계절을 출력하시오.
 * 
 * << 입력 형태 >>
 * 월을 입력하세요...
 * 
 * << 출력 형태 >>
 * 계절은 봄입니다.
 * 
 * [참고]
 * 12, 1, 2 	: 겨울
 * 3, 4, 5 		: 봄
 * 6, 7, 8		: 여름
 * 9, 10, 11	: 가을
 * ======================================
 */

import java.util.Scanner;

public class SwitchQuiz01 {
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("월을 입력하세요...");
//		int month = input.nextInt();
//	
//		switch(month) {
//		case 12: case 1: case 2:
//			System.out.println("계절은 겨울입니다.");
//			break;
//		case 3: case 4: case 5:
//			System.out.println("계절은 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("계절은 여름입니다.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("계절은 가을입니다.");
//			break;
//		default:
//			System.out.println(month + "월이라니!"); // 잘못 쓴 월을 알려준다
//			System.out.println("월을 잘못 입력했습니다.");
//		}
//		
//		input.close();
		Scanner input = new Scanner(System.in);
		
		System.out.println("월을 입력하세요... ");
		int seasons = input.nextInt();
		
		switch(seasons) {
		case 12: case 1: case 2:
			System.out.println("계절은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println("계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("계절은 가을입니다.");
			break;
		default:
			System.out.println(seasons + "월이라니!");
			System.out.println("월을 잘못 입력했습니다.");
		}
		
		input.close();
	}
}
