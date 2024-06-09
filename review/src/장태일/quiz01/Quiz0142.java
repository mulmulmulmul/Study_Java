import java.util.Scanner;
/* -[장태일]
 * if 문 안에서 return 을 썻다라면 factorial을 정수로 정의할 필요 없이 몇줄 줄일수 있지 않았을까
 * 
 * 나도 이분처럼 do-while을 쓰는게 더 쉬웠을수도 있다고 생각든다.
 */

public class Quiz0142 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int userValue;
		
		do {
			System.out.print("1~10사이의 정수 입력 : ");
			userValue = input.nextInt();
		} while(userValue<1 || userValue >10);
		
		System.out.printf("%d! : %d\n",userValue,fact(userValue));
		input.close();
		
	}
	
	static int fact(int num) {
		int factorial;
		if(num==1) {
			factorial = 1;
		} else { 
			factorial = num *fact(num-1);
		}
		
		return factorial;
	}

}
