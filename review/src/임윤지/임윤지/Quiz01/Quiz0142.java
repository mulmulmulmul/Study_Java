package Quiz01;


// [임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다.
// 재귀함수 호출 되면서 num이 1의 경우를 제외하고 10까지의 수를 호출했을 때 팩토리얼 계산이 될 수 있도록 하였습니다.


import java.util.Scanner;

public class Quiz0142 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int userValue;
		
		do {
			System.out.print("1~10사이의 정수 입력 : ");
			userValue = input.nextInt();
		} while(userValue<1 || userValue >10);
		
		System.out.printf("%d! : %d\n",userValue,fact(userValue));
		input.close();
		
	}
	
	static int fact(int num) {
		int factorial;
		if(num==1) {
			factorial = 1;
		} else { 
			factorial = num *fact(num-1);
		}
		
		return factorial;
	}

}
