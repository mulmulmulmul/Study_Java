
/*
 [송서현] =========================================
  
    1.ArrayStack 클래스에 생성자를 정의하지 않았습니다.
    2.ArrayStack 클래스에 push 메소드를 정의하지 않았습니다.
    3.ArrayStack 클래스에 pop 메소드를 정의하지 않았습니다.
    
  =================================================
  
 */

/*
[문항3]  stack 메모리 구조를 Java로 간단히 구현하시오.

3.1. ArrayStack 클래스에 생성자를 정의하시오. [10점]
- 스택의 크기는 생성자로 설정한다.
- 즉, 생성자를 통해 1차원 배열 생성하여 멤버 변수 arr에 저장하시오.

3.2. ArrayStack 클래스에 push 메소드를 정의하시오. [15점]
- push 메소드는 스택에 값을 저장한다.
- 즉, push 메소드를 통해 멤버 변수 arr에 정수값이 저장된다.
- 저장되는 값이 배열의 길이를 초과하면 ‘스택이 꽉 찼습니다! 용량 초과!’를 출력하시오.

3.3. ArrayStack 클래스에 pop 메소드를 정의하시오. [15점]
- pop 메소드는 스택에 값을 꺼내온다.
- 즉, push 메소드를 통해 멤버 변수 arr의 정수값이 리턴된다.
- 배열에 저장된 값을 모두 꺼내오면, ‘스택이 비었습니다!’를 출력하시오.

 
 */


class ArrayStack{
	int[] arr;
	int top = -1;
	
	
	ArrayStack(int[] arr){
		this.arr = arr;

	}
	
	
	int peek() {
		return arr[top];
	}
	
	
	int push() {

		System.out.println("스택에 값을 저장 : " + this.arr);

		return this.arr;
	}
	
	
	int pop() {

		return;
		
	}
	
	
}


public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		stack.push();
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		int[] arr = {20,15,10,55,8};
			
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek() );
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		

		
	}

}
