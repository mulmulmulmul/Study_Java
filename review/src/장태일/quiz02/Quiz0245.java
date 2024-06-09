
/*
[문항2]  컴퓨터가 생성한 1~10 사이의 랜덤값을 맞추시오.
마지막에는 사용자가 랜덤값을 몇 번 만에 맞췄는지(횟수) 출력하시오.

2.1. 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하시오. [5점]
2.2. 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오. [5점]
2.3. 사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하시오. [10점]
2.4. 사용자가 몇 번만에 랜덤값을 맞췄는지 출력하시오. [10점]
 
 */

/*
 * [장태일]
 * 입력받는 부분이 없으며, 랜덤값이 계속 생성되기만 하는 무한루프 구문입니다.
 * 탈출조건을 만드셨다고 하여도 count 가 random과 같기를 증가식과 같이 쓰신것이 틀린부분같습니다.
 * Scanner input = new Scanner(System.in); 을 사용하여 이것이 random값과 같게 해야하는것이 무한루프 탈출 조건입니다
 */

import java.util.Scanner;

public class Quiz0245 {

	public static void main(String[] args) {

		int random = 0;
		int count = 0;
		
		while(true) {
			
			count++;   
			random = (int)(Math.random() * 10) + 1;
			
			System.out.println(random + " ");
			
			if(count == random) 
				break;
		}
				
			
	}

}