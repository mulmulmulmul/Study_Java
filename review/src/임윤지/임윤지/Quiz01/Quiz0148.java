package Quiz01;

//[임윤지]
// 팩토리얼 값 도출 시 해당 숫자가 0!으로 고정되어 나옵니다.
// return;이 아닌 break;로 사용하시고 조건식도 수정하셔야 할 거 같습니다.

import java.util.Scanner;

public class Quiz0148 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
		return;
		
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
		}
		
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
