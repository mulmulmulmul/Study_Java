/*
 * [김형준]
 * factorial 문을 짜는 코드는 간결하게 잘 하신 것 같다
 * while 문이 코드가 좀 긴 것 같고 else if (userValue <=0)
 * 으로 하셔야 factorial 1값이 출력 되는데 출력이 안 되었다.
 * 코드 작성 후 확인을 좀 더 하셔야 될 것 같다
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		
		while(true) {
			if(userValue > 10) {
				System.out.println("다시입력하세요. ");
				userValue = input.nextInt();
				continue;
			} else if (userValue <= 1) {
				System.out.println("다시입력하세요");
				userValue = input.nextInt();
				continue;
			} else {
				num = userValue;
				break;
			}
		}
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}	
		
		System.out.println(num + "! : " + result);
	}

}
