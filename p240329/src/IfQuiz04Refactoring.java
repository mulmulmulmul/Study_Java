
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

public class IfQuiz04Refactoring {

	public static void main(String[] args) {
		
		// 1.Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 점수 입력
		System.out.println("점수를 입력하세요...");
		int score = input.nextInt();
		
		int numOfOne = score%10; //1의자리 숫자
		
		char grade = 0;
		char option = 0;
		
		// 3-1. 알파벳 구하기
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		
		// 3-2. 기호 구하기
		if(numOfOne >= 7 || score == 100) {
			option = '+';
		} else if(numOfOne >= 4) {
			option = '0';
		} else {
			option = '-';
		}
		
		// 4. 학점 출력
		if(grade == 'F') {
			System.out.println("당신의 학점은 " + grade + "입니다."); 
		} else {
			System.out.println("당신의 학점은 " + grade + option + "입니다.");
		}
		
		input.close();
	}
}
