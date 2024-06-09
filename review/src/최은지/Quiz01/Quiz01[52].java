/*
 * [최은지]======================================================================
 * 
 * if문의 조건식에서,
 * && 나 || 연산자를 사용하여 조건식의 범위를 결정하는 것이 더 적절할 것 같습니다.
 *  
 * 팩토리얼 값을 계산하는 코드가 작성되지 않았습니다.
 *  ================================================================================
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

