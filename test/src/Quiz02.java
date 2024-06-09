import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		Scanner input = new Scanner(System.in);
		
		int random = (int)(Math.random()*10)+1;
		
		int count = 0;
		int userValue;
		
		while(true) {
			count++;
			
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();

			if(random>userValue) {
				System.out.println("컴퓨터의 숫자가 큽니다.");
			} else if (random<userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if ( random == userValue) {
				break;
			}
			
		}
		System.out.println(count + "번만에 정답입니다.");
		
		input.close();
	}

}