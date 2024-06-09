/*
 [송서현] =========================================
  
    1.ArrayStack 클래스에 생성자를 정의하지 않았던것 같습니다.
    2.ArrayStack 클래스에 push 메소드를 정의하지 않았던것 같습니다.
    3.ArrayStack 클래스에 pop 메소드를 정의하지 않았던것 같습니다.
    
  =================================================
  
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
