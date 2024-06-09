/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> O
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> O
 * 
 * 평가 : 1. 반복이 되는 문구인 "숫자 입력 : " 과 userNum 입력 (while문 바로 아래에 넣어서 해결 가능)
 * 2. else문 이후에 break;는 왜 쓴 것인지 의문
 * 
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		System.out.print("숫자 입력 : ");
		int userNum = input.nextInt();
		int random = (int)(Math.random()*10) +1;
		int count = 0;
		
		while(true) {
			count++;	
			if(userNum > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
				System.out.print("숫자 입력 : ");
				userNum = input.nextInt();
			} else if(userNum < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				System.out.print("숫자 입력 : ");
				userNum = input.nextInt();
			} else {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
			}
		}	
			
		input.close();
	}

}
