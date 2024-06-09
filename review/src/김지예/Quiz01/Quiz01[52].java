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
 * 평가 : 전반적인 부분에서 매우매우 직설적이고
 * 매우매우 허술하고 잡스러운 코드이다.
 * 1. 반복문의 구성이 전혀 되어있지 않음.
 * 2. 사용자 입력을 받아 출력 하는 형식이 어떠한 조건문 안에서
 * 그 조건문을 토대로 계산되어 나오는게 아닌 코드 내에 '이미'작성되어 출력되는 것이란 점.
 * 3. 이 때문에 발생된 코드 줄의 낭비 - 차라리 case문을 쓰는 게 나을 정도
 * 4. Scanner input의 메모리 누출.
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

