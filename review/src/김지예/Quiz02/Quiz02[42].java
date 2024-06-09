/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> O
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> O
 * 
 * 평가 : 1. userValue 값을 초기화 할때 세미콜론만 쓴것.
 * 2. while문 안에 쓰는 if문들 중괄호가 없음(구분 필요 : 가독성이 떨어짐)
 * 3. if문 2개 쓸거면은 while문을 (userValue != random) 으로 써서 그 뒤에 else if로 쓰는 것이 더 좋았을듯.
 * 
 */
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(( Math.random() * 10 ) + 1);
		int userValue;
		int time = 0;
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		while(true) {
			System.out.printf("숫자 입력 : ");
			userValue = sc.nextInt();
			time++;
			
			if(userValue == random)
				break;
			
			if(userValue > random)
				System.out.println("컴퓨터의 숫자가 더 작습니다.");	
			else
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			
		}
		
		System.out.println(time + "번 만에 정답입니다.");
		sc.close();

	}
}
