//노태윤
//////////////////
//////////////////

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("**** 숫자를 맞추어 보세요 1~10 ****");
		Scanner input = new Scanner(System.in);
		int userValue = input.nextInt();
		
		int count = 1;
		
		while(true) { // while문안에 count++;을 넣고 코드가 반복되는부분을 줄일수있습니다.
					  // 크거나 같거나로 항을줄일수있고 아닐경우는 else로 적어서 더 줄일수있음.
					  // else 하고 break; 마지막에
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
	}      // input.close(); 써야함

}
