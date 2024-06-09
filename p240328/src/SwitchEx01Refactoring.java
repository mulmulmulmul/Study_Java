/*
 * [조건문] switch
 * 
 *  switch(정수값-변수 또는 간단한 식) {
 *  case 값1:
 *  	명령어;
 *  	명령어;
 *  case 값2:
 *  	명령어;
 *  	명령어;
 *  default:
 *  	명령어;
 *  	명령어;
 * }
 *  
 *  
 */


/*
 * 상수 (constant)
 * : 이름이 있는 값 = 변수와 마찬가지로 값을 저장할 수 있는 공간
 * : 초기화한 값이 고정된다 -> 변경이 불가능하다.
 * : 선언 방법은 변수와 동일하다.
 * : 변수의 타입 앞에 final만 붙여준다.
 * : ex) final int age = 10;
 */


public class SwitchEx01Refactoring {

	public static void main(String[] args) {

		//1. 변수 선언
		int num = 2;
	
		final int TWO = 2; // constant
		
		//2. switch문
		switch (num) {
		case 1:
			System.out.println("1이다");
			break;
		case TWO:
			System.out.println("2이다");
			break;
		case 3:
			System.out.println("3이다");
			break;
		default:
			System.out.println("나머지이다.");
			break;
		}
		
		//3. 실행 완료문
		System.out.println("** 실행 완료 **");
	
	}

}
