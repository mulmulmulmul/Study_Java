// 노태윤==========================
//
//=================================
import java.util.Scanner;

public class Quiz0153 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("1~10 사이의 정수 입력 : ");
			int userValue = input.nextInt();
			if(userValue<=10 && userValue>=1 ) {
				System.out.println(userValue+"! = " + factorial(userValue));
				// else문을 써야함
				// 이 sysout을 굳이 안쓰고 factorial을 출력하는 for문에써도될것같다
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
