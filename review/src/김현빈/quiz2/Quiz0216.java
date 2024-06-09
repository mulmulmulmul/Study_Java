package quiz2;
import java.util.Scanner;
/*
 * [김현빈] ===================================
 * 반복문을 사용해 숫자재입력 받아야해요
 * 반복횟수 출력 >> 변수를 하나 선언해서 증감연산자로 저장할 수 있어요
 * 반복문 탈출 >> break; 를 써서 탈출가능해요
 */
public class Quiz0216 {

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
