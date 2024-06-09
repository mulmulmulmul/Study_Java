import java.util.Scanner;
// 코드리뷰할게없이 잘하셨습니다. 다만 int 선언할떄 같이 붙여주면 가독성이더좋을것같애요
public class Quiz02 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		
		int userValue= 0;
		int random = (int)(Math.random() * 10 ) +1;
		
		int count = 0;
		// int userValue = 0;
		while (true) {
			count ++;
			
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();
			
			if (random < userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (random > userValue) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else {
				break;// 여기다  System.out.println(count + "번만에 정답입니다."); 
					  // 하시면 가독성이좋아질것같아요
			}
			
		}
		System.out.println(count + "번만에 정답입니다.");
		input.close();
	}
}

