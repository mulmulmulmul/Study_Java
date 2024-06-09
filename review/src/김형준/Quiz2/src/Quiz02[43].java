/*
 * [김형준]
 * 코드는 잘 짜신 것 같다.
 * 좀 더 간략하게 짜는 법도 알고 계실 것 같다.
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
