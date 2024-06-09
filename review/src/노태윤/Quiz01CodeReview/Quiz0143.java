//노태윤===================================
//
//=========================================
import java.util.Scanner;

public class Quiz0143 {
	// class 를 선언해서 하는것보다 while문으로 간단하게쓰는게 보기좋아보임
	static int factorial(int num) {
		if(num == 1)
			return 1;
		
		return num * factorial(num-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int userValue;

		while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = sc.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		sc.close();
		
	}
}
