import java.util.Scanner;


/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * 	factorial 메서드에서, if else를 통해 구현하셨는데
 * 	return을 만나면 아래줄은 실행이 안 된다는 것을 이용해서
 * 
 * 		if (userValue == 1)
 *			return 1;
 *		return userValue * factorial(userValue-1);
 *
 *	이렇게 else문을 제외하고 작성하시면 가독성이 정말 쪼금 더 괜찮아질 것 같습니다.
 *  그리고 Scanner close 해주시면 좋을 것 같아요. 고생하셨습니다.
 *	
 */
public class Quiz01 {

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
