/*
 * [최은지]================================================
 * 
 * 숫자 입력 요청 문구와 입력 받는 코드를 if문 안에 보다는
 * while문을 통해 작성하면 반복되는 코드를 줄일 수 있을 것 같습니다.
 *
 * ========================================================
 */

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		System.out.print("숫자 입력 : ");
		int userNum = input.nextInt();
		int random = (int)(Math.random()*10) +1;
		int count = 0;
		
		while(true) {
			count++;	
			if(userNum > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
				System.out.print("숫자 입력 : ");
				userNum = input.nextInt();
			} else if(userNum < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				System.out.print("숫자 입력 : ");
				userNum = input.nextInt();
			} else {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
			}
		}	
			
		input.close();
	}

}
