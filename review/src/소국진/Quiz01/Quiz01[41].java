import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 * 
 * sysout을 두 번 출력하는 부분은 while 안에 있어도 좋을 것 같습니다.
 * else를 사용하기보다 조건식(바깥범위:1~10 외의 수) 대신 조건식(포함되는 수:1~10)를 주고, 이 안에서 break문을 사용하면 될 것 같습니다.
 * 그러면 읽어야 할 중요한 코드(메세지 출력, 정수입력 받기)가 while 안에, if 안에 포함되는 형태가 아니라 while 안에만 포함되는 형태가 되어 가독성이 더 좋을 것 같습니다.
 * 
 * 
 * 		while(true){
 * 			if(userValue>10 || userValue<1) {
				System.out.printf("1~10 사이의 정수 입력 : ");
				userValue = scan.nextInt();
			}else
				break;
		}
			를
			
		while(true){
			System.out.printf("1~10 사이의 정수 입력 : "); // 중요한 코드. 위와 비교해 들여쓰기 1번 줄어듬
			userValue = scan.nextInt(); // 중요한 코드. 들여쓰기 1번 줄어듬
			if(userValue >= 1 && userValue <=10 ){
				break;
			}
	
 * 
 * 강사님께서 말씀하셨듯이 if문이 괄호가 있다면 else에도 괄호를 주면 좋을 것 같습니다.
 * 
 * 팩토리얼 부분을 깔끔하게 출력하신 것 같습니다.
 * 
 * 고생하셨습니다.
 * 
 */
public class Quiz01 {

	public static void main(String[] args) {

		//1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
		Scanner scan = new Scanner(System.in);
		System.out.printf("1~10 사이의 정수 입력 : ");
		int userValue = scan.nextInt();
		
		//1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
		while(true) {
			if(userValue>10 || userValue<1) {
				System.out.printf("1~10 사이의 정수 입력 : ");
				userValue = scan.nextInt();
				
			}else
				break;
		}

		
		//1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
		int result = 1;
		for(int i = 1; i<=userValue; i++) {
			result*=i;
		}
		
		System.out.printf("%d! : %d", userValue, result);
	}

}
