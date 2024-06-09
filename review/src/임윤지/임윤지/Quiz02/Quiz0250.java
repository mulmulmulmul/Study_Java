package Quiz02;

//[임윤지]
//값 출력이 나올 수 있게 잘 입력하였습니다.
//그렇지만, Scanner 객체 생성 후 int random 값을 먼저 지정해주어서 조건문 실행 전에 먼저 랜덤값이 설정되었습니다.

import java.util.Scanner;

public class Quiz0250 {

	public static void main(String[] args) {

		// scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 초기값 설정
		int radom = (int)(Math.random() * 10) + 1;  // 정수형 변수 random 을 선언
		int count = 0; 	
		System.out.println("랜덤값 >> " + radom + "\n");
		
		// 조건문 실행 
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		
		while(true) {
			count++;
			
			System.out.print("숫자 입력 : ");
			int userValue = input.nextInt();
			
			if (radom > userValue) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else if (radom < userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (radom == userValue) {
				System.out.printf("%d번만에 정답니다.", count);
				break;
			}
		}
		
		// 메모리 해제
		input.close();
	}
}
