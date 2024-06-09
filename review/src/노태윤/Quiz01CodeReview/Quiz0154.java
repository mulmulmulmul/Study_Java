//노태윤===================
//=============================

import java.util.Scanner;

public class Quiz0154 {

	public static int factorial (int num) {
		 int factorial = 1;
		 for( int i =1; i < num ; i++) {
			 factorial = factorial * i;
		 }
		return factorial;
		 //class 문에 반복문을 쓰지않고 main에 써도될것같다.
		// 클래스를 만들게되면 실행해야할게많기때문에 main에 for문을쓰는게좋아보인다.
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userValue = 0;
		// int userValue; 이렇게 선언만해도됨 만약 재귀함수를쓴다면
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			// (userValue >= 1 || userValue <= 10) 이렇게쓰는게 좋아보인다
			if (userValue<1 || userValue>10) { 
			} else { // if 밑에 break;를 쓰고 else 에는반복되길원하는걸 다시쓰는게좋아보인다
				break;
			}
		}

		System.out.println(userValue+"! : " + factorial(userValue));
		input.close();
	}

}
