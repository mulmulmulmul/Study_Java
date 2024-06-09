
public class Quiz01 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * num의 값이 양수이면 2 증가한 값을 result에 저장하고,
		 * num의 값이 음수이면 5 감소한 값을 result에 저장하시오.
		 * retern에 저장된 값을 출력하시오.
		 */

		int num = -1;
		
		int result = (num > 0) ? (num + 2) : (num - 5);
		
		System.out.println("result: " + result);
		
		
		
	}

}
