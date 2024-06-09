/*
 [송서현] =========================================
  
    1. 팩토리얼 출력하는 코딩이 필요할 것 같습니다.
    2. 범위가 1~10 사이라서 -1입력이 됐을경우 정수 재입력이 안되는것 같습니다.
  =================================================
  
 */



import java.util.Scanner;

public class Quiz01 {

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
