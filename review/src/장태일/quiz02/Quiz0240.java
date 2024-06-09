/*
 * [장태일]
 * 나랑 count++ 위치것만 다르다.
 * 
 * 
 */
import java.util.Scanner;

public class Quiz0240 {

	public static void main(String[] args) {
		// 2.1. 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하시오. [5점]
		int random = (int)(Math.random() * 10)+1;
		Scanner scan = new Scanner(System.in);
		// 2.2. 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오. [5점]
		// 2.3. 사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하시오. [10점]
		// 2.4. 사용자가 몇 번만에 랜덤값을 맞췄는지 출력하시오. [10점]
		int count = 1;
		while(true) {
			System.out.printf("숫자 입력 : ");
			int userValue = scan.nextInt();
			
			if(userValue < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			}else if(userValue > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			}else if(userValue == random) {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
			}
			
			count++;
		}
		
	}

}
