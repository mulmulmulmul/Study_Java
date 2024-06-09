package interfacetype;

interface Field { 
	// 인터페이스의 필드는 무조건 상수
	// public static final
	// instance field는 허용 X (instance field는 class사용)
	int num1 = 100; // 컴파일러가 final 붙여줌
	static int num2 = 200;
	final int num3 = 300;
	public static final int num4 = 400;
}


public class Ex02 {

	public static void main(String[] args) {
		// 인스턴스 생성 불가
//		Field f = new Field()

		System.out.println(Field.num1);
		System.out.println(Field.num2);
		System.out.println(Field.num3);
		System.out.println(Field.num4);
		
//		Field.num1 = 5; // final field
	}

}
