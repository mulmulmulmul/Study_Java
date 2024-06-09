/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> O
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> O
 * 
 * 평가 : 
 * 1. while문 안의 마지막 else 문에 break; 보단 바깥에 있던 횟수 정답 문구를 가져오는 것이 좋았을 것.
 * (그럼 자동으로 멈춰질 것이기 때문)
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		
		int userValue= 0;
		int random = (int)(Math.random() * 10 ) +1;
		
		int count = 0;
		
		while (true) {
			count ++;
			
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();
			
			if (random < userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (random > userValue) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else {
				break;
			}
			
		}
		System.out.println(count + "번만에 정답입니다.");
		input.close();
	}
}

