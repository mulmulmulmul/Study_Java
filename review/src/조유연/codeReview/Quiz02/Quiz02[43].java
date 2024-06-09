/*
 * [조유연]
 * 1. Scanner 리소스 해제: Scanner 리소스를 사용한 후에는 반드시 닫아야 합니다. 
 * 2. 코드 중복 제거: 사용자가 숫자를 입력하는 부분과 count를 증가하는 부분이 반복문 실행 시 공통적으로 실행될 수 있도록 하길 권장합니다!
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("**** 숫자를 맞추어 보세요 1~10 ****");
		Scanner input = new Scanner(System.in);
		int userValue = input.nextInt();
		
		int count = 1;
		
		while(true) {
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
	}

}
