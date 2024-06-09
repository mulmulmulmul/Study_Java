class ArrayStack0340{
	int[] arr;
	int top = -1;
	
	
	
	public ArrayStack0340(int i) {
		int top = i;
	}

	int peak() {
		return arr[top];
	}
	
	void push(int num) {
		
	}
	
}
public class Quiz0340 {

	public static void main(String[] args) {

		ArrayStack0340 stack = new ArrayStack0340(5);
		
		stack.push(20);
	}

}
