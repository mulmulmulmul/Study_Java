/*
 * [장태일]
 * while(true) 무한반복을 사용하시고 랜덤값이 입력받은 값과 같을때를 탈출조건으로 하시는것이
 * 좋을것 같습니다.
 * return 은 메소드의 끝을 의미하기 때문에 원하는 값이 나올때까지 실행하고싶으시다면
 * 여기선 빼주시고 while(true)를 쓰시는것이 좋을것같네요
 * 
 */
import java.util.Scanner;

public class Quiz0247 {

	public static void main(String[] args) {
		
		int random = (int)((Math.random()*10))+1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = input.nextInt();
		int count = 0;
		
		if(num < random) {
			System.out.println("컴퓨터의 숫자가 더 큽니다.");
			count++;
			return;
			
		} else if (num > random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
			count++;
			return;
		} else {
			count++;
			System.out.println(count + "번 만에 정답입니다.");
		}
		
		input.close();
	}

}
