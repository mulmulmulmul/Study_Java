
public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 2차원 배열 생성 
		// : 행 길이는 반드시 설정 - 생략 불가능
		// : 열 길이 생략 가능
		int[][] arr2 = new int[2][]; // 기본 타입은 heap영역에 할당될 수 없다. 
		// 사실은 Integer로 바뀌어서 객체생성 된 것
		
		System.out.println("arr2 : " + arr2); 
		System.out.println("arr2[0] : " + arr2[0]); 
		System.out.println("arr2[1] : " + arr2[1]); 
		
		// 열 : 1차원 배열 생성
		arr2[0] = new int[3];
		arr2[1] = new int[] {8};
		
		// 출력 : 향상된 for문
		for(int[] ar: arr2) {
			for(int num: ar) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}
	
}
