/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> X
 * 2. push 메소드를 정의 했는가. >> X
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 전체적인 문제조차 다 쓰여지지 않았음.
 * 설명을 다시 듣고 참조하여 리팩토링 하는게 중요할 듯 함.
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
