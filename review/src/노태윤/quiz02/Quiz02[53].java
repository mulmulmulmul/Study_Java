import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");
		System.out.println();
		System.out.println();
		int random = (int)(Math.random()*10+1);
		
		Scanner input = new Scanner(System.in);
		int count = 0; // 변수선언을 하나더하면좋을것같습니다. 컴퓨터값과비교할
		
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int user = input.nextInt(); // 변수초기화를 while문 밖에서 한다음int user = 0;
										// while문안에서 user = input.nextInt();로 받아줌
			count++;
			
			// 크거나 같거나 아니면 = 밖에없기때문에 (random > user) , (random < user) 만 작성해도됨
			if(user==random) {
				System.out.print(count+"회 만에 정답입니다");
				break;
			} else if(user>random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			}
		}
	}   	// 스캐너 닫아주기.
}
