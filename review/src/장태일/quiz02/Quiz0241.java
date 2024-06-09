/*
 *[장태일] 
 * for(;;) 이 부분을 무한반복이지만 강사님이 쓰지 말라고 하셔서 
 * while 무한루프로 하시는것이 더 좋을듯 싶습니다.
 * 그렇게 되면 if 명령식과 else if 명령식에서
 * 증가식이 중복될 필요도 없을듯 싶습니다.
 */
import java.util.Scanner;

public class Quiz0241 {

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