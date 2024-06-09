
import java.util.Scanner;

/*
 * [소국진] =================================
 * 제 코드 같습니다.
 * 
 * 굳이 if문을 두 개로 나눌 필요는 없었을 것 같습니다.
 * 그리고 출력문이 System.out.println("컴퓨터의 숫자가 더 작습니다."); 임을 감안했을 때
 * "컴퓨터가 어떻다"는 것이므로 조건식도 더 읽기 편하도록 (random < userValue)와 같은 형태로 뒤바꿨어야 합니다.
 * 
 */
public class Quiz02 {
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
