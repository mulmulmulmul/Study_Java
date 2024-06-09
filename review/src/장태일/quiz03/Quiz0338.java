
/*
 * [장태일]
 * return arr[top--]; 이 부분을 
 * 저 같은 경우에는 
 * int pop = arr[top];
	        arr[top--] = 0;
	        return pop;
 * 이렇게 하였는데 
 * 
 * 더 간결히 줄일수 있게 하는 방법을 알려주셔 감사합니다.
 */
class ArrayStack38 {
	int[] arr;
	int top = -1;
	
	public ArrayStack38(int num) {
		arr = new int[num];
	}
	
	void push(int num) {
		top++;
		if(top<arr.length) {
			arr[top] = num;
			System.out.printf("Inserted Item : %d\n",num);
		} else {
			System.out.println("스택이 꽉찼습니다! 용량초과!");
			top--;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("스택이 비었습니다!");
			return top;
		} else
		return arr[top--];
	}
	
	int peek() {
		return arr[top];
	}
}

public class Quiz0338 {

	public static void main(String[] args) {

		ArrayStack38 stack = new ArrayStack38(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		
	}

}