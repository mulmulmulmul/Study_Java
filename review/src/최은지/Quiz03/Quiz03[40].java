/*
 * [최은지]================================================
 * 
 * 배열에 대한 값 입력이 모두 이루어지지 않았습니다.
 * > 값 저장과 출력이 불가능 
 *
 *======================================================
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
