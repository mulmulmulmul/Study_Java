
public class MethodQuiz03 {

	// [메소드 정의]
	// - 기능 : 정수 1개를 입력받은 후, 팩토리얼 출력
	// - 메소드명 : factorial, 매개변수 : 1개, 리턴값 : 없음
	// - 출력형태 : 5! = 120
	
// [ 방법 1]
//	public static void factorial(int num) {
//		int result = 1;
//		
//		for(int i=1;i<=num;i++)  
//			result *= i; 
//		
//		System.out.printf("%d! = %d\n",num, result);
//	}
	
	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));
	}						 // 5 * 4 * 3 * 2 * 1
	
// [ 방법 2 ]
// 재귀 메소드 : 재귀 호출
// return 시점을 잘 지정해야 한다.
	public static int factorial(int num) {
		
		if(num ==1)
			return 1;
		else
			return num * factorial(num-1);
		
		    // return 5 * factorial(4)
			// return 5 * 4 * factorial(3)	
			// return 5 * 4 * 3 * factorial(2)
			// return 5 * 4 * 3 * 2 * factorial(1)
			// return 5 * 4 * 3 * 2 * 1
		
	}
	
}
