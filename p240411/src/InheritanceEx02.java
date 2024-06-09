
class Super {
	int num;
	
	Super() {
		this(5);
	} // 자식 클래스에서 super() 호출하므로 부모의 매개변수가 없는 생성자가 반드시 있어야 한다.
	
	Super(int num){
		this.num = num;
	}
	
}

class Sub extends Super {
	
//	public Sub() {
////		super(); // 부모의 매개변수가 없는 생성자를 암시적(묵시적) 호출
//	}
}



public class InheritanceEx02 {

	public static void main(String[] args) {

		Sub ss = new Sub();
		Super s = new Super(5);
		
		System.out.println(ss.num);
		System.out.println(s.num);
	}

}
