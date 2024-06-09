import java.util.Scanner;


/*
 * [소국진] =================================
 * 안녕하세요.
 * 
 * 
 *	System.out.print("숫자 입력 : ");
	userNum = input.nextInt();
				
	이 부분은 중복이 됩니다.
	while > if 안에보다 while문 안에 바로 둘 수 있을 것 같습니다. 이렇게 되면 while문 이전의 숫자 입력하는 코드도 제거할 수 있습니다.
	
	Scanner input = new Scanner(System.in);
	System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
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
		}
	}	
	
	
 * 고생하셨습니다.
 * 
 */
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
