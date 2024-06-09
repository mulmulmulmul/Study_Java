/*
 * [이홍준] 코드리뷰 ========================
 * 1. 컴퓨터의 랜덤값이 무한루프에 무한적으로 생성되는 현상이 있습니다.
 * 	랜덤값은 하나만 필요하므로 반복문 위쪽에 작성해주셔야 합니다.
 * 	또한 문제 특성상 랜덤값은 random 으로 저장해주셔야 합니다.
 * 2. 유저의 값이 컴퓨터 랜덤값보다 크거나 작을 때 입력할 수가 없습니다.
 * 
 */


//컴퓨터가 생성한 1~10 사이의 랜덤값을 맞추시오.
//마지막에는 사용자가 랜덤값을 몇 번 만에 맞췄는지(횟수) 출력하시오.
//
//2.1. 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하시오. [5점]
//2.2. 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오. [5점]
//2.3. 사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하시오. [10점]
//2.4. 사용자가 몇 번만에 랜덤값을 맞췄는지 출력하시오. [10점]

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("** 숫자를 맞추어 보세요 **");
		System.out.print("숫자 입력 : ");
		int userValue = input.nextInt();
		
		int computer = 0;
		int count = 0;
		
		
		while(true) {
			count++;
			computer = (int)(Math.random() * 10 + 1);
			System.out.print("\n컴퓨터 : " + computer);
			
			
			if(userValue > computer) {
				System.out.println("\n컴퓨터의 숫자가 더 작습니다.");
			} else if(userValue < computer) {
				System.out.println("\n컴퓨터의 숫자가 더 큽니다");
			}
			if(userValue == computer)
				break;
		}
		
		System.out.println("\n" + count + "번만에 정답입니다.");
		
	}

}
