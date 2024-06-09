/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> O
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> O
 * 
 * 평가 : 
 * 1. 그렇게 만든 무한 반복문 안의 if 를 왜 먼저 정답 출력으로 하였는가 (서순 문제)
 * 2. else if문의 continue; 부분은 넣을 필요가 없었다.
 * 3. 반복되는 userValue = input.nextInt();를 while문 바로 아래, if문 위로 올렸으면 축약이 쉬웠을것.
 * 4. Scanner input 의 메모리 누수( input.close();를 넣지 않음)
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("**** 숫자를 맞추어 보세요 1~10 ****");
		Scanner input = new Scanner(System.in);
		int userValue = input.nextInt();
		
		int count = 1;
		
		while(true) {
			if(userValue == random) {
				System.out.println(count + "번만에 정답입니다. ");
				break;
			} else if(userValue < random) {
				System.out.println("컴퓨터 숫자가 더 큽니다. ");
				count++;
				userValue = input.nextInt();
				continue;
				
			} else if(userValue > random) {
				System.out.println("컴퓨터 숫자가 작습니다. ");
				count++;
				userValue = input.nextInt();
				continue;
			}
		}
	}

}
