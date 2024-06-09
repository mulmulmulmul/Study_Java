/*
 * [장태일]
 * 우선 팩토리얼도 정의가 안되어있고
 * 문제잦체도 1~10사이의 정수인데 
 * 0보다 작을때도 아니란것이 설정 안되어있으면
 * !=10 을 쓰는 부정문을 쓸때도 아니라 생각.
 * 음.,
 * 
 */
import java.util.Scanner;

public class Quiz0155 {

	public static void main(String[] args) {
		//1번
		Scanner input = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력하세요.");
		int userValue = input.nextInt();
		
		if(userValue <= 10) {
			System.out.println("1~10사이의 정수입니다");
		} else if(userValue != 10) {
			System.out.println("1~10사이의 정수가 아닙니다");
		}
		
		
		input.close();
	}
		
}
