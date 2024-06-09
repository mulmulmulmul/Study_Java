import java.util.Scanner;
/*--[장태일]
 * Scanner 입력 구문의 반복
 * 
 * While(true) 무한반복문을 썻으면 if문 하나만 써서 break조건만 걸어야 하는것이 좋을듯 하다.
 * true문 안에서 if문이 아닐 때 else일때 break를 썻기 때문에scanner가 반복된다 생각
 * 
 * break로 나와서 뭐. 그다음 뭔데. 라고 생각든다.
 * break는 반복문 내에서 조건문과 함께 사용하고 반복문 탈출의 의미가 있는데
 * 이 구문은 아닐때 탈출하고 그래서 뭐 라고 생각든다.
 * 
 * 팩토리얼 출력 코딩을 재귀호출 방식으로 했으면 더 좋았을 것이라 생각든다/
 * 
 */
public class Quiz0141 {

	public static void main(String[] args) {

		//1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
		Scanner scan = new Scanner(System.in);
		System.out.printf("1~10 사이의 정수 입력 : ");
		int userValue = scan.nextInt();
		
		//1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
		while(true) {
			if(userValue>10 || userValue<1) {
				System.out.printf("1~10 사이의 정수 입력 : ");
				userValue = scan.nextInt();
				
			}else
				break;
		}

		
		//1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
		int result = 1;
		for(int i = 1; i<=userValue; i++) {
			result*=i;
		}
		
		System.out.printf("%d! : %d", userValue, result);
	}

}
