import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * 		
 * 		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			return;
		}
		
		이 부분의 return은 반복문을 탈출하라는 의미로 작성하신 듯 한데 맞을까요?
		만약 맞다면 return을 만나면 메인 메서드가 종료될 것이므로,
		루프문을 탈출하는 키워드로는 return보다 break가 적절할 것 같습니다.
		만약 break을 사용한다면 조건식도 바꿀 필요가 있을 것 같습니다.
		
 * 
 * 고생하셨습니다.
 */
public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			return;
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
		}
		
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
