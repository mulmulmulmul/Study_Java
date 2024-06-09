package Quiz02;

//[임윤지]
//값 출력이 나올 수 있게 잘 입력하였습니다.


import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");

		int random = (int) (Math.random() * 10) + 1;
		int userValue = 0, count = 0;

		while (true) {
			count++;
			System.out.print("숫자 입력 : ");
			userValue = scanner.nextInt();

			if (userValue > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (userValue < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else {
				break;
			}

		}
		System.out.println(count + "번만에 정답입니다.");
		scanner.close();
	}

}
