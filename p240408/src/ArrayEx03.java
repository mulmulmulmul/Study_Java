
public class ArrayEx03 {

	public static void main(String[] args) {

		// 1차원 배열 생성
		int[] arr = {2, 4, 6};
		
		// enhanced for loop : 값 출력
		for(int ar: arr) 
			System.out.print(ar + " ");
		
		System.out.println();
		
		// enhanced for loop : 요소 값 변경
		for(int ar: arr) {
			ar += 1;
			System.out.print(ar + " ");
		} // 요소의 값을 복사한 지역변수 값을 변경한 것이지, 요소 값을 직접적으로 변경한 것은 x
		
		System.out.println();
		
		// enhanced for loop : 출력
		for(int ar: arr)
			System.out.print(ar + " ");
	
	}
}
