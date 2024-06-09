/*
 * [메소드] method
 * - 기능, 동작
 * 
 * [메소드 정의]
 * 리턴형 메소드명(자료형 변수명) { //리턴형=리턴값의 자료형=반환형 //() 안은 매개변수. 파라미터. 있어도/없어도 된다.
 * 		명령어;
 * 		명령어;
 * 		return 값; // 리턴도 있어도/없어도 된다.
 * } // 명령어가 모여서 기능이 된다.
 * 
 * 
 *	[메소드 호출]
 *	메소드명(인수);
 *
 * 매개변수	: parameter 파라미터
 * 인수		: argument 아규먼트
 *
 *	
 * 1.매개변수 O / 리턴 X
 * 2.매개변수 O / 리턴 O
 * 3. 매개변수 X / 리턴 X
 * 4. 매개변수 X / 리턴 O
 *
 */

public class MethodEx01 {
	// [main method 정의] ========================================
	public static void main(String[] args) { 
		
		// 메인 메소드는 1개만 존재
		// 메소드 내에 메소드 정의 금지
		
		System.out.println("== 1. main method 시작 ==");
		//[2. 메소드 호출]
		increment(5); // 메소드 정의 시 int형 인수 1개를 매개변수에 넣었기 때문에 ()에 int형 인수 1개가 있어야 한다.
		System.out.println("== 2. main method 종료 ==");
	} // 메인메소드 종료

	// 매개변수 num은 incerment 메소드가 실행되면 생성되고, 종료되면 사라진다.
	// 메인메소드에서 인수 num은 사용할 수 없다.
	
	// [1. method 정의] ========================================
	// [형태] 매개변수 O, 리턴 X
	// 기능 : 인수로 받은 값을 1증가 후, 출력
	// 기능에 맞는 이름. 메소드명은 소문자로 시작해야 한다.
	// void는 리턴값이 없다는 뜻. 리턴이 없어도 생략이 불가하고 void를 작성해줘야 한다.
	public static void increment(int num) { // 매개변수가 1개면 인수도 1개 꼭 있어야 하고, 타입을 맞춰야 한다.
		System.out.println("== 3. increment method 시작 ==");
		num++;
		System.out.println("1 증가된 값 >> " + num); // incerment 메소드가 실행되면 생성되고, 종료되면 사라진다.
		System.out.println("== 4. increment method 종료==");
	} // increment 메소드 실행이 끝나면 이 메소드는 메모리에서 사라지고, 호출한 위치(메인메소드)로 돌아감
	
}
