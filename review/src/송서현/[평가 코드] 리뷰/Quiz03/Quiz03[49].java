/*
 [송서현] =========================================
  
    1. 보통 class는 상단에 노출하는것 같습니다. 
    2.ArrayStack 클래스에 push 메소드를 정의하지 않았던것 같습니다.
    3.ArrayStack 클래스에 pop 메소드를 정의하지 않았던것 같습니다.
    
  =================================================
  
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
