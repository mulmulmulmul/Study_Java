//======
//노태윤
//=======
import java.util.Scanner;

public class Quiz0148 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		//while문을 두개쓸필요가없고 하나로 합치는게좋아보인다 
		// while(true) 쓰고 밑에 조건식 그리고 다른조건을 넣을떄 else 를쓰기
		while(userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			return; // break;를 쓰는게 합리적임 위에 while문 제일위에 처음으로돌아가길 원하는 코드를적고
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
		}
		
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
