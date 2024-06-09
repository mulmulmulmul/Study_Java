package Quiz02;

//[임윤지]
// 값 출력이 나올 수 있게 잘 입력하였습니다.
// int num 1, 2를 지정하여 크고 작음을 비교해준 부분이 신선합니다.

import java.util.Scanner;

public class Quiz0249 {

	public static void show(int num1, int num2) {
		if(num1>num2) {
			System.out.print("컴퓨터의 숫자가 큽니다.\n");
		} else if (num1<num2) {
			System.out.print("컴퓨터의 숫자가 더 작습니다.\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		Scanner input = new Scanner(System.in);
		
		int random = (int)(Math.random()*10)+1;
		
		int count = 0;
		int userValue = 0;
		
		while(true) {
			count++;
			
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();

			show(random, userValue);
			
			if (random == userValue)
				break;
		}
		System.out.println(count + "번만에 정답입니다.");
		
		input.close();
	}

}