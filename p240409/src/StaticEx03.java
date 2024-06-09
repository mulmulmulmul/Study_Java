
class Animal {
	// [field] static final field ===============
	// final field : 초기화한 값으로 값 고정 --> 값 변경 금지
	static final int COUNT = 5;
}

public class StaticEx03 {

	public static void main(String[] args) {
//		static int num = 10; //Error! int num은 지역변수
		
		System.out.println("동물 몇 마리 : " + Animal.COUNT);
//		Animal.class = 10; //Error! final field
	}

}
