
public class TypeEx02 {

	public static void main(String[] args) {
		//정수형 리터럴
		int numOne = 100;
		System.out.println("numOne : " + numOne);
		
		long numTwo = 10000000000L; // 기본형이 int라서 접미사L
		System.out.println("numTwo : " + numTwo);
		
		//실수형 리터럴
		double numThree = 2.34;
		System.out.println("numThree : " + numThree);
		
		float numFour = 2.34F; // 기본형이 double이라서 접미사F
		System.out.println("numFour : " + numFour);
		
		//논리형 리터럴
		boolean bo = true; //true는 문자열이 아니라 예약어(정해져있음). 소문자로 시작
		System.out.println("논리값 : " + bo);
		
		//문자형 리터럴
		char ch = 65; // 유니코드에서 정수 65는 문자 A
		System.out.println("문자 리터럴 : " + ch);
		
		//문자열 리터럴
		String st = "안녕~";
		System.out.println("문자열 리터럴 : " + st);
		
		
	}

}
