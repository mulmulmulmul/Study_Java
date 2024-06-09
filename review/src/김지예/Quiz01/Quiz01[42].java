/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> O
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> O
 * 
 * 평가 : 문제 풀이 방식에서 입력이 되고 출력이 되는 방식은 문제가 없으나
 * 왜 굳이 팩토리얼 부분을 static 메소드로 빼서 호출하는 방식을 선택했는지
 * 본인은 이해를 할 수 없는 부분이고. 메소드 호출 방식을 쓰지 않더라도
 * 충분히 메인 메소드 내부에서 풀 수 있는 문제라고 생각이 든다.
 * 메모리 활용 방식에서도 static으로 할당되는 부분에서 코드가 길어지는 점과
 * 가독성 부분에서도 static int fact 부분을 위로 올려야 하지 않나. 라는 생각이 든다.
 * 
 */
import java.util.Scanner;

public class Quiz01 {

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
