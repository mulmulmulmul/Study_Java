/*
 * [장태일]
 * 이것은 내가 쓴것...
 * 
 * 반복문이 끝난 후에 input.close();를 써서 메모리 해제를 시켜주었으면 하는 점이 아쉽다.
 * 
 */
import java.util.Scanner;

public class Quiz0153 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("1~10 사이의 정수 입력 : ");
			int userValue = input.nextInt();
			if(userValue<=10 && userValue>=1 ) {
				System.out.println(userValue+"! = " + factorial(userValue));
				break;
			}
		}

	}
	public static int factorial(int num) {
		if(num==1)
			return 1;
		else
			return num * factorial(num-1);
	}
	

}
