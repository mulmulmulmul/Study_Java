/*
 * [최은지]===========================================

 * do while문은 조건과 상관없이 실행이 먼저 이루어짐.
 * 실행결과에 문제는 없지만,
 * 실행 조건이 주어져 있는 해당 문제에서는
 * while문이 더 적절할 것 같습니다...!
 *
 * ====================================================
 */
import java.util.Scanner;

public class Quiz01 {

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
