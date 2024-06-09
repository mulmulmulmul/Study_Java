
class Robot { // 필드는 붙여쓰고 메서드는 화이트라인 하나씩
	int productYear;
	String productName;
	
	public int getProductYear() {
		return productYear;
	}
	
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
}

public class InstanceEx01 {
	// java가 모든 객체를 heap에 생성하는 이유: 주소만 알면 어디서든 접근 가능
	//리턴형이 참조형인 메서드. 주소를 리턴한다.
	public static Robot constructRobot() { 
		Robot robot = new Robot(); //heap에 robot인스턴스 생성
		robot.setProductName("옵티머스");
		robot.setProductYear(2000);
		return robot; // robot 인스턴스의 주소
	}
	
	public static void main(String[] args) {
		// constructRobot 메서드 호출
		Robot robot = constructRobot(); // robot 인스턴스의 주소가 변수에 저장
		System.out.println("로봇의 생산년도 : " + robot.getProductYear());
		System.out.println("로봇의 제품명 : " + robot.getProductName());
		System.out.println(robot);

		Robot robot2 = constructRobot();
		
		if(robot == robot2)
			System.out.println("주소 같다.");
		else
			System.out.println("주소 다르다.");
	}
}
