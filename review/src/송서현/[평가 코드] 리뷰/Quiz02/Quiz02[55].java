/*
 [송서현] =========================================
  
  	1.주제에 대한 이해가 필요할 것 같습니다.
    1.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하지 않았던것 같습니다.
    2.사용자가 몇번만에 램덤맞췄는지 출력이 없는것 같습니다.
 
  =================================================
  
 */


import java.util.Scanner;

public class Quiz02 {

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
