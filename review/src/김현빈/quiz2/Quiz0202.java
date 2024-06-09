package quiz2;
/*
 * [김현빈] ===================================
 * 랜덤값이 0~10이 되요 +1을 괄호밖으로 >>
 * for문의 무한반복문은 비추천한다고 들었습니다.. while에 true로 가능합니다!
 * count의 증감식은 if문 밖, 반복문 안에 넣어서 한번만 입력해도 됩니다
 */
import java.util.Scanner;

public class Quiz0202 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int random = (int)(Math.random()*10+1);
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");
		int count=1;
		
		for(;;) {
			System.out.printf("숫자 입력 : ");
			int userValue = input.nextInt();
			
			if(userValue>random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
				count++;
			} else if (userValue<random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				count++;
			} else {
				System.out.printf("%d번만에 정답입니다.",count);
				break;
			}
		}
		
		input.close();
	}

}
