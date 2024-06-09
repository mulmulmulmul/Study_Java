/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> O
 * 2. push 메소드를 정의 했는가. >> O
 * 3. pop 메소드를 정의 했는가. >> O
 * 
 * 평가 : 흠 잡을 곳이 없음.
 */
class ArrayStack{
	int[] arr;
	int top = -1;
	
	public ArrayStack(int size) {
		arr = new int[size];
	}
	
	int peek() {
		return arr[top];
	}
	
	void push(int num) {
		if(top + 1 == arr.length) {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
			return;
		}
		
		top++;
		arr[top] = num;
		System.out.println("Inserted Item : " + num);
	}
	
	int pop() {
		if(top == -1) {
			System.out.println("스택이 비었습니다!");
			return top;
		}
		
		return arr[top--];
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
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());

	}
}
