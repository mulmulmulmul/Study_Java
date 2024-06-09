/*
 * [조유연]
 * count++ 부분이 불필요하게 반복되고 있습니다. count의 증가식은 한 번만 등장해도 좋습니다!
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
