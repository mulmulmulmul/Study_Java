package Quiz03;

//[임윤지]
// syntec 오류
// push 메서드 배열에 값을 저장하는 부분이 없습니다.
// pop 메서드에서는 값을 제거하는 부분이 없습니다.

class ArrayStack{
	int[] arr;
	int top = -1;
	
	public ArrayStack(int i) {
		int arr[] = new int [5];
		
	}

	int peek() {
		return arr[top];
	}
	
	public void push(int num) { // 값 저장
		for (int i = 0; i<arr.length-1; i++) {
			System.out.println(i);
		}
		System.out.println("스택이 꽉 찼습니다! 용량 초과!");
	}
	
	public static int pop ( ) { // 리턴
		if (top ==0) {
		System.out.println("스택이 비었습니다!");
		return -1;
		}
	}
	
	

}
public class Quiz0351 {

	public static void main(String[] args) {

		
		ArrayStack stack = new ArrayStack(5);
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		
	}

}
