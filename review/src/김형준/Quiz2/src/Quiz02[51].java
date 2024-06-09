/*
 * [김형준]
 * 출력이 잘 되는데 내가 입력한 숫자도 첫 숫자만 입력이 되고
 * 나머지는 컴퓨터가 랜덤으로 맞춰버린다.
 * while문 안에서 숫자를 입력 받지 못해서 그런 것 같다.
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
