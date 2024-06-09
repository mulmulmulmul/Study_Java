import java.util.Scanner;


/*
 * [소국진] =================================
 * 안녕하세요.
 * 
 * 저희가 맞출 때까지 작업을 해야 하기 때문에 반복문을 이용할 수 있습니다.
 * 그런데 몇 번을 시행해야 할 지를 모르기 때문에, while문의 무한루프를 이용하면 될 것 같습니다.
 * 탈출조건으로 if(num == random)일 때 break;를 준다면 무한루프를 탈출할 수 있습니다.
 * 
 * 그리고 몇 번 시도했는지 기록해야 하기 때문에 int count 같은 변수가 필요할 것입니다.
 * 
 * 고생하셨습니다.
 * 
 */
public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤값을 동일하게 입력하세요.");
		
		int userValue = input.nextInt();
		
		
		int random = (int)(Math.random() *10) + 1;
		System.out.println("1~10 랜덤값 : " + random);

		if(userValue == random) {
			System.out.println("%s번만에 정답입니다");
		} else if (userValue >= random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다");
		} else {
			System.out.println("컴퓨터의 숫자가 더 큽니다");
		}
		input.close();

		
	}

}
