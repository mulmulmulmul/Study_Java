
package Quiz01;
// [임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다. 
// 아쉬운 점은 continue 사용 유무와 관계없이 동일하게 값이 도출되기 때문에 불필요하게 작성하였습니다.

import java.util.Scanner;

public class Quiz0144 {

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
