
public class ParameterEx02 {
	
	// 매개변수의 타입이 배열이라면? ===========
	public static void sum(int[] args) {
		System.out.println("args : " + args);
		
		for(int ar: args) {
			System.out.print(ar+" ");
		}
		
		System.out.println();
	}
	
	// =========================================
	
	public static void main(String[] args) {

//		sum();		// Error! 인수 없음
//		sum(1, 2);  // Error! type불일치
		sum(new int[] {3, 5}); //인수는 배열 1개
//		sun({3, 5}); // Error! new int[] 생략 불가능
		sum(new int[0]); // 길이가 0인 배열
//		sum(null); // 참조값 없음
		
		
	}

}
