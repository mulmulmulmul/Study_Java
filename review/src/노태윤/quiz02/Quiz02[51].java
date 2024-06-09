//노태윤//////////
//////////////////
//////////////////

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
		System.out.print("숫자 입력 : "); // 이 코드를 while문안에 반복되게 넣으면좋을것같습니다.
		int userValue = input.nextInt();
		
		int computer = 0; // 반복횟수
		int count = 0; 
		
		
		while(true) {
			count++;
			computer = (int)(Math.random() * 10 + 1); // while문안에 랜덤값을 계속생성하면안됩니다
													  // 우리가맞춰야합니다(스캐너) userValue로 값을 비교해줘야합니다	
			System.out.print("\n컴퓨터 : " + computer);
			// 컴퓨터의값을 우리가 알지않아도됩니다.
			
			if(userValue > computer) {
				System.out.println("\n컴퓨터의 숫자가 더 작습니다.");
			} else if(userValue < computer) {
				System.out.println("\n컴퓨터의 숫자가 더 큽니다");
			}
			if(userValue == computer) //if대신 else로 크거나 같거나 아닌경우는 = 밖에없기때문에 else를쓰고 break를써도됩니다.
									  //sysout(computer + "번만에 정답입니다.");
				break;
		}
		
		System.out.println("\n" + count + "번만에 정답입니다."); 
		
	}

}			// 스캐너 닫아주기 input.close();
