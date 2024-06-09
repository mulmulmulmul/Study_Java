/////////////////////////////
//노태윤
////////////////////////////

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		System.out.print("숫자 입력 : ");
		int userNum = input.nextInt(); // 굳이안써도됨
		int random = (int)(Math.random()*10) +1;
		int count = 0;
		// int userValue = 0; 을 선언하면 줄일수있음 코드를 
		// 그리고 while문안에 sysout 숫자입력을 입력하면 한개만써도됨 맨앞에
		while(true) {
			// System.out.print("숫자 입력 : ");
			// userValue = input.nextInt();
			count++;
			if(userNum > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");// 필요없음
				System.out.print("숫자 입력 : "); // 필요없음
				userNum = input.nextInt(); // 필요없음
			} else if(userNum < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");// 필요없음
				System.out.print("숫자 입력 : ");// 필요없음
				userNum = input.nextInt(); // 필요없음
			} else {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
			}
		}	
			
		input.close();
	}

}
