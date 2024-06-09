import java.util.Scanner;


/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * 이 부분을
 * 
	if (userValue<1 || userValue>10) {
	} else {
		break;
	}
	
	다음과 같이
	
	if (userValue>=1 && userValue<=10)
		break;
		
	표현하는 것이 좀 더 간단해보일 것 같습니다.
	
 * 
 * 나머지는 전체적으로 가독성이 좋은 코드라고 생각합니다. 고생하셨습니다.
 * 
 */
public class Quiz01 {

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
