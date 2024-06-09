
public class StringEx01 {

	public static void main(String[] args) {

		// [문자열] 문자 여러 개 연속해서 할당. 배열과 같은 형태로 메모리에 들어온다.
		String s1 = "안녕";
		String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");
		
		System.out.println("s1 : " + s1);
		System.out.println("s3 : " + s3); // = s3.toString(). 출력을 하면 toString이 자동으로 붙는다. => 문자열 "안녕" 출력

		// == : 주소 비교 
		if(s3 == s4) // 출력이 아니라서 toString이 자동으로 안 붙는다. --> 참조변수에 저장된 객체의 주소로 비교하게 된다.
			System.out.println("주소 같다");
		else
			System.out.println("주소 다르다");
		
		// equals() : 문자열 비교 //리터럴 문자열 시작주소로 비교 --> 실제 문자열로 비교하게 된다.
		if(s3.equals(s4))
			System.out.println("같은 문자열");
		else
			System.out.println("다른 문자열");
	}
}
