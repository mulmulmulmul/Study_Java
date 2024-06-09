/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> X
 * 2. push 메소드를 정의 했는가. >> X
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 문제만 적혀져 있음 다른 부분은 세부적으로 건드리지 않았음.
 * 설명을 다시 듣고 다시 리팩토링 해야 할 듯 싶음.
 */
class ArrayStack {
	int[] arr;
	int top = -1;
	
	ArrayStack(int i) {
		this.top = top+i;
	}

	int push(int num1) {
		top++;
		System.out.println("Inserted Item : " + num1);
		return num1;
	}
	
	void pop() {
		top--;
		return;
	}
	
	int peek() {
		return arr[top];
	}
}
public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
	}

}
