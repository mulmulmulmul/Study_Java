/*
 * [조유연]
 * 1. while문 루프가 돌 때마다 computer 변수의 값이 새로 설정됩니다.
 * 이러면 사용자는 매번 다른 랜덤값을 맞춰야합니다.
 * 2. if문을  두 번, else if 한번 사용하는 것보다는 if 와 else if 이외의 경우에 대해 코드를 작성할 때는 else를 쓰는 것이 좋습니다.
 */


import java.util.Scanner;

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
