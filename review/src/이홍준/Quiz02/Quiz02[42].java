/*
 * [이홍준] 코드리뷰 =========================
 * 문제없이 실행됩니다.
 * if문을 두 개 사용하는 것 보다는 한 번에 작성하는 것도 좋은 방법일 것 같습니다.
 * 
 * 			if(userValue < random) {
//				System.out.println("컴퓨터의 숫자가 더 큽니다.");
//			}else if(userValue > random) {
//				System.out.println("컴퓨터의 숫자가 더 작습니다.");
//			}else {
//				System.out.printf("%d번만에 정답입니다.", count);
//				break;
//			}
 * 
 */


import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(( Math.random() * 10 ) + 1);
		int userValue;
		int time = 0;
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		while(true) {
			System.out.printf("숫자 입력 : ");
			userValue = sc.nextInt();
			time++;
			
			if(userValue == random)
				break;
			
			if(userValue > random)
				System.out.println("컴퓨터의 숫자가 더 작습니다.");	
			else
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			
		}
		
		System.out.println(time + "번 만에 정답입니다.");
		sc.close();

	}
}
