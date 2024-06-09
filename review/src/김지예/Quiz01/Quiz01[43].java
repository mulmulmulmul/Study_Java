/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 O
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가.
 * 
 * 평가 : 문제 풀이에 있어 코드 작성 방식은 순조롭다.
 * 하지만 문제에 포함되지 않는 메소드 작성은
 * 참신하다고 여겨질 수 있는 반면에
 * 충분히 메인 메소드 내에서 이루어 질 수 있는 코드 작성 방식이
 * 문제 풀이 방법 접근이 잘못되어 있다고 판단되어진다.
 * 
 */
import java.util.Scanner;

public class Quiz01 {

	static int factorial(int num) {
		if(num == 1)
			return 1;
		
		return num * factorial(num-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int userValue;

		while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = sc.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		sc.close();
		
	}
}
