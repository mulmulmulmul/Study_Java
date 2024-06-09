import java.util.Arrays;

public class MethodEx04 {
	// 메인메서드는 사용자가 해당 파일을 실행했을 때, 자바가상버신에 의해 호출된다.
	public static void main(String[] args) { //[]는 배열. args에는 배열의 시작 주소가 저장된다.
		
		System.out.println(args);
		System.out.println(Arrays.toString(args)); // 매개변수 배열 args를 문자열로 바꾼다
		
	}

}
