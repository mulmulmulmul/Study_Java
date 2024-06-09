package quiz1;
/*
 * [김현빈] ===================================
 * Scanner 메모리 해제 하기!
 * 변수선언은 반복문 밖에서 하는걸 권장해요
 */
import java.util.Scanner;

public class Quiz0114 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("1~10 사이의 정수 입력 : ");
			int userValue = input.nextInt();
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
