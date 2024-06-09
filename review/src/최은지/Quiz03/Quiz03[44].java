/*
 * [최은지]================================================
 * 
 * ArrayStack에 배열을 이용해 변수를 선언합니다.
 * 
 *  pop 메소드에서는 push메소드와 반대로 꺼내주는 코드 작성이 필요합니다.
 *   -> push가 초기화 한 top값에서 ++ 증가식을 사용했다면 
 *   	pop는 -- 감소식을 사용
 *   -> 또한 리턴값 설정이 필요합니다.
 *   
 *========================================================
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
