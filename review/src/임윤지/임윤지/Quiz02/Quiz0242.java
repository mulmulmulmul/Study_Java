package Quiz02;

//[임윤지]
//값 출력이 나올 수 있게 잘 입력하셨습니다. 
//if(userValue == random) 문을 더 자연스럽게 if else 뒤에 적었으면 더 좋았을 거 같습니다. break; 문을 아래에 작성하는 것이 더 자연스럽습니다.

import java.util.Scanner;

public class Quiz0242 {
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
