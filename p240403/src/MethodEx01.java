// class
public class MethodEx01 {
	
	// [increment method] =================
	public static void increment(int one) { //num = one = 1
//		int var = 100;
		one++; // = 1+1 = 2
		System.out.println("1 증가 >> " + one); //num = 2
	} // 실행 종료 후 increment메서드 해제하면 여기서 생성된 변수의 정보도 모두 사라진다.

	// [main method] ===================================
	public static void main(String[] args) {
		int one = 1;
		increment(one); // 인수에 변수를 넣어도 된다. // - increment메서드 정보 사라졌으니까 one=1
		System.out.println("one >> " + one);
	}
	
	// 메서드 밖. 명령어 작성x
	
}
