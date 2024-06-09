/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> X
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> X 
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> X
 * 
 * 평가 : 
 * 1. 왜 else문에 break;를 쓰는 건지 모르겠음. 어차피 조건 맞으면 탈출이라서
 * 2. input.close부분에서 제대로된 위치가 아녔음.(메모리 누수) 
 * 
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int random = (int)(Math.random()*10+1);
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");
		int count=1;
		
		for(;;) {
			System.out.printf("숫자 입력 : ");
			int userValue = input.nextInt();
			
			if(userValue>random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
				count++;
			} else if (userValue<random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				count++;
			} else {
				System.out.printf("%d번만에 정답입니다.",count);
				break;
			}
		}
		
		input.close();
	}

}
