
class Baseball {
	// [static field] ====================================
	static int count;
	
	// [instance method] =================================
	void increment() {
		count++;
	}

	void decrement() {
		count--;
	}
	// Baseball.count로 해야 하지만 멤버라서 그냥 작성
	
	void baseballInfo()	 {
		System.out.println("현재 개수 : " + count);
	}
}	

public class StaticEx02 {

	public static void main(String[] args) {

		System.out.println(Baseball.count);
		
		Baseball b1 = new Baseball();
		b1.increment();
		b1.baseballInfo();

		Baseball b2 = new Baseball();
		b2.increment();
		b2.baseballInfo();

		System.out.println(Baseball.count);
	}

}
