/*
 * [예외 처리]
 * - try ~ catch ~ finally : 직접
 * - throws : 전가 -> 예외가 발생된 메소드를 호출한 메소드에 전가
 * 
 * - 문법
 * try {
 * 	// 예외가 발생되는 명령어
 * } catch(예외클래스 참조변수) {
 *  // 예외가 발생했을 때, 실행하고자 하는 명령어
 * } catch(예외클래스 참조변수) {
 *  // 예외가 발생했을 때, 실행하고자 하는 명령어
 * } catch(예외클래스 참조변수) {
 *  // 예외가 발생했을 때, 실행하고자 하는 명령어
 * } finally {
 *	// (선택사항)
 *  // 예외 발생 여부와 상관없이, 무조건 실행되는 영역
 * }
 * 
 * 순서는 try - catch
 * catch는 여러개 올 수 있다
 * finally는 1개, 마지막
 * 
 */

package exception;

import java.util.Scanner;

public class Ex02 {

	public static void inputData() {
		System.out.println("inputdata method -- 시작");
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int result1 = 0;
		int result2 = 0;
		
		try {
			// 예외가 발생되는 명령어
			result1 = n1 / n2; 
			result2 = n1 % n2; 
		} catch (ArithmeticException e) {
			System.out.println("분모가 0으로 계산 불능");
		}
		
		System.out.println("몫 : " + result1);
		System.out.println("나머지 : " + result2);
		
		input.close();
		System.out.println("inputdata method -- 종료");
	}
	
	public static void main(String[] args) {
		System.out.println("[main method] >>> Start");
		
		inputData();
		
		System.out.println("[main method] >>> END");
	}

}
