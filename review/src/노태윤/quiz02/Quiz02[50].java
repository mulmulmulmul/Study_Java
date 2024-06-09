//노태윤//////////
//////////////////
//////////////////

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 초기값 설정
		int radom = (int)(Math.random() * 10) + 1;  // 정수형 변수 random 을 선언
		int count = 0; 	
		System.out.println("랜덤값 >> " + radom + "\n"); // 삭제해도 충분히돌아가서 삭제하는게좋아보입니다.
		
		// 조건문 실행 
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		
		while(true) {
			count++;
			
			System.out.print("숫자 입력 : ");
			int userValue = input.nextInt(); // 반복문 내에서 변수선언 보다 밖에서 선언하고오는게좋습니다
											 // int userValue = 0; 반복문while안에 userValue = input.nextInt();
			
			if (radom > userValue) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else if (radom < userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (radom == userValue) { // else를 써도된다. 크거나같거나가 아니면 같기때문이다.
				System.out.printf("%d번만에 정답니다.", count); // 오타체크
				break;
			}
		}
		
		// 메모리 해제
		input.close();
	}
}
