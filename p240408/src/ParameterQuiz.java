


public class ParameterQuiz {

	public static String concat(String...args) { 
		// 문자열 이어주는 코드 작성
		String concat = "";
		
		for(String ar: args) {
			concat += ar;
		}
		return concat;
	}
	
	public static void main(String[] args) {
		String[] one = {"하나", "둘", "셋"};
		System.out.println(concat(one)); //하나둘셋
//		System.out.println(concat(String[] = {"넷", "다섯", "여섯"})); //넷다섯여섯
		System.out.println(concat("넷", "다섯", "여섯")); //넷다섯여섯
	}
}
 