/*
 * [장태일]
 * 0이하일때 구문이 없으며, 그렇다고 10이상일때 입력이 되지 않는다.
 * while문이 2개가 동시에 돌아가 난잡.
 * 입력받는값을 어떤것으로 해도 userValue가 0으로 나온다.
 * while문으로 인해서 점차 감소했기 때문
 * 
 */
import java.util.Scanner;

public class Quiz0148 {
	
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
