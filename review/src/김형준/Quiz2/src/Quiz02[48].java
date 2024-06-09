/*
 * [김형준]
 * System.out.print("숫자 입력 : ")하는 회수가 많은 것 같다.
 * 
 *	Scanner input = new Scanner(System.in);
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		int userNum= 0;
		int random = (int)(Math.random()*10) +1;
		int count = 0;
		
		while(true) {
			count++;	
			
			System.out.print("숫자 입력 : ");
			userNum = input.nextInt();
			
			if(userNum > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if(userNum < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
 * 이렇게 하면 코드를 조금 더 줄일 수 있을 것 같다.				
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
