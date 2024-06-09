import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * 반복해서 글자를 표시하고, 입력을 받기 위해서 반복문을 사용하시면 좋을 것 같습니다.
 * 저는 몇 번을 반복해야 할지 모르기 때문에 for문 보다는 while을 통해 무한루프로 작성했고
 * 조건이 맞는 경우에만 break 키워드를 통해 탈출시켰습니다.
 * 
 * 고생하셨습니다.
 * 
 */
public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("정수 1개를 입력하세요");
		int userValue = input.nextInt();
		
		if (userValue < 10);
		System.out.println("정수 1개를 입력하세요");
		
		
		if (userValue == 1) 
			System.out.println(userValue + "! : " + "1");
		else if (userValue == 2)
			System.out.println(userValue + "! : " + "2");
		else if (userValue == 3)
			System.out.println(userValue + "! : " + "6");
		else if (userValue == 4)
			System.out.println(userValue + "! : " + "24");
		else if (userValue == 5)
			System.out.println(userValue + "! : " + "120");
		else if (userValue == 6)
			System.out.println(userValue + "! : " + "720");
		else if (userValue == 7)
			System.out.println(userValue + "! : " + "5040");
		else if (userValue == 8)
			System.out.println(userValue + "! : " + "40320");
		else if (userValue == 9)
			System.out.println(userValue + "! : " + "362880");
		else if (userValue == 10)
			System.out.println(userValue + "! : " + "3628800");

	}

}

