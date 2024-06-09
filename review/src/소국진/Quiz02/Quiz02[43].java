import java.util.Scanner;

/*
 * [소국진] =================================
 * 안녕하세요.
 * 
	count++;
	userValue = input.nextInt();
	
	와 같은 부분은 while > if문보다 while 안에 두어도 될 것 같습니다.
	그렇게 하려면 int count의 초기값으로 0을 주면 지금 동작과 같을 것 같습니다.
	
	if문 아래로 실행할 코드가 없어, if문 실행 이후 루프문의 맨 처음 라인으로 돌아가기 때문에 continue도 생략 가능할 것 같습니다.
 * 
 * 고생하셨습니다.
 * 
 */
public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("**** 숫자를 맞추어 보세요 1~10 ****");
		Scanner input = new Scanner(System.in);
		int userValue = input.nextInt();
		
		int count = 1;
		
		while(true) {
			if(userValue == random) {
				System.out.println(count + "번만에 정답입니다. ");
				break;
			} else if(userValue < random) {
				System.out.println("컴퓨터 숫자가 더 큽니다. ");
				count++;
				userValue = input.nextInt();
				continue;
				
			} else if(userValue > random) {
				System.out.println("컴퓨터 숫자가 작습니다. ");
				count++;
				userValue = input.nextInt();
				continue;
			}
		}
	}

}
