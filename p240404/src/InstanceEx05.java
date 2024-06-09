
class Cat { 
	// [ 멤버 변수 : field ] ==================================================== 
	// 인스턴스(객체) 변수 - 인스턴스마다 따로 생성된다
	int age;
	String name;
	
	// 멤버 메소드 setter / getter - 메소드는 (코드 전체)가 메모리에 들어간다.
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

public class InstanceEx05 {

	public static void main(String[] args) {

		// 인스턴스 생성 : heap에 인스턴스 생성이 완료되면 주소가 지역변수에 저장된다.
		Cat happy = new Cat(); //해피
		Cat sky = new Cat(); //하늘
		
		// 인스턴스에 이름 저장
		happy.setName("해피"); 
		sky.setName("하늘");
		
		// 인스턴스에 저장된 이름 출력
		System.out.println("happy 이름 >> " + happy.getName());
		System.out.println("sky 이름 >> " + sky.getName());
		
	}

}
