
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
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요... ");
		int score = input.nextInt();
		
		char grade = ' ';
		char option = ' ';
		
		if (score%10 >= 7 || score == 100) {
			option = '+';
		} else if (score%10 >= 4) {
			option = '0';
		} else {
			option = '-';
		}
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
			option = ' ';
		}
		
		System.out.println("당신의 학점은 " + grade + option + "입니다.");
			
		input.close();
	}
}
