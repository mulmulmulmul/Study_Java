/* 
 * [정은경]===================================
 * - count++는 while(true) 블록 내에 한번만 작성해도 될 것 같습니다.
 * - input.nextInt()는 while(true) 블록 내에 한번만 작성해도 될 것 같습니다.
 * - 사용자 입력 정수 출력 시 "숫자 입력 : " 문자열 출력하지 않았습니다.
 */

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("**** 숫자를 맞추어 보세요 1~10 ****");
		Scanner input = new Scanner(System.in);
		int userValue = input.nextInt();
		
		int count = 1;
		
		while(true) {
			if(userValue == random) {
				System.out.println(count + "번만에 정답입니다. ");
				break;
			} else if(userValue < random) {
				System.out.println("컴퓨터 숫자가 더 큽니다. ");
				count++;
				userValue = input.nextInt();
				continue;
				
			} else if(userValue > random) {
				System.out.println("컴퓨터 숫자가 작습니다. ");
				count++;
				userValue = input.nextInt();
				continue;
			}
		}
	}

}
