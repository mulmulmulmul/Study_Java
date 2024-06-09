/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> O
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> O
 * 
 * 평가 : 전체적인 코드 구성 방식에 있어서 깔끔하고 가독성있게 보이는 코드이다
 * 본래 문제에는 없던 메소드 생성도 흠 잡을 곳 없이 깔끔하나
 * 메인 메소드 내에서 값을 받고, 메인 메소드 내에서 끝내야할 코드가
 * static에 할당되는 메모리는 남아있게 되니 조금 흠이라면 흠이겠다. 
 * 
 */
import java.util.Scanner;

public class Quiz01 {
	
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
			break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		
		input.close();
	}
	
}
