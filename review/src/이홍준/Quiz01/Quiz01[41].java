/*
 * [이홍준] 코드리뷰=================================
 * 
 * 1. System.out.printf("1~10 사이의 정수 입력 : "); 코드 반복으로 
 * while문 전에 입력받아서 저장할 변수를 선언과 동시에 초기화를 한 후
 * while문 안에서 반복을 했더라면 더 깔끔해 보일 것 같습니다.
 * 
 *2. 무한반복문을 사용할 경우 if문에는 빠져나갈 조건 문제에서
 * 조건이 true인 조건을 적는게 좋습니다
 * 현재 작성된 if문에는 문제의 조건이 false인 경우를 적어놨습니다.
 * while문을 true로 무한루프를 만들때는 아래와 같은 경우가 좋다고 생각됩니다.
 * while(true) {
			System.out.printf("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
				break;
		}
 */


import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
		Scanner scan = new Scanner(System.in);
		System.out.printf("1~10 사이의 정수 입력 : ");
		int userValue = scan.nextInt();
		
		//1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
		while(true) {
			if(userValue>10 || userValue<1) {
				System.out.printf("1~10 사이의 정수 입력 : ");
				userValue = scan.nextInt();
				
			}else
				break;
		}

		
		//1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
		int result = 1;
		for(int i = 1; i<=userValue; i++) {
			result*=i;
		}
		
		System.out.printf("%d! : %d", userValue, result);
	}

}
