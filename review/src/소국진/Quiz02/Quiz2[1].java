import java.util.Scanner;

/*
 * [소국진] =================================
 * 안녕하세요.
 * 
 * 리뷰하려면 서로 다른 점이 있어야 하는데 제가 작성하신 것과 유사합니다.
 * 리뷰할 내용이 크게 없는 것 같습니다.
 * 
 * 고생하셨습니다.
 */
public class Quiz2 {

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
