/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> O
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> O
 * 
 * 평가 : 1. 왜 굳이 radom값을 나타내야만 했는가
 * 2. 마지막 else if를 쓰는 거라면 else를 써도 됐지 않았을까.
 * 
 */
import java.util.Scanner;

public class Quiz02 {

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
