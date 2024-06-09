
/*
 * [소국진]====================================
 * 
 * 안녕하세요.
 * 
 * 생성자로 배열의 길이를 설정하라고 하였기 때문에
 * 생성자의 코드는
 * 
 * arr = new int[i];
 * 
 * 가 되면 될 것 같습니다.
 * 
 * 문제에서 push는 반환형이 없다고 했던 것 같은데, 그러면 void로 유추할 수 있고
 * 
 * 반면 pop() 메서드의 반환형은
 * System.out.println("pop 실행 : " + stack.pop()); 에서 사용되듯 결과값이 있어야 하기 때문에 리턴형을 int로 볼 수 있습니다.
 * 
 * 고생하셨습니다.
 * 
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
public class Quiz0344 {

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
