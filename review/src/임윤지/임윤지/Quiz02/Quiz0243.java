package Quiz02;

//[임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다. 
// continue; 문이 없어도 같다라는 조건이 만족하지 못하면 while 문으로 다시 올라가기 때문에 생략가능합니다.

import java.util.Scanner;

public class Quiz0243 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("**** 숫자를 맞추어 보세요 1~10 ****");
		
		Scanner input = new Scanner(System.in);
		int userValue;
		
		int count = 0;
		
		while(true) {	
			System.out.print("숫자 입력 : ");
			count++;
			userValue = input.nextInt();
			if(userValue == random) {
				System.out.println(count + "번만에 정답입니다. ");
				break;
			} else if(userValue < random) {
				System.out.println("컴퓨터 숫자가 더 큽니다. ");
				continue;
				
			} else if(userValue > random) {
				System.out.println("컴퓨터 숫자가 작습니다. ");
				continue;
				
				
				
			}
		}
	}

}
