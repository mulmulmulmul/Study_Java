/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> X
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> X
 * 
 * 평가 : 1. 반복문이 나타나질 않음 (기능 불량)
 * 2. if문 안에 쓸데없이 return;이 들어가 있음
 */
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		int random = (int)((Math.random()*10))+1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = input.nextInt();
		int count = 0;
		
		if(num < random) {
			System.out.println("컴퓨터의 숫자가 더 큽니다.");
			count++;
			return;
			
		} else if (num > random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
			count++;
			return;
		} else {
			count++;
			System.out.println(count + "번 만에 정답입니다.");
		}
		
		input.close();
	}

}
