import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤값을 동일하게 입력하세요.");
		
		int userValue = input.nextInt();
		
		
		int random = (int)(Math.random() *10) + 1;
		System.out.println("1~10 랜덤값 : " + random);

		
		// if 문으로 비교하는것까지는 좋았으나, for문이나 while문을써서 값을 비교해야한다.
		// 변수 2개를 선언해줘야한다. 하나는 반복횟수에쓸 변수. 하나는 우리가 넣을값 스캐너에.
	    // 반복문안에 초기화하는것보다 밖에서 초기화하는게 나으므로 
	    // int idx = 0; (반복횟수) int userValue = 0 ; (컴퓨터와비교할값) 
		
		// 반복되어있지않는데, while문을 써서 반복문안에넣어서 sysout 숫자입력을 쓰면 좋을것같습니다.
		// 크거나 같거나 아니면 = 밖에없기때문에 (random > user) , (random < user) 만 작성해도됨
		if(userValue == random) {
			System.out.println("%s번만에 정답입니다");
		} else if (userValue >= random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다");
		} else {
			System.out.println("컴퓨터의 숫자가 더 큽니다");
		}
		input.close();

		
	}

}
