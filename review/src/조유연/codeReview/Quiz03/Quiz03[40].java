/*
 * [조유연]
 * 1. 변수명은 변수의 기능을 담고 있는 것이 좋습니다.
 * 
 * 2. ArrayStack이라는 생성자에서는 사용자가 입력한 만큼의 길이를 가진 배열이
 * 멤버 변수 arr에 저장되어야합니다.
 * 
 * 3. 문제에서 요구한 함수명대로 함수를 생성하지 않았습니다.
 * peak()이 아닌 peek() 함수를 작성해야합니다.
 * 
 * 4. push 함수에서 스택이 꽉 차지 않았을 경우 원소를 arr에 저장하고, 
 * 스택이 꽉 찼을 경우에는 경고문을 출력해야 합니다.
 * 
 * 5. pop 함수를 구현해야 합니다. pop 함수는 스택에서 원소를 한 개씩 꺼냅니다.
 * 다만 스택이 비어서 더 이상 꺼낼 원소가 없을 경우 스택이 비었다는 출력문을 작성해야합니다.
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
