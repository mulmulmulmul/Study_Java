/*
 * [김형준]
 * 출력형태에서 스태틱에 저장 된 factorial값을 return하여
 * userValue와 factorial(userValue)출력하여 값을 받아오는
 * 형태인데 조금 복잡하게 처리가 된 것 같다.
 */

import java.util.Scanner;

public class Quiz01 {

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
