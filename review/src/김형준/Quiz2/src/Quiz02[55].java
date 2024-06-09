/*
 * [김형준]
 * 숫자 입력과 랜덤값을 받는 것 까진 되었으나
 * 반복입력,출력형태 %s번만에 정답입니다.
 * 는 잘못 적은 것 같다.
 */

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤값을 동일하게 입력하세요.");
		
		int userValue = input.nextInt();
//		int count = 0;
		
		int random = (int)(Math.random() *10) + 1;
		System.out.println("1~10 랜덤값 : " + random);
		
		
		if (userValue > random) {
//			count++;
			System.out.println("컴퓨터의 숫자가 더 작습니다");
		} else {
			System.out.println("컴퓨터의 숫자가 더 큽니다");
		}
//		if(userValue == random) {
//			System.out.printf(count +"%d번만에 정답입니다");
//		}
		input.close();

		
	}

}
