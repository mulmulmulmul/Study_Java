/*
[문항2]  컴퓨터가 생성한 1~10 사이의 랜덤값을 맞추시오.
마지막에는 사용자가 랜덤값을 몇 번 만에 맞췄는지(횟수) 출력하시오.

2.1. 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하시오. [5점]
2.2. 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오. [5점]
2.3. 사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하시오. [10점]
2.4. 사용자가 몇 번만에 랜덤값을 맞췄는지 출력하시오. [10점]
 
 */
package quiz2;
/*
 * [김현빈] ===================================
 * 랜덤값은 한번만 받아도 되요 >> 반복문 밖으로
 * 스캐너로 사용자의 값 받아야 해요
 * 
 */

public class Quiz0206 {

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
