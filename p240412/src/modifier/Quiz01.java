package modifier;

class Fruit { // 부모 class는 완벽하지 않다. 자식이 꼭 필요한 멤버로 구성
	private int count;
	
	public Fruit() {} // 자식 때문에 넣어준 기본 생성자
	
	public Fruit(int count){
		this.count = count;
	}
	
	public void show() {
		System.out.println("현재 남은 개수는 " + this.count + "개 입니다.");
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void showInfo(){
	System.out.println("과일 정보를 출력하는 메소드입니다.");
	}
}

class Banana extends Fruit { // 부모 멤버보다 자식 멤버가 더 많거나 같다
	// [문제 2] 생성자를 이용하여 부모 class Fruit의 count field에 값 설정하시오 ====
	public Banana() {} // 컴파일러가 super() 추가 (명시적x)
	
	public Banana(int count){
		super(count);
	}
	
	// [문제 1] showInfo() 메소드를 오버라이딩(overriding)하시오 =======
	@Override
	public void showInfo() {
		System.out.println("현재 과일은 바나나입니다.");
		System.out.println("바나나는 " + super.getCount() + "개 있습니다.\n");
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// [문제 1]
		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		// 현재 과일은 바나나입니다.
		// 바나나는 0개 있습니다.
		
		// [문제 2]
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
		// 현재 과일은 바나나입니다.
		// 바나나는 10개 있습니다.
	}
}
	