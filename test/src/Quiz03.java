
class ArrayStack {
	int[] arr;
	int top = -1;
	
	ArrayStack(int num) {
		arr = new int[num];
	}
	
	public void push(int value) {
		if(top<arr.length-1) {
			top++;
			arr[top] = value; // 0 1 2 3 4
			System.out.println("Inserted Item : " + value);
		} else{
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}
	
	public int pop() {
		if(top>=0) {
			return arr[top--];
		}
		else {
			System.out.println("스택이 비었습니다!");
			return top;
		}
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
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		
	}

}
