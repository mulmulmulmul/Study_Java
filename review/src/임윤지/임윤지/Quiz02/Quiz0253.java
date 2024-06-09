package Quiz02;

// [임윤지]
// 값이 도출되었습니다.
// sysout println();을 중복하여 사용하였습니다.
// Scanner 생성 후에 int random, println 순으로 작성하는 것이 보기에 더 좋았을 거 같습니다.

import java.util.Scanner;

public class Quiz0253 {
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
