/*
 * [이홍준] 코드리뷰 =======================
 * 1. 문제를 제대로 보지 않으신 것 같습니다.
 * 	문제에서 출력 문구는  >> "1~10 사이의 정수입력 : "
 * 입력된 정수가 1~10이 아닌경우 반복해서 출력 문구("1~10 사이의 정수입력 : ")를 출력하고
 * 다시 정수 1개를 입력받아서 1~10인 경우 입력받은 정수를 팩토리얼로 계산하는 문제였습니다.
 * 
 * 반복문을 사용할 때는 for, while, do~while문을 사용해야 합니다.
 * 		// while =================================
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
//		
 * 2. 팩토리얼 부분은 잘 작성을 해주셨지만 출력이 잘못됐습니다.
 * 해당 재귀 메소드를 사용할 경우 출력은 아래처럼 작성되어야 합니다.
 * System.out.println(useValue + "! : " + factorial(userValue);
 * 
 * 3. 또한 메인메소드는 하나만 실행이 되므로 복사하거나 이름을 변경하시면 안됩니다.
 * 	public static void main1(String[] args) X
 * 
 * 
 * 
 * 
 */



import java.util.Scanner;

public class Quiz01 {

	public static void main1(String[] args) {
//		[메서드 정의]
//		사용자에게 정수 2개를 받아 팩토리얼 값을 구하려고 한다.	
//		입력 값은 1에서부터 10까지의 정수만 가능하다.
//		만약 1~10 이외의 값을 입력하면 다시 입력 받도록 한다.
		
//		[1-1] 정수형 userValue를 선언하여, 사용자에게 정수 1개 입력 받아 저장하기
		
//		1-1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
//		1-2. 정수 1개 입력 및 출력
		System.out.print("정수 1개 입력하세요");
		int UservalueOne = input.nextInt();
				
//		[1-2] 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하기
		int num1 = 15; 
		if(num1>=11 && num1<=20) {
			System.out.println("다시 입력하세요");
		
		int num2 = 22;
		if(num2>=20) {
			System.out.println("다시 입력하세요");
					
		}
		
		}
//      [1-3] 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하기		
		public static int factorial(int num) {
			if(num == 1)
				return 1;
			else
				return num * factorial(num-1);
		}
		
		public static void main(String[] args) {
			System.out.println("10! = " + factorial(10));
		}
				
		
}

}

