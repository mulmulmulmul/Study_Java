//노태윤
////////////
////////////

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)((Math.random()*10))+1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = input.nextInt();
		int count = 0;
		
		// if 문으로 비교하는것까지는 좋았으나, for문이나 while문을써서 값을 비교해야한다.
		// 변수 2개를 선언해줘야한다. 하나는 반복횟수에쓸 변수. 하나는 우리가 넣을값 스캐너에.
	    // 반복문안에 초기화하는것보다 밖에서 초기화하는게 나으므로 
	    // int idx = 0; (반복횟수) int userValue = 0 ; (컴퓨터와비교할값) 
		
		if(num < random) {
			System.out.println("컴퓨터의 숫자가 더 큽니다.");
			count++;
			return;
			
		} else if (num > random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
			count++;
			return;
		} else {
			count++; // count++를 계속쓰지않고 한번만 써도된다. if문위에 그리고 while문 안에 자동으로반복됨
			System.out.println(count + "번 만에 정답입니다.");
		}
		
		input.close();
	}

}
