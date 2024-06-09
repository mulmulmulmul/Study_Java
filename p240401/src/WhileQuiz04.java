import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {

		/* ==========================================
		 * 1~10 사이의 정수 1개를 입력받은 후,
		 * 랜덤값을 생성하여 사용자가 입력한 정수를 맞추기
		 * 
		 * [입력 형태]
		 * 1~10 사이의 정수 1개 입력 >> 3
		 * 
		 * [출력 형태]
		 * 7 1 8 7 3 (일치할때 랜덤값을 더이상 생성하지 않음)
		 * 5회 실행해서 찾았다! (몇번만에 맞추는지 출력
		 * ==========================================
		 */
		
		//1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		//2. 정수 입력 
		System.out.print("1~10 사이의 정수 1개 입력 >> ");
		int user = input.nextInt();
		
		int computer = 0; // 사용자가 1부터 작성하므로 0으로 초기값 설정해도 오류 없다.
		int count = 0; // 반복문 실행 횟수
		
		//3. do~while문 작성 - 반복문 내에 랜덤값 생성
		do{ 
			count++; //실행 횟수 증감식
			computer = (int)(Math.random() * 10) + 1; //반복문 내에 랜덤값 적기!!!
			System.out.printf("%d ", computer); //랜덤값 반복 출력 
			
			if(computer == user) 
				break;
			
		} while(true); // 무한루프
		
		System.out.printf("\n%d회 실행해서 찾았다!", count);

		
		/*
		 * 3-1. while문으로 작성한 케이스
		 * 
		 * int count = 0;
		 * 
		 * while(true) {
		 * 	computer = (int)(Math.random() * 10) + 1;
		 * 	System.out.printf("%d ", computer);
		 * 	
		 * 	count++
		 * 	
		 * if(computer == user)
		 * 	break;
		 * 
		 * }
		 * 
		 *  System.out.printf("\n%d회 실행해서 찾았다!", count);
		 * 
		 */
	
		
		
		input.close();
		
	}
	
}