import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userValue;
		int factorial = 1;
		
		while(true){
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue<=10 && userValue>=1 ) 
				break;
		}
		
		for(int i = 1; i <= userValue; i++) {
			factorial *= i; 
		}
			System.out.println(userValue+"! = " + factorial);
	}
	
}
