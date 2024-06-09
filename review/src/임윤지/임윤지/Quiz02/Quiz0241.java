package Quiz02;

//[임윤지]
//값 출력이 나올 수 있게 잘 입력하셨습니다. 
//그렇지만, for(;;) 무한루프 구문은 프로그램이 의도하지 않은 방식으로 동작할 수 있기 때문에 for 문이나 while문을 권장합니다.

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
