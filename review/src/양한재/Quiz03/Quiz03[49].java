/*
 * [양한재]=====================
 * 메인 메서드에서 arr을 직접 만드는 것이 아니라
 * ArrayStack 클래스 생성자를 통해 배열크기를 정해야 합니다.
 * 그리고 push메서드로 배열에 값을 저장하게 만들어야 합니다.
 * =============================
 */
public class Quiz03 {

	public static void main(String[] args) {
		
		int[] arr = {
				20,15,10,55,8,5
		};
		
		ArrayStack stack = new ArrayStack(5);
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		for (int element: arr) {
			System.out.println(element);
		}
		System.out.println("\ntop에 있는 아이템 출력: " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());

	}

	//ArrayStack 클래스에 생성자를 정의하시오. 
	class ArrayStack {
		int[] arr;
		int top = -1;
		
		
		
		int peek() {
			return arr[top];
		}
	}

	
	
	
	
	
}
