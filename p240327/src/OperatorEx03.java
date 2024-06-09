
public class OperatorEx03 {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 3;
		
		System.out.println("크니? " + (n1 > n2));
		
		//계산값을 계속 쓰고 싶으면 변수로 선언한다.
		//1. result라는 변수를 먼저 만든다. 2.대입의 오른쪽을 비교한다. 3. 결과를 대입한다.(실제 저장은 1)
		boolean result = n1 > n2;
		System.out.println("result >> " + result);
	
		System.out.println("다르니? " + (n1 != n2));
		System.out.println("같니? " + (n1 == n2));
		
	}

}
