/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> X
 * 2. push 메소드를 정의 했는가. >> X
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 1. ArrayStack 생성자 조차 생성되지 못한점.
 * 2. pekk 메소드 이외에 다른 메소드는 전혀 보이지 않은점.
 * 3. 메인 메소드 바깥에서 선언되어야할 arr 부분이 메인 메소드 안에서 변수로 이미 입력된 점.
 * 4. 메소드 안의 for 문은 무엇을 위한 건지 전혀 모르겠음.
 * 5. ArrayStack 클래스 멤버 변수를 위한 생성자,
 * push, pop 메소드를 실행하기 위한 메소드 선언부, 가 생성되어야함.
 * 
 */
public class Quiz03 {

	public static void main(String[] args) {
		
		int[] arr = {
				20,15,10,55,8,5
		};
		
		ArrayStack stack = new ArrayStack(5);
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		for (int element: arr) {
			System.out.println(element);
		}
		System.out.println("\ntop에 있는 아이템 출력: " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());

	}

	//ArrayStack 클래스에 생성자를 정의하시오. 
	class ArrayStack {
		int[] arr;
		int top = -1;
		
		
		
		int peek() {
			return arr[top];
		}
	}

	
	
	
	
	
}
