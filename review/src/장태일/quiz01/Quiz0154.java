/*
 * [장태일]
 * 팩토리얼 부분만 재귀호출하였으면 더 깔끔했을것 같다.
 * 출력부분을 밖으로 빼셧구나
 * 이런방법도 있다고 생각들었다.
 */
import java.util.Scanner;

public class Quiz0154 {

	public static int factorial (int num) {
		 int factorial = 1;
		 for( int i =1; i<num ; i++) {
			 factorial = factorial * i;
		 }
		return factorial;
		 
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if (userValue<1 || userValue>10) {
			} else {
				break;
			}
		}

		System.out.println(userValue+"! : " + factorial(userValue));
		input.close();
	}

}