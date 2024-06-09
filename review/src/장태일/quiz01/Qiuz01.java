import java.util.Scanner;
/*	-	[장태일]
 * 문제
 * Scanner 입력부분의 반복
 * 
 * 반복 횟수가 정해져있을시 for문을 쓰고, 정해져있지 않을 시 while을 쓰는것이 좋은데
 * 이 분은 while문을 쓰시긴 했어도 그 메리트가 없는것 같다 생각.
 * 반복 횟수가 정해져 있지 않고 원하는 값이 나올때 break가 되어야 하는데
 * 그럼 while(true) 무한루프를 쓰는거시 더 좋지 않았을까.
 * 
 * 팩토리얼을 정의할 시 재귀호출을 사용했으면
 * 더 짧고 간결했으리라 생각. - 코드를 보는데 이해가 잘 안됨
 * 
 */

public class Qiuz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		while(userValue < 1 || userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
		}
		
		int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result = result * i;
		}
		System.out.printf("%d! : %d", userValue, result);
		
		input.close();
	}

}