/*
 * [문항1]  사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하려고 한다.
단, 입력 값은 1에서 부터 10까지의 정수만 입력되도록 한다.
만약 1~10 이외의 값을 입력하면, 다시 입력 받도록 한다.

1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]

 */
/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> X
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> X
 * 
 * 평가 : 사용자가 정수를 입력 받는 부분까지는 구현되어있는 코드다.
 * 허나 그 뒤의 반복문 출력은 그렇다치더라도 팩토리얼 구현 코드 마저 없다.
 * 그저 입력받은 정수값을 출력하는 아주 긴 코드일 뿐이다.
 * 
 * 
 */
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		System.out.println("입력받은 정수 >> " + userValue);
		
		if(userValue >=1 && userValue <= 10 ) {
			System.out.println();
		} else {
			System.out.println("다시 입력 해주세요.");
		}
	
		
		input.close();

		
	}

}
