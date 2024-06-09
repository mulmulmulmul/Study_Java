package test;

class ArrayStack {
	int[] arr;
	int top = -1;

	// 1. 배열 길이 지정
	ArrayStack(int num) {
		this.arr = new int[num]; // int -> Integer로 boxing됨 (자동)
	}
	
	public void push(int value) { // 변수명 element로 보완
		
		if(top<arr.length-1) { 
//			top++;
			arr[++top] = value; // 0 1 2 3 4 - 내부적으로는 배열 요소 Integer 객체의 field값에 값을 설정한 형태
			System.out.println("Inserted Item : " + arr[top]);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}
	
	public int pop() {
		if(top>=0) {
			return arr[top--]; // 리턴하고 감소는 불가능, 리턴문에서 후감소해주면 해결
		}
		// 조건 1개짜리로 처리해주는 게 더 깔끔
		System.out.println("스택이 비었습니다!");
		return top;
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
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		
	}

}
