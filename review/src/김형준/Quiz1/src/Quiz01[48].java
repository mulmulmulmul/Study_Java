/*
 * [김형준]
 * factorial 제곱값은 제대로 출력이 되지만
 * 출력받은값!= factorial 값이 나와야 하는데
 * 0!= factorial 값이 출력되고 10을 초과한
 * 정수를 받았을 때 whule문이 실행 되어야 하는데
 * 실행을 하지 않는다.
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
