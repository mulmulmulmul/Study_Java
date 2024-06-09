package string;

public class EmptyString {

	public static void main(String[] args) {
		String one = ""; 		// 빈 문자열	주소 o 
		String two = " "; 		// 공백			주소 o
		String three = null;	// 문자열 없음 	주소 x 
		
		// 출력
		System.out.println(one + "<< one");
		System.out.println(two);
		System.out.println(three);
		
		
		// [빈 문자열 확인 1] equals() =========================
		System.out.println("\n<< equlas() : 문자열 비교 >>");
		System.out.println(one.equals(""));
		System.out.println(two.equals(""));
		// Error: NPE (NullPointerException)
//		System.out.println(three.equals("")); //null은 문자열 비교 불가능
		
		
		// [빈 문자열 확인 2] length() ========================== String 메소드
		System.out.println("\n<< length() : 문자열 길이 >>");
		System.out.println("one : " + one.length());
		System.out.println("two : " + two.length()); // 공백 1개 = 문자열 길이 1개
		// Error: NPE (NullPointerException)
//		System.out.println("three : " + three.length()); //null은 길이비교 불가능 
		
		
		// [빈 문자열 확인 3] isEmpty() ========================= String 메소드 (Java 6 이후 추가)
		// : 빈 문자열만 true 처리
		// : is 붙은 메소드는 확인하는 메소드
		System.out.println("\n<< isEmpty() : true, false >>");
		System.out.println("one : " + one.isEmpty());
		System.out.println("two : " + two.isEmpty());
		// Error: NPE (NullPointerException)
//		System.out.println("three : " + three.isEmpty()); //null
		
		
		// [빈 문자열 확인 3] isBlank() ========================= String 메소드 (Java 11 이후 추가)
		// : 빈 문자열이거나 공백만으로 이뤄진 경우 true 처리
		// : white space를 어떻게 처리할 것인가?
		System.out.println("\n<< isBlank() : true, false >>");
		System.out.println("one : " + one.isBlank());
		System.out.println("two : " + two.isBlank()); //  공백도 처리 (true)
//		System.out.println("three : " + three.isBlank()); // NPE
		
		
		
	}

}
