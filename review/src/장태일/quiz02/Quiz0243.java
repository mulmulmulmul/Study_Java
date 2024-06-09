/*
 * [장태일]
 * continue 부분도 안쓰셔도 될것같고, 증가식도 반복되시는것 같아 밖으로 빼셔도 될듯싶슴.
 * userValue = input.nextInt(); 이 입력부분도 계속 반복되시는것 같아
 * while(true) 무한루프 다시 읽어보시는것도 좋을듯 싶습니다.
 * 
 */
import java.util.Scanner;

public class Quiz0243 {

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