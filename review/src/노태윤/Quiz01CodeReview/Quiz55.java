//노태윤
//===================================
import java.util.Scanner;

public class Quiz55 {

	public static void main(String[] args) {
		//1번
		Scanner input = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력하세요.");
		int userValue = input.nextInt();
		
		// 반복문을 쓰지않으니까 yes or no 밖에 출력이안됨.
		// 반복문 while 이나 for문을 써서 반복문안에 조건문을 넣어야함
		
		// if문을 두개썻는데 한개로 충분히 줄일수있다. 괄호안에같이넣을수있음
		if(userValue <= 10) {
			System.out.println("1~10사이의 정수입니다");
		//  ! = 10 >>> 같지않다를 적는것보단 10보다 크다를적는게 합리적이게보임
		} else if(userValue != 10) { 
			System.out.println("1~10사이의 정수가 아닙니다");
		}
	
		//	int result = 1;
		//	for (int i = 1; i <= userValue; i++) {
		//	result *= i;
		//	 }
		
		input.close();
	}
		
}
