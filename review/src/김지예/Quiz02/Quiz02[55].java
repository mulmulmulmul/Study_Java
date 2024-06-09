/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> X
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> X
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> X
 * 
 * 평가 : 1. 미완성
 * 2. 랜덤 값이 먼저 설정되지 않았음
 * 3. 반복문의 구성이 이루어지지 않았음
 * 4. if 문의 2번째 조건문이 정확하지 않음
 * 5. 줄바꿈이 일정하지 않음
 * 
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤값을 동일하게 입력하세요.");
		
		int userValue = input.nextInt();
		
		
		int random = (int)(Math.random() *10) + 1;
		System.out.println("1~10 랜덤값 : " + random);

		if(userValue == random) {
			System.out.println("%s번만에 정답입니다");
		} else if (userValue >= random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다");
		} else {
			System.out.println("컴퓨터의 숫자가 더 큽니다");
		}
		input.close();

		
	}

}
