package exception;

import java.util.Scanner;

public class Ex01 {

	public static void inputData() {
		System.out.println("inputdata method -- 시작");
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int result1 = 0;
		int result2 = 0;
		
		result1 = n1 / n2; 
		result2 = n1 % n2; 
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
