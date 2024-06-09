
public class TypeEx03 {

	public static void main(String[] args) {
		
		// 정밀도 flaot: 6자리 
		float num1 = 3.123456789123456789F;
		//실행하면 num1 : 3.1234567 (7번째까지 출력됐지만 7번째부터는 잘못 나올 수도 있다)
		System.out.println("num1 : " + num1);

		// 정밀도 double: 15자리 
		double num2 = 3.123456789123456789;	
		//실행하면 num2 : 3.123456789123457 (15번째까지 출력됐고 15번째는 반올림)
		System.out.println("num2 : " + num2);
		
		// 몇자리까지 정확하게 표현하고싶은지에 따라 실수 자료형 선택
	}

}
 