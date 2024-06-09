/*
 * [조유연]
 * 1. ArrayStack 생성자는 배열의 길이를 매개변수로 입력받습니다.
 * 그리고 arr에 입력된 길이 만큼의 배열을 생성하여 그 배열의 주소를 참조할 수 있도록
 * 주소값을 저장해주어야합니다.
 * 
 * 2. push(int num) 함수에서 스택이 꽉 찼을 경우 
 * 스택이 꽉 찼다는 출력문을 조건문을 이용해서 작성해야 합니다.
 * 
 * 3. pop() 함수는 arr 배열에 원소가 저장된 순서대로
 * 한 개씩 원소를 return 할 수 있어야 합니다.
 * 현재 pop() 함수에는 리턴값이 없습니다.
 * 
 * 4. pop() 함수는 int형 배열에 저장된 int 값들을 하나씩 반환하므로,
 * void가 아닌 int형으로 반환형이 선언되어야합니다. 
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
