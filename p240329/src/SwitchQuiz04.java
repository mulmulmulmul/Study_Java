import java.util.Scanner;

public class SwitchQuiz04 {

	public static void main(String[] args) {

		/*
		 * 컴퓨터와 가위바위보를 하자! ====================
		// 가위(1), 바위(2), 보(3)
		
		// [입력 형태]
		// 가위(1), 바위(2), 보(3) 중 하나를 입력하시오... 1
		 * 컴퓨터가 만든 랜덤값: 2
		 * 
		 * [출력 형태]
		 * 당신이 이겼습니다. 
		 * 당신이 졌습니다.
		 * 비겼습니다.
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하시오");
		int user = input.nextInt();
		input.close();
		
		int computer = (int)(Math.random()*3)+1;
		System.out.println("컴퓨터가 만든 랜덤값 : "+computer);
		
		switch(computer-user) {
		case -1: case 2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 졌습니다.");
			break;
		} 
		
	}
}
