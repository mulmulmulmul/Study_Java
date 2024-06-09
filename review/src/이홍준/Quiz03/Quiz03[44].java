 /*
 * [이홍준] 코드리뷰 ==================
 * 1. 객체의 매개변수가 1개인 경우의 생성자 내에서
 * 	arr의 1차배열의 길이를 설정해주셔야 합니다. 
 * 2. push() 메소드는 배열의 값을 설정해주는 메소드입니다. 
 * 	if 조건문을 사용하여 각배열에 값을 넣어주고 넣어줄때마다 top의 값을 증가시켜야 합니다.
 * 	배열의 길이를 초과할 경우초과 메세지를 출력해야 합니다.
 * 3. 반환형이 int 인 pop() 메소드는 조건문으로 증가시켜준 top을 활용하여
 * 	값을 꺼내오는 메소드입니다. 반환형이 있는 경우는 return을 사용하여 값을 내보내줘야 합니다.
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
