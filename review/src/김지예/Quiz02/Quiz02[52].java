/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> X
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> X
 * 
 * 평가 : 1. 미완성
 * 2. 첫번째 sysout 문구 다음의 출력 문구가 나옴 (굳이 띄어서 쓸거라면 끝에 \n을 넣었어야 함)
 * 3. 반복문 구성이 만들어지지 않았음
 * 4. 줄바꿈을 전혀 하지 않아 가독성이 매우 떨어짐(왜 자꾸 옆에 붙여서 쓰는건지 모르겠음)
 * 5. 반복문 실행 횟수 문구 미구성 
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


