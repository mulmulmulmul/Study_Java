
public class ArrayEx03 {

	public static void main(String[] args) {
		
		// [1차원 배열] 길이가 1개인 배열 =================================
		int[] arr = new int[5];
		// 자료형[] 참조변수 = new 자료형[열길이];
		// System.out.println("arr >> " + arr);
		
		// [2차원 배열] 길이가 2개인 배열 =================================
		int[][] arr2 = new int[2][3]; //
		// 자료형[][] 참조변수 = new 자료형[행길이][열길이];

//		 2차원 배열의 참조변수
//		 arr2 : 참조변수 - 행의 시작 주소 
//		 arr2[0] : 참조변수 - 첫 번째 1차원 배열의 시작 주소
//		 arr2[1] : 참조변수 - 두 번째 1차원 배열의 시작 주소
		System.out.println("arr2 >> " + arr2); 
		System.out.println("arr2[0] >> " + arr2[0]); //index 0행. 1차원 배열의 주소 저장
		System.out.println("arr2[1] >> " + arr2[1]); // index 1행 
		
		System.out.println("[행을 의미하는 열의 길이(행의 길이)] arr2.lenght >> " + arr2.length);  
		System.out.println("[index 0행의 열의 길이] arr2[0].lenght >> " + arr2[0].length);
		System.out.println("[index 1행의 열의 길이] arr2[1].lenght >> " + arr2[1].length);
		
		// 2. 2차원 배열 값 설정
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		arr2[0][2] = 6;
		arr2[1][0] = 8;
		arr2[1][1] = 10;
		arr2[1][2] = 12;
		
		// 3. 값 출력
		
		// 3-1. 중첩 for문 =================================================
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 3-2. 중첩 for문 : 내장변수 length 사용 ==============================
	
		for(int i=0;i<arr2.length;i++) { // arr2.length = 행 길이 : Outer loop
			// arr2[].length = 열 길이 : Inner loop // arr2[행]
			for(int j=0;j<arr2[i].length;j++) { 
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 3-3. 중첩 향상된 for문 =============================================
		
		// 2차배열 arr2는 2개(행)의 1차배열을 요소로 갖는다
		for(int[] array: arr2) { // array = arr2[0], arr2[1] (참조변수)
			for(int element: array) { // element = 두 행의 모든 열에 있는 값
				// 1차 실행 시 arr2[0] 행을 순환하고, 2차 실행 시 arr2[1] 행을 순환
				System.out.print(element + " "); 
			}
			System.out.println(); // 행 사이 줄바꿈
		}
	}
}