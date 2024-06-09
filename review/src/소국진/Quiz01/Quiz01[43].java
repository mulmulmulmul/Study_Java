
import java.util.Scanner;

/* [소국진] ================================
 * 
 * 제 코드 같습니다. 혹시 아닌가요?
 * 다시 살펴보고 느낀 것은
 * 
 * int userValue;를 0으로 바로 초기화하는 것이 더 좋아보입니다.
 * 
 * 또한 sysout에서 factorial(userValue)의 결과를 출력하는 것 보다는,
 * 그전에 int facResult = factorial(userValue)를 추가하는 것이
 * 코드가 한 줄 길어지더라도 가독성 측면에서 더 좋을 것 같습니다. 
 * 
 */
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
