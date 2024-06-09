import java.util.Scanner;

/*
 * [소국진] =================================
 * 안녕하세요.
 * 
 * for문 무한루프를 접해본 적이 적어서 생소했습니다.
 * 같은 기능이더라도 while 무한루프로 구현하시는 것이 더 좋았을 것 같습니다.
 * 
 * count++도 for문 앞으로 뺀다면 한 줄을 아꼈을 것 같습니다.
 * 
 * 고생하셨습니다.
 * 
 */
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
