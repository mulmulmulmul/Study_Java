
/*
 * [문제]=================================
 * 점수를 입력받은 후, 학점을 출력하시오.
 * 
 * 90~93: A-, 94~96: A0, 97~100: A+
 * 80~83: B-, 84~86: B0, 87~89: B+
 * 70~73:C-, 74~76: C0, 77~79: C+
 * 나머지: F
 * 
 * << 입력 형태 >>
 * 점수를 입력하세요... 98
 * 
 * << 출력 형태 >>
 * 학점은 A+입니다.
 * =======================================
 */

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("점수를 입력하세요...");
//		int score = input.nextInt();
//	
//		
//		if (score < 70) {
//			System.out.println("학점은 F입니다.");
//		} else if (score < 74) {
//			System.out.println("학점은 C-입니다.");
//		} else if (score < 77) {
//			System.out.println("학점은 C0입니다.");
//		} else if (score < 80) {
//			System.out.println("학점은 C+입니다.");
//		} else if (score < 84) {
//			System.out.println("학점은 B-입니다.");
//		} else if (score < 87) {
//			System.out.println("학점은 B0입니다.");
//		} else if (score < 90) {
//			System.out.println("학점은 B+입니다.");
//		} else if (score < 94) {
//			System.out.println("학점은 A-입니다.");
//		} else if (score < 97) {
//			System.out.println("학점은 A0입니다.");
//		} else if (score <= 100) {
//			System.out.println("학점은 A+입니다.");
//		} 
	
	// 1. 스캐너 객체 생성
	Scanner input = new Scanner(System.in);
	int score = input.nextInt();
	
	// 2. 점수 입력
	if(score >= 97) {
		System.out.println();
	}
	
	// 3. 학점 출력
	
		input.close();
	}

}
