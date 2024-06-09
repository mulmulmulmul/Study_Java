/*
 * [조유연]
 * 함수의 목적을 정확히 하고 함수를 생성하는 것이 좋습니다. 
 * show()함수는 num1, num2의 값을 비교하는 함수인가요? 아니면 출력을 목적으로 하는 함수인가요?
 * 만약 전자의 경우라면 num1 == num2 인 경우도 show() 함수 안에서 처리하는 것이 더 좋아보입니다.
 * 후자의 경우라면 굳이 함수로 만들어 프로그램을 복잡하게 만들 필요가 없어 보입니다.
 * 고생많으셨습니다.
 */
import java.util.Scanner;

public class Quiz02 {

	public static void show(int num1, int num2) {
		if(num1>num2) {
			System.out.print("컴퓨터의 숫자가 큽니다.\n");
		} else if (num1<num2) {
			System.out.print("컴퓨터의 숫자가 더 작습니다.\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		Scanner input = new Scanner(System.in);
		
		int random = (int)(Math.random()*10)+1;
		
		int count = 0;
		int userValue = 0;
		
		while(true) {
			count++;
			
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();

			show(random, userValue);
			
			if (random == userValue)
				break;
		}
		System.out.println(count + "번만에 정답입니다.");
		
		input.close();
	}

}