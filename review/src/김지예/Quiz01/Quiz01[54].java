/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> O
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> X
 * 
 * 평가 : 1. factorial 메소드 안에서 for문의 조건에
 * 			 i<num 이 아니라 i <= num으로 해야 정상적으로 작동됨.
 * 2. 메인 메소드 에서 if문에서 왜 안써도 될 else랑 break를 썼는지 의문(어차피 조건 되면 탈출 하는데)
 * 3. 왜 factorial 메소드를 static으로 써서 메모리에 남게 했나. (메인 메소드 내에서 충분히 쓸 수 있음)
 * 
 */
import java.util.Scanner;

public class Quiz01 {

	public static int factorial (int num) {
		 int factorial = 1;
		 for( int i =1; i<num ; i++) {
			 factorial = factorial * i;
		 }
		return factorial;
		 
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if (userValue<1 || userValue>10) {
			} else {
				break;
			}
		}

		System.out.println(userValue+"! : " + factorial(userValue));
		input.close();
	}

}
