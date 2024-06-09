import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 저랑 구현하신 방식이 똑같습니다.
 * 
 * 	factorial 메서드에서, if else를 통해 구현하셨는데
 * 	return을 만나면 아래줄은 실행이 안 된다는 것을 이용해서
 * 
 * 		if (userValue == 1)
 *			return 1;
 *		return userValue * factorial(userValue-1);
 *
 *	이렇게 else문을 제외하고 작성하시면 가독성이 정말 쪼금 더 괜찮아질 것 같습니다. 
 *	이미 코드 가독성이 정말 좋아요. 고생하셨습니다.
 * 
 */
public class Quiz01 {
	
	public static int factorial(int userValue) {
		if (userValue == 1) {
			return 1;
		} else {
			return userValue * factorial(userValue-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
			break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		
		input.close();
	}
	
}
