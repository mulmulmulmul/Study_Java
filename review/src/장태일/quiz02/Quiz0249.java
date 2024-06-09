/*
 * [장태일]
 * show메서드를 새로 만들어 하시는 방법 알게 해주셔서 감사합니다.
 * 그치만 whil(true)안에서 한번에 해결하셔도 좋을것 같습니다.
 * 
 */
import java.util.Scanner;

public class Quiz0249 {

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