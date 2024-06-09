package quiz2;
import java.util.Scanner;
/*
 * [김현빈] ===================================
 * Scanner 메모리 해제 하기!
 * 랜덤생성 > 0~10까지 나와요 +1이 괄호 밖으로
 * 변수 선언 반복문 밖에서 선언 권장해요
 */
public class Quiz0214 {
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
