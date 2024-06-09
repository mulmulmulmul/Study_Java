/*
 * [이홍준] 코드리뷰 ============================
 * 1. while(true)는 잘 사용하셨습니다. 하지만 무한루프문에 변수 선언 시 
 * 		반복되며 선언이 되기 때문에 while문 위쪽에 변수 선언과 동시에 0으로 초기화를 시킨 후
 * while문에는 변수만 사용하면 될 것 같습니다
 *  
 * 
 */



import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userValue = 0; 					// int userValue = 0;추가
		while(true){
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();	// int 삭제
			if(userValue<=10 && userValue>=1 ) {
				System.out.println(userValue+"! = " + factorial(userValue));
				break;
			}
		}

	}
	public static int factorial(int num) {
		if(num==1)
			return 1;
		else
			return num * factorial(num-1);
	}

}
