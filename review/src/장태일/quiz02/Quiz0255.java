/*
 * [장태일]
 * 입력식이 반복이 되지 않습니다.
 * while(true) 무한루프를 사용하시고 탈출조건을 만드시는게 좋을것 같습니다.
 */


import java.util.Scanner;

public class Quiz0255 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤값을 동일하게 입력하세요.");
		
		int userValue = input.nextInt();
		
		
		int random = (int)(Math.random() *10) + 1;
		System.out.println("1~10 랜덤값 : " + random);

		if(userValue == random) {
			System.out.println("%s번만에 정답입니다");
		} else if (userValue >= random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다");
		} else {
			System.out.println("컴퓨터의 숫자가 더 큽니다");
		}
		input.close();

		
	}

}
