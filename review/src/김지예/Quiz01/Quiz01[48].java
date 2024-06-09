
/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> X
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> O
 * 
 * 평가 : 사용자 값을 받아서 userValue에 값을 넣는 것 까지는 좋았다.
 * 그 뒤의 반복문 구성이 제대로 만들어져 있지 않아
 * 실행이 그대로 1회 만에 중지 되며 기능이 절반밖에 만들어져 있지 않다
 * 반복문의 구성 또한 2개로 합쳐져 있지 않은 형태가 되었으며
 * 그 안에 넣은 return값은 왜 넣었는지 의문.
 * 출력문 또한 0! = n 이런 식으로 출력되어 제대로 나타나지 못했음을 확인
 * 
 */
import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			return;
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
		}
		
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
