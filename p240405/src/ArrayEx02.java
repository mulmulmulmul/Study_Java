
public class ArrayEx02 {

	public static void main(String[] args) {
		// [학생들의 수학 점수 저장]
//		int math01 = 80;
//		int math02 = 95;
//		int math03 = 90;
//		int math04 = 70;
//		int math05 = 100;
//		...
	
		// 1. 배열 생성 ------------------- 배열은 객체다
		// 1-1) 참조변수 선언
		int[] math; // [] : 자료형
		// 자료형[] 참조변수;
		// int형 1차원 배열의 참조변수 math를 선언
		
		// 1-2) 배열 생성
		math = new int[5]; // [] : 길이 (요소의 개수)
		// 참조변수 = new 자료형[길이];
		// int형이면서 길이가 5인 1차원 배열 생성 후, 참조변수 math에 주소 저장 (각 요소마다 주소 존재)
		// 배열의 길이는 배열을 생성할 때 정해지고, 변경할 수 없다.
		
		// 배열도 heap영역에 저장되므로 jvm이 초기값 0으로 설정해준다.
		// 2. 배열 요소(원소)에 값 설정 ---------------------------------------
		math[0] = 80; // [] : 인덱스
		math[1] = 95;
		math[2] = 90;
		math[3] = 70;
		math[4] = 100;
		
		// 3. 배열 요소(원소)에 저장된 값 출력 --------------------------------
//		System.out.println("math[0] >> " + math[0]);
//		System.out.println("math[1] >> " + math[1]);
//		System.out.println("math[2] >> " + math[2]);
//		System.out.println("math[3] >> " + math[3]);
//		System.out.println("math[4] >> " + math[4]);

		System.out.println("배열의 길이 >> " + math.length);
		//math.lenght는 변경할 수 없는 상수와도 같다.
		
		// for문 --------------------------------------------------------------
		for(int index=0;index<math.length;index++) {
			System.out.printf("math[%d] >> %d\n", index, math[index]);
		}
		
		// [enhanced for loop] 향상된 for문 -------------------------------------------------------
		// [문법]
		// for(자료형 변수명: 배열의 참조변수){ 자료형은 요소의 타입과 일치해야 한다
		//		명령어;
		// }
		// 배열에서 써야 한다.
		for(int element: math) { // element <-- math 배열의 요소 값 저장
			System.out.println(element); // 메모리에 연속으로 할당된 요소들을 처음부터 끝까지 순환하고 남은 요소가 없으면 실행 종료 
		}
		
		
	}

}
