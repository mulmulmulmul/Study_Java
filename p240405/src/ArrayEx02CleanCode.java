
public class ArrayEx02CleanCode {

	public static void main(String[] args) {
		// [학생들의 수학 점수 저장]
	
		// 1. 배열 생성과 동시에 요소 초기화 ------------------- 배열은 객체다
		// 차례대로 요소의 값을 초기화
		// : 반드시 길이는 생략
		//int[] math = new int[] {80, 95, 90, 70, 100}; 참조변수 선언과 배열 생성이 동시에 진행
		int[] math = {80, 95, 90, 70, 100}; // 어차피 배열은 heap에 만들어져서 new삭제, int[]중복이어서 삭제 

		System.out.println("배열의 길이 >> " + math.length);
		//math.lenght는 변경할 수 없는 상수와도 같다.
		
		// 2. 배열 요소(원소)에 저장된 값 출력 --------------------------------
		// 2-1. for문 --------------------------------------------------------------
		for(int index=0;index<math.length;index++) {
			System.out.printf("math[%d] >> %d\n", index, math[index]);
		}
		
		// 2-2. [enhanced for loop] 향상된 for문 -------------------------------------------------------
		// 배열에서 써야 한다.
		for(int element: math) { // element <-- math 배열의 요소 값 저장
			System.out.println(element); // 메모리에 연속으로 할당된 요소들을 처음부터 끝까지 순환하고 남은 요소가 없으면 실행 종료 
		}
		
	}

}
