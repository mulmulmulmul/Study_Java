//노태윤===============
//========================
import java.util.Scanner;

public class Quiz0149 {
	
	//class 를 선언하면 보기 더복잡해짐 그래서 반복문안이나 main 에 작성하는게 좋아보인다.
	public static int factorial(int userValue) {
		if (userValue == 1) {
			return 1;
		} else {
			return userValue * factorial(userValue-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
			break; //들어쓰기 필요함
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		
		input.close();
	}
	
}
