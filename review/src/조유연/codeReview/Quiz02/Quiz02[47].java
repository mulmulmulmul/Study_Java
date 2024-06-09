/*
 * [조유연]
 * 사용자가 잘못된 값을 입력했을 때 반복적으로 입력을 다시 받아야 합니다.
 * count값을 증가시키는 코드가 중복됩니다.
 * while문에 대해 다시 보시면 좋을 것 같습니다 :-3
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)((Math.random()*10))+1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = input.nextInt();
		int count = 0;
		
		if(num < random) {
			System.out.println("컴퓨터의 숫자가 더 큽니다.");
			count++;
			return;
			
		} else if (num > random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
			count++;
			return;
		} else {
			count++;
			System.out.println(count + "번 만에 정답입니다.");
		}
		
		input.close();
	}

}
