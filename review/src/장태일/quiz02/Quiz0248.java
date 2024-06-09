/*
 * [장태일]
 * 입력받는 부분이 반복되는 코드가 있습니다. 이 부분만 따로 설정해주시면 좋을것 같습니다.
 * 어차피 무한루프라 탈출조건식에 맞지 않으면 계속 반복되니 참고하시는게 좋을것 같습니다.
 * 
 */
import java.util.Scanner;

public class Quiz0248 {

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