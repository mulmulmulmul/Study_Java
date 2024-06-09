public class Quiz {
	
	public static void isSub(Object element) {
		try  {
				if((Integer)element%2==0) {
					System.out.print("true");
				} else if ((Integer)element%2==1){
					System.out.print("false");
				} 
				
				} catch (ClassCastException e) {
					System.out.print("null");
				}
	}
	
	public static void main(String[] args) {
    // [문제] 배열 및 예외처리 응용문제
    //  - 배열의 값이 짝수 인 경우, true, 홀수인 경우, false로 표현하시오.
    //  - 배열의 값이 문자인 경우, null로 표현하시오.
    // 예시) 배열이 ["1", "4", "7"]인 경우, [false, true, false]로 출력되는 것이 정상입니다.
    // 예시) 배열이 ["1", "5", "4", "test"]인 경우, [false, false, true, null]로 출력되는 것이 정상입니다.

    // 기본 제공 배열
		Object[] arr = {1, 5, 3, "te", 4, 7, 9, "test", 2, 2, "o", -3, -2, 5};
    
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			isSub(arr[i]);
			if(i==arr.length-1) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println("]");
   	}
	
}
