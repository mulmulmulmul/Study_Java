/*
 * [이홍준] 코드리뷰 ========================
 * 1. 반복문을 통해 입력하게 하여야 합니다.
 *  while(true) {
			count++;
			System.out.printf("숫자 입력 : ");
			int userValue = scan.nextInt();
			
			if(userValue < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			}else if(userValue > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			}else {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
			}
			
		}
		System.out.printf("%d번만에 정답입니다.", count);
 */


import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하기
	int random = (int)(Math.random()*10 + 1);
	int count = 0;
	
	// 출력형태 "숫자입력"
	System.out.println("*** 숫자를 맞추어 보세요(1~10)***");
	System.out.println();
	System.out.println("숫자 입력 : ");
	int user = input.nextInt();
	
	// 사용자가 입력한 값과 랜덤값을 비교 후 출력하기
	if(user < random) 
		System.out.println("컴퓨터의 숫자가 더 큽니다");
	else if(user > random) 
		System.out.println("컴퓨터의 숫자가 더 작습니다");
	
	// 사용자가 랜덤값을 맞출 때까지 정수를 입력하게 만들기.
	return;
	
	
	// 반복문 실행 횟수표시하기
	}
	
	// System.out.println((증감한 변수값+)"번만에 정답입니다");

	
	}


