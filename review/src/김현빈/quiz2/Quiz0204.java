package quiz2;
import java.util.Scanner;
/*
 * [김현빈] ===================================
 * 랜덤값이 0~10이 됩니다 괄호 밖에다 +1 해야해요
 * Scanner 메모리 해제 하기!
 * count 증감식은 if문 밖 while문 안에만 넣고 하나로 줄일 수 있어요
 * continue는 불필요합니다
 * 숫자 입력 : << 반복해야해요 
 */

public class Quiz0204 {

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
