
class Robot {
	// field(=멤버변수) : instance field
	int year; 
	String name ;
	String company;
	
	// constructor
	Robot() {
		this(2000, "없음", "없음");
//		this.year = 2000;
//		this.name = "없음";
//		this.company = "없음";
	}

	Robot(int year) {
		this(year, "없음", "없음");
//		this.year = year;
//		this.name = "없음";
//		this.company = "없음";
	}
	
	Robot(String name) {
		this(2000, name, "없음");
//		this.name = "페퍼";
//		this.year = 2000;
//		this.company = "없음";
	}
	
	Robot(String name, String company) {
		// 생성자 안에서 다른 생성자를 호출. 1개만 가능. '생성자' 안에서만 가능.
		//생성자 안에서 생성자를 호출할 땐 반드시 맨 위에 위치해야 한다
//		Robot(2000, name, company); //error-메소드로 인식
		this(2000, "없음", company); //1)생성자 호출 
		// 2)매개변수를 비교해 맞는 생성자를 찾아가 거기서 값을 설정
//		System.out.println("[2]"); //4)값설정 후 처리
//		this.year = 2000;
//		this.name = name;
//		this.company = company;
	}
	
	Robot(int year, String name, String company) {
		//3)여기서 값설정
//		System.out.println("[3]");
		this.year = year;
		this.name = name;
		this.company = company;
	}
	
	// method : instance method
	void showInfo() {
		System.out.printf("생산 년도 : %d, 제품명 : %s, 제조회사 : %s\n\n", year, name, company);
	} // 메서드에 지역변수가 없으므로 this가 필요없다. field라는 걸 시각적으로 보여주기 위해서는 붙일 수 있다.
}

public class InstanceEx08 {

	public static void main(String[] args) {
		
		Robot r1 = new Robot();
		r1.showInfo(); // 생산 년도 : 2000, 제품명: 없음, 제조회사 : 없음
		
		Robot r2 = new Robot(2017);
		r2.showInfo(); // 생산 년도 : 2017, 제품명: 없음, 제조회사 : 없음
		
		Robot r3 = new Robot("페퍼");
		r3.showInfo(); // 생산 년도 : 2000, 제품명: 페퍼, 제조회사 : 없음
		
		Robot r4 = new Robot("페퍼", "메가봇");
		r4.showInfo(); // 생산 년도 : 2000, 제품명: 없음, 제조회사 : 메가봇
		
		Robot r5 = new Robot(2025, "아틀라스", "다이내믹스");
		r5.showInfo(); // 생산 년도 : 2025, 제품명: 아틀라스, 제조회사: 다이내믹스
		
	}
}