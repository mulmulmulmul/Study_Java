import java.util.Scanner;

/*
 * [소국진] =================================
 * 안녕하세요.
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
	Scanner input = new Scanner(System.in);
	
	// 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하기
	int random = (int)(Math.random()*10 + 1);
	int count = 0;
	
	// 출력형태 "숫자입력"
	System.out.println("*** 숫자를 맞추어 보세요(1~10)***");
	System.out.println();
	System.out.println("숫자 입력 : ");
	int user = input.nextInt();
	
	// 사용자가 입력한 값과 랜덤값을 비교 후 출력하기
	if(user < random) 
		System.out.println("컴퓨터의 숫자가 더 큽니다");
	else if(user > random) 
		System.out.println("컴퓨터의 숫자가 더 작습니다");
	
	// 사용자가 랜덤값을 맞출 때까지 정수를 입력하게 만들기.
	return;
	
	
	// 반복문 실행 횟수표시하기
	}
	
	// System.out.println((증감한 변수값+)"번만에 정답입니다");

	
	}


