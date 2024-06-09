/*
 * [최은지]================================================
 * 
 * 두 값의 반복적인 비교가 불가능합니다.
 * 
 * 조건에 부합하지 않을 경우, 반복문을 사용해 
 * 정수입력 요청과 비교하는 과정에 대한 코드작성이 필요합니다.
 * 
 * 또한 반복횟수를 셀 수 있도록 
 * 변수선언과 증감식에 대한 코드 작성이 필요합니다.  
 *
 *======================================================
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
