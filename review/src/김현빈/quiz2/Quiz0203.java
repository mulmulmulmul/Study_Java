package quiz2;
/*
 * [김현빈] ===================================
 * 탈출문을 if문 한개로 줄일 수 있어요 else
 * 
 */
import java.util.Scanner;

public class Quiz0203 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(( Math.random() * 10 ) + 1);
		int userValue;
		int time = 0;
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		while(true) {
			System.out.printf("숫자 입력 : ");
			userValue = sc.nextInt();
			time++;
			
			if(userValue == random)
				break;
			
			if(userValue > random)
				System.out.println("컴퓨터의 숫자가 더 작습니다.");	
			else
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			
		}
		
		System.out.println(time + "번 만에 정답입니다.");
		sc.close();

	}
}
