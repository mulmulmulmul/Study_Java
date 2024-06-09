
class Fruit { // Fruit 타입
	int count;
	String sort;
	// setter method =======================================================
	// 멤버 변수에 값 설정하는 메소드 
	// 메소드명 규칙 - set멤버변수명
	// 반환형 메서드명(매개변수) {
	//  멤버변수명 = 값;
	//}
	void setCount(int count) { // stack에 setcount메소드와 매개변수(==지역변수) 생성. 지역변수는 heap에 할당 x
		this.count = count; // 좌측 count는 멤버, 우측 count는 매개변수
		System.out.println("this에 저장된 주소 >> " + this);
	} // 메서드는 본인을 기준으로 자기거(매개변수)를 찾다가, 없으면 멤버를 확인한다
	
	// getter method =======================================================
	// 멤버 변수의 값을 리턴하는 메소드. 한번에 하나의 값만 리턴
	// 반환형 메서드명(매개변수) {
	//  return 값;
	// }
	// 메서드명 규칙 - get멤버변수명
	int getCount() {
		return count;
	}
}

public class InstanceEx02 {

	public static void main(String[] args) {
		// 객체 생성 (외부)
		Fruit fruit = new Fruit();
		System.out.println("참조 변수 fruit = 생성된 객체의 주소 >> " + fruit);
		// 권장하지 않는 접근
//		fruit.count;
		
		// 멤버 메소드 호출
		System.out.println("멤버변수 count >> " + fruit.getCount());
		
		fruit.setCount(3); 
		
		System.out.println("멤버변수 count >> " + fruit.getCount());
	}
}
