import java.util.Scanner;


/*
 * [소국진] =================================
 * 안녕하세요.
 * 
 * 리뷰하려면 서로 다른 점이 있어야 하는데 제가 작성하신 것과 유사합니다.
 * 리뷰할 내용이 크게 없는 것 같습니다.
 * 
 * Scanner 객체를 닫아주면 더 좋았을 것 같습니다.
 * 
 * 고생하셨습니다.
 */
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
