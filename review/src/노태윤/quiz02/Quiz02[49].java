///////////////////
//노태윤///////////
///////////////////

import java.util.Scanner;
	
//클래스 쓰지않아도, 충분히 반복문으로 표현할수있기때문에 안써도좋을것같습니다.
public class Quiz02 {
	
	public static void show(int num1, int num2) {
		// 이 if 문을 밑에 while 반복문안에 넣어도될것같습니다.
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
		
		// while문안에 위에 if문만 넣으면 엄청나게 줄어들것같습니다 
		// if , else if , else 만 적기 3개면 조건충분 random이 크거나,random이 작거나,아니거나를 써서
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