import java.util.Scanner;


/*
 * [소국진] =================================
 * 안녕하세요.
 * 
 * return은 함수의 종료, 반환값을 나타내는 데 사용됩니다.
 * 코드를 진행 중에 return을 만나는 경우 메인 메서드가 종료되어 프로그램이 종료될 것 같습니다.
 * return은 제거해주시는 것이 좋을 것 같습니다.
 * 
 * 저희가 맞출 때까지 작업을 해야 하기 때문에 반복문을 이용할 수 있습니다.
 * 그런데 몇 번을 시행해야 할 지를 모르기 때문에, while문의 무한루프를 이용하면 될 것 같습니다.
 * 탈출조건으로 if(num == random)일 때 break;를 준다면 무한루프를 탈출할 수 있습니다.
 * 
 * 고생하셨습니다.
 * 
 */
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
