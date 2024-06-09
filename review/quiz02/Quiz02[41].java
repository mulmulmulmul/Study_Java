/*
 * [정은경]==================================================
 * - 반복횟수가 결정되어 있지 않다면 for문보다 while문이 적합합니다.
 * - 무한루프는 보통 while(true)를 사용합니다.
 * - count++는 for문 내에서 한번만 작성해도 될 것 같습니다. 
 */

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int random = (int)(Math.random()*10+1);
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");
		int count=1;
		
		for(;;) {
			System.out.printf("숫자 입력 : ");
			int userValue = input.nextInt();
			
			if(userValue>random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
				count++;
			} else if (userValue<random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				count++;
			} else {
				System.out.printf("%d번만에 정답입니다.",count);
				break;
			}
		}
		
		input.close();
	}

}
