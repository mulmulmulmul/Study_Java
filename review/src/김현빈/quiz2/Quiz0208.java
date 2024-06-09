package quiz2;
import java.util.Scanner;
/*
 * [김현빈] ===================================
 * 반복문 만들어서 숫자 재입력 받을 수 있어요
 * if문에 return 불필요해요 >> return은 반환형이 있는 메소드에서 쓰여요!
 */
public class Quiz0208 {

	public static void main(String[] args) {
		
		int random = (int)((Math.random()*10))+1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = input.nextInt();
		int count = 0;
		
		if(num < random) {
			System.out.println("컴퓨터의 숫자가 더 큽니다.");
			count++;
			return;
			
		} else if (num > random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
			count++;
			return;
		} else {
			count++;
			System.out.println(count + "번 만에 정답입니다.");
		}
		
		input.close();
	}

}
