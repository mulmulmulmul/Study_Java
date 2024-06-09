/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> O
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> O
 * 
 * 평가 : 1. 정수형 변수 userValue가 와야할 부분이 result가 먼저 오고 그 뒤에 userValue를 선언한 점.
 * 2. if문 내에서 else는 굳이 없어도 된다 치는 부분에서 sysout과 break 부분이 온점.
 * 3. 그로 인해서 다소 난잡하게 보이는 코드 작성 방식
 * 그 외에는 다른 문제점이 보이지 않는다.
 */
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 정수형 변수 userValue를 선언
		int reslut = 1;
		
		// 조건문 실행
		while (true) {
			System.out.print("1 ~ 10 사이의 정수 입력 : ");
			int userValue = input.nextInt(); // 사용자에게 정수 1개를 입력 받아 저장
			
			if (userValue >= 1  && userValue <= 10) { // 사용자가 1~10 이외의 정수를 입력시 다시 입력 받도록 코딩 작성
				for (int i=1; i<=userValue; i++) {
					reslut *= i;
				}
				System.out.printf("%d! : %d", userValue, reslut);
				break;
			}
		}
		// 메모리 해제
		input.close();
	}
}
