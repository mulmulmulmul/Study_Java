/*
 * [양한재]=====================
 * 랜덤값과 비교 후, 다시 입력받는 코드가 없습니다.
 * =============================
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
