/*
 * [이홍준] 코드리뷰 ============================
 * 해당 문제는 반복문을 통해 입력한 정수가 1~10사이의 정수인지 판별한 후 그 값을 팩토리얼로 계산하는 문제였습니다.
 * 반복문은 for, while, do~while문이 있으며 아래처럼 사용이 가능합니다.
 * 	// while =================================
//		while(userValue < 1 || userValue > 10) {
//			System.out.print("1~10 사이의 정수 입력 : ");
//			userValue = input.nextInt();
//		}
		// while(true) ===========================
//		while(true) {
//			System.out.printf("1~10 사이의 정수 입력 : ");
//			userValue = input.nextInt();
//			
//			if(userValue >= 1 && userValue <= 10)
//				break;
//		}
		// do~while ==============================
//		do {
//			System.out.print("1~10사이의 정수 입력 : ");
//			userValue = input.nextInt();
//		} while(userValue<1 || userValue >10);
 * 	2. 팩토리얼 계산은 if가 아닌 for로 작성하는 것이 편하며
 * 		방법은 재귀메소드를 사용하는 것과 일반 for문을 사용하는 방법이 있습니다.
 * 		재귀매소드는 MethidQuiz03을 참고하시고
 * 		for문은 아래처럼 사용하시면 됩니다.
 * int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result *= i;
		}
 * 
 */



import java.util.Scanner;
public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("정수 1개를 입력하세요");
		int userValue = input.nextInt();
		
		if (userValue < 10);
		System.out.println("정수 1개를 입력하세요");
		
		
		if (userValue == 1) 
			System.out.println(userValue + "! : " + "1");
		else if (userValue == 2)
			System.out.println(userValue + "! : " + "2");
		else if (userValue == 3)
			System.out.println(userValue + "! : " + "6");
		else if (userValue == 4)
			System.out.println(userValue + "! : " + "24");
		else if (userValue == 5)
			System.out.println(userValue + "! : " + "120");
		else if (userValue == 6)
			System.out.println(userValue + "! : " + "720");
		else if (userValue == 7)
			System.out.println(userValue + "! : " + "5040");
		else if (userValue == 8)
			System.out.println(userValue + "! : " + "40320");
		else if (userValue == 9)
			System.out.println(userValue + "! : " + "362880");
		else if (userValue == 10)
			System.out.println(userValue + "! : " + "3628800");

	}

}

