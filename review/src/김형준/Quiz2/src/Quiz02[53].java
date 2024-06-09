/*
 * [김형준]
 * 깔끔하게 보기 좋은 코드 같다.
 * System.out.println();이 숫자를 맞추어 보세요 밑에 2줄 있는데
 * 1줄만 넣으셔도 괜찮을 것 같다
 */

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");
		System.out.println();
		System.out.println();
		int random = (int)(Math.random()*10+1);
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int user = input.nextInt();
			count++;
			
			if(user==random) {
				System.out.print(count+"회 만에 정답입니다");
				break;
			} else if(user>random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			}
		}
	}
}
