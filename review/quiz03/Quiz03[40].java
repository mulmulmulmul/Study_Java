/*
 * [정은경]==========================
 * - 생성자를 통해 배열 arr의 길이를 설정해주어야 합니다. --> arr = new int[i]
 */
class ArrayStack{
	int[] arr;
	int top = -1;
	
	
	public ArrayStack(int i) {
		int top = i;
	}

	int peak() {
		return arr[top];
	}
	
	void push(int num) {
		
	}
	
}
public class Quiz03 {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
	}

}
