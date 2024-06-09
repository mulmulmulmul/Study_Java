/*
 * [반복문] do~while문
 * 
 * 조건에 상관없이 반복문 처음 한번은 꼭 실행하고자 할 때
 * 
 * do {
 * 	명령어;
 * 	명령어;
 * } while(조건식);
 * 
 */


public class DoWhileEx01 {

	public static void main(String[] args) {

		int index = 10; //초기값
		
		// [while문]
//		while(index < 10) { // 조건식
//			System.out.println("idx >> " + index);
//			index++;		// 증감식
//		}
		
		// [do ~ while문]
		do { 
			System.out.println("idx >> " + index);
			index++;		// 증감식
		} while(index < 13);
		
		System.out.println("반복문 실행 후 idx >> " + index);
	}

}
