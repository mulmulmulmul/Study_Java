
package Quiz01;

// [임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다. 
// 독특한 점은 팩토리얼 메서드, 메인 메서드로 작성하셔서 창의적입니다.

import java.util.Scanner;

public class Quiz0143 {

	static int factorial(int num) {
		if(num == 1)
			return 1;
		
		return num * factorial(num-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int userValue;

		while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = sc.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		sc.close();
		
	}
}
