import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * 팩토리얼 부분이 다음과 같이 되어 있는데,  
 * 
 * 		if(num==1) {
			factorial = 1;
		} else { 
			factorial = num *fact(num-1);
		}
		
	이 부분을
		
		1: if(num == 1)
		2:		return 1;
		3: return num * fact(num-1);
		
	line:2가 실행되는 경우 line:3을 실행하지 않는 것을 이용해서
	이렇게 좀 더 간단하게 할 수 있을 것 같습니다.
	
 * 코드를 잘 짜셔서 전체적으로 읽기 쉬웠습니다. 고생하셨습니다.
 * 
 */
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
