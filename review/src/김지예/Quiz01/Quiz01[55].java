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
 * 평가 : 쓰려다가 만 코드 같다.
 * 1. 왜 반복문구가 아니라 "정수입니다", "아닙니다" 를 썼는가
 * 2. 팩토리얼 계산은 어디갔는가
 * 3. if문의 조건문이 이상하게 되어있는가. (userValue >= 1 || userValue <=10) 으로 하는게 더 정확했을 것.
 * 
 * 
 */
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//1번
		Scanner input = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력하세요.");
		int userValue = input.nextInt();
		
		if(userValue <= 10) {
			System.out.println("1~10사이의 정수입니다");
		} else if(userValue != 10) {
			System.out.println("1~10사이의 정수가 아닙니다");
		}
		
		
		input.close();
	}
		
}
