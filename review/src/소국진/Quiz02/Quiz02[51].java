
//컴퓨터가 생성한 1~10 사이의 랜덤값을 맞추시오.
//마지막에는 사용자가 랜덤값을 몇 번 만에 맞췄는지(횟수) 출력하시오.
//
//2.1. 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하시오. [5점]
//2.2. 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오. [5점]
//2.3. 사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하시오. [10점]
//2.4. 사용자가 몇 번만에 랜덤값을 맞췄는지 출력하시오. [10점]

import java.util.Scanner;

/*[소국진] =============================
 * 안녕하세요.
 * 
 * 문제에서 컴퓨터가 우리의 입력값을 맞추는 게 아니라,
 * 컴퓨터는 한 번만 숫자를 생성하고 우리가 계속 숫자를 생성해서 맞추는 것이었기 때문에
 * userValue가 루프문 안에 존재해야 할 것 같습니다.
 * 
 * 고생하셨습니다.
 */

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("** 숫자를 맞추어 보세요 **");
		System.out.print("숫자 입력 : ");
		int userValue = input.nextInt();
		
		int computer = 0;
		int count = 0;
		
		
		while(true) {
			count++;
			computer = (int)(Math.random() * 10 + 1);
			System.out.print("\n컴퓨터 : " + computer);
			
			
			if(userValue > computer) {
				System.out.println("\n컴퓨터의 숫자가 더 작습니다.");
			} else if(userValue < computer) {
				System.out.println("\n컴퓨터의 숫자가 더 큽니다");
			}
			if(userValue == computer)
				break;
		}
		
		System.out.println("\n" + count + "번만에 정답입니다.");
		
	}

}
