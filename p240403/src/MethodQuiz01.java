
public class MethodQuiz01 {

	// [메소드 정의]
	// - 기능 : 양의 정수 2개를 받아, 누적합 출력
	// - 메서드명 : add, 매개변수 : 2개, 리턴값 : 없음
	// 2~5의 누적합 >> 14

	public static void main(String[] args) {
		// [메소드 호출]
		add(2, 5); // 2 3 4 5 의 누적합 14
 		add(5, 2); // 2 3 4 5 의 누적합 14
	}
	
	// [메소드 정의]
	public static void add(int num1, int num2) {

		int sum = 0;
		int max = 0;
		int min = 0;
//		int start = (num1 < num2) ? num1 : num2;
//		int end = (num1 > num2) ? num1 : num2;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} 	
			max = num2;
			min = num1;
	
		for(int i=min;i <=max; i++)
			sum += i;
		
		System.out.printf("%d ~ %d의 누적합 >> %d\n", num1, num2, sum);
	}
	
}

//		for(int i=num1;i<=num2;i++) // num1 < num2
// 			sum += i; 
//		for(int i=num2;i<=num1;i++) // num1 > num2
//			sum += i; 
