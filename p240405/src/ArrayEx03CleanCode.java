
public class ArrayEx03CleanCode {

	public static void main(String[] args) {
		
//		[1차원 배열] 길이가 1개인 배열 =================================
		int[] arr = new int[5]; // 의미전달이 더 잘 된다
//		int arr[]= new int[5];
		// 자료형[] 참조변수 
		// 자료형[] 배열명
		
		
//		[2차원 배열] 길이가 2개인 배열 =================================
//		: 배열 생성과 동시에 초기화
		// int[][] arr2 = {arr2[0], arr2[1]}
		// int arr2[0] = {2, 4, 6}
		// int arr2[1] = {8, 10, 12}
//		int[][] arr2 = new int[][]{ {2, 4, 6}, {8, 10, 12} }; // arr2는 배열명으로 본다.
		int[][] arr2 = {{2, 4, 6}, {8}}; // arr2는 배열명으로 본다.
//		int[][] arr2 = {
//				{2, 4, 6}, 
//				{8, 10, 12} 
//				}; // arr2는 배열명으로 본다.
		
//		int arr2[][] = { {2, 4, 6}, {8, 10, 12} }; 
//		int[] arr2[] = { {2, 4, 6}, {8, 10, 12} }; // 문법상 가능하지만 사용x 
		 
		// 2. 값 설정
//		arr2[0][0] = 2;
//		arr2[0][1] = 4;
//		arr2[0][2] = 6;
//		arr2[1][0] = 8;
//		arr2[1][1] = 10;
//		arr2[1][2] = 12;
		
		System.out.println("행 길이 >> " + arr2.length);
		System.out.println("첫 번째 행의 열 길이 >> " + arr2[0].length);
		System.out.println("두 번째 행의 열 길이 >> " + arr2[1].length);
		
		for(int[] ar: arr2) {  
			for(int num: ar) {
				System.out.print(num + " "); 
			}
			System.out.println();
		}
	}
}
