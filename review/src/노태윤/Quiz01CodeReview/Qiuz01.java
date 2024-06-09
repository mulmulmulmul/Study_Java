// 노태윤 ===================
//
//===========================

import java.util.Scanner;

public class Qiuz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : "); // 반복문안에 써도됨 두번안써도됨
		int userValue = input.nextInt(); //변수 선언을먼저해야함 안에다하지말구
		
		while(userValue < 1 || userValue > 10) { // <=, >=를 써야한다.
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
