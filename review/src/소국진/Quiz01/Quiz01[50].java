import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 저랑 구현하신 방식이 비슷합니다.
 * 
 * 저도 result를 while 바깥에서 선언했기 때문에 팩토리얼 결과를 while문을 탈출한 후에 계산하고 출력했습니다.
 * while > if > for 구조 안에서 계산하는 것보다는 그게 가독성이 조금 더 낫다고 생각했어요.
 * 
 * 그것 말고는 제가 작성한 방식과 차이가 없습니다. 코드가 잘 읽혀요. 고생하셨습니다.
 * 
 */
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
