import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * sysout("1~10 사이의 정수 입력")이 두 번 호출되는데, while 안에 있어도 좋을 것 같습니다.
 * while문 안에 있는다면, while(true)로 무한루프를 주고 break문을 사용하면 될 것 같습니다.
 * 
 * 팩토리얼 부분을 깔끔하게 출력하신 것 같습니다.
 * 
 * 고생하셨습니다.
 * 
 */
public class Qiuz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		while(userValue < 1 || userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
		}
		
		int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result = result * i;
		}
		System.out.printf("%d! : %d", userValue, result);
		
		input.close();
	}

}
