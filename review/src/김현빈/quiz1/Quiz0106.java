/*
 * [문항1]  사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하려고 한다.
단, 입력 값은 1에서 부터 10까지의 정수만 입력되도록 한다.
만약 1~10 이외의 값을 입력하면, 다시 입력 받도록 한다.

1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]

 */
package quiz1;
/*
 * [김현빈] ===================================
 * 1~10사이의 정수가 아니라면 다시 입력해야 하기 때문에
 * 반복문을 사용해야 좋을 것 같아요
 */
import java.util.Scanner;

public class Quiz0106 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		System.out.println("입력받은 정수 >> " + userValue);
		
		if(userValue >=1 && userValue <= 10 ) {
			System.out.println();
		} else {
			System.out.println("다시 입력 해주세요.");
		}
	
		
		input.close();

		
	}

}
