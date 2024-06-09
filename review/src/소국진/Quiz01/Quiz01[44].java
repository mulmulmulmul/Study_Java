import java.util.Scanner;


/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * 어차피 if문 아래로는 코드가 없어서 바로 다음 루프를 실행하므로
 * continue 키워드를 빼도 동작할 것 같습니다.
 * 
 * 팩토리얼 부분을 간단하게 구현하셔서 가독성이 좋았습니다. 고생하셨습니다.
 */
public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		
		while(true) {
			if(userValue > 10) {
				System.out.println("다시입력하세요. ");
				userValue = input.nextInt();
				continue;
			} else if (userValue <= 1) {
				System.out.println("다시입력하세요");
				userValue = input.nextInt();
				continue;
			} else {
				num = userValue;
				break;
			}
		}
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}	
		
		System.out.println(num + "! : " + result);
	}

}
