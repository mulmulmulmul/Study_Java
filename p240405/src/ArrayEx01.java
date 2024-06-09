/*
 * [배열] array
 * : 하나의 이름으로 여러 값(요소, 원소, 객체)을 관리
 * : 여러 값(요소)이 메모리에 연속해서 할당
 * : 여러 값(요소)을 구분하기 위해 인덱스 사용
 * --> 인덱스(index)는 0부터 시작
 * 
 * : 자바는 무조건 배열을 객체(인스턴스)로 생성 --> heap 영역에 생성
 * : 주소로 접근(간접 접근)
 * 
 * : (문법) 
 *   자료형[] 참조변수 = new 자료형[길이];
 */
public class ArrayEx01 {

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
		
		// 1-2) 배열 생성
		math = new int[5]; // [] : 길이 (요소의 개수)
		//math에 int형 변수 5개의 배열의 시작주소가 저장된다 (각 index마다 주소 존재)
		
		// 배열도 heap영역에 저장되므로 jvm이 초기값 0으로 설정해준다.
		// 2. 배열 요소(원소)에 값 설정 ---------------------------------------
		math[0] = 80; // [] : 인덱스
		math[1] = 95;
		math[2] = 90;
		math[3] = 70;
		math[4] = 100;
		
		// 3. 배열 요소(원소)에 저장된 값 출력 --------------------------------
		System.out.println("math[0] >> " + math[0]);
		System.out.println("math[1] >> " + math[1]);
		System.out.println("math[2] >> " + math[2]);
		System.out.println("math[3] >> " + math[3]);
		System.out.println("math[4] >> " + math[4]);
	}

}
