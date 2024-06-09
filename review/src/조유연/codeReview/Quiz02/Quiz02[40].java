/*
 * [조유연]
 * 1. 입력 버퍼를 마지막에 닫아주어야합니다.
 * 2. userValue == random 은 else if 가 아닌 else로만 써도 충분합니다.
 */

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		int random = (int)(Math.random() * 10)+1;
		Scanner scan = new Scanner(System.in);

		int count = 1;
		while(true) {
			System.out.printf("숫자 입력 : ");
			int userValue = scan.nextInt();
			
			if(userValue < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			}else if(userValue > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			}else if(userValue == random) {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
			}
			
			count++;
		}
		
	}

}
