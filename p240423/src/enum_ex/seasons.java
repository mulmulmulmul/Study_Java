package enum_ex;

enum Season{ // enum 타입 선언
	SPRING("봄", 5), SUMMER("여름", 7), FALL("가을", 9), WINTER("겨울", 12);
	
	String name; // 필드
	Integer num;

	private Season(String name, Integer num) { //매개변수가 1개인 생성자로 값 설정
		this.name = name;
		this.num = num;
		
	}
	
	@Override
	public String toString() { // 이름 값 출력하도록 오버라이딩
		return name;
	}
	
	public Integer getInteger(){ // 번호 출력하는 게터
		return num;
	}
	
}

public class seasons {

	public static void main(String[] args) {

//		System.out.println(Season.SPRING);
//		System.out.println(Season.SUMMER);
//		System.out.println(Season.FALL);
//		System.out.println(Season.WINTER);
//
//		System.out.println(Season.SPRING.name());
//		System.out.println(Season.SPRING);
		
		for(Season season: Season.values()) {
			System.out.println(season); // toString
			System.out.println(season.name()); // 상수명
			System.out.println(season.getInteger()); // integer값
			System.out.println(season.ordinal()); // 서수
		}
		
		
		
	}

}
