import java.util.Scanner;


/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * int UservalueOne 변수명은 카멜케이스에 따라 첫글자를 소문자로 작성하시는 게 좋을 것 같습니다.
 * 또한 UservalueOne를 통해 값을 저장했다면 이를 사용하는 코드가 있으면 좋을 거 같습니다.
 * 
 * 사용자의 입력을 여러번 반복시키려면 반복문을 사용해야 하는데, for문과 while문 중
 * 횟수를 몇 번 반복해야 할지 모르기 때문에 루프문을 사용하시면 될 거 같습니다.
 * 
 * 고생하셨습니다.
 */

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

