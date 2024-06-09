
class Item { // [필드]를 상수
	// field : instance field 
	int year;
	String name;
	final String company; 
	
	// construct
	public Item() {
		this.company = "다이소";
	} // final field JVM이 null로 초기화
	
	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}
	
	// setter
	void setName(String company) {
		this.name = name;
	}
	
//	// Compile Error 발생 이유 : 
	// final fidle company는 생성자에서 초기화한 값이 변경될 수 없다. setter는 객체를 생성한 이후에 값을 변경하는 메소드. 
	// setter를 쓴다 = 이미 객체가 생성되었다. = 이미 생성자에 의해 필드가 초기화되었거나, jvm에 의해 초기화되었다.
//		void setCompany(String company) {
//		this.company = company; 
//	}

	// method
	void showInfo() {
		System.out.printf("생산년도 : %d, 제품명 : %s, 제조회사 : %s\n", year, name, company);
	}
}

public class FinalEx02 {

	public static void main(String[] args) {

		Item item = new Item(2022, "곰돌이", "다이소"); // "곰돌이", "다이소"는 constant pool(literal), 문자열 주소는 heap의 field
		item.showInfo();
		
//		// Error! 값 변경 금지
//		item.company = "이마트"; // final인 field가 이미 다이소로 초기화돼서 값이 변경될 수 없다.
		
		item.name = "곰순이"; // final 필드가 아닌 일반적인 필드. 값 변경 가능
		// 단, 외부 접근을 통한 값변경은 허용하면 안 된다.
		
		// final field에 값 설정 안 되는 이유
		// setter는 객체 생성 후 변수의 값을 변경하는 메소드여서, 객체 생성시 초기화되는 final field 값을 변경할 수 없다.
		Item itemTwo = new Item(); // final field는 각각의 객체가 가질 수 있다. 생성자에서 반드시 초기화를 마쳐야 한다.
//		itemTwo.setCompany("롯데마트"); 
		itemTwo.showInfo();
		
	}

}
