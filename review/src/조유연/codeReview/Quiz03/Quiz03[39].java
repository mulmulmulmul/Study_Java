/*
 * [조유연]
 * 1. top의 증감식이나 arr에 num을 저장하는 코드는 if문 내부에 속하는 것이 
 * 더 보기에 깔끔해 보입니다.
 * 2. push를 하지 않은 채 peek()를 출력하면 arr[-1]이 출력될 수도 있으므로 
 * -1로 초기화된 top 변수 이외의, 인덱스를 따져보는 변수가 필요한 것 같습니다.
 */

class ArrayStack{
	int[] arr;
	int top = -1;
	
	public ArrayStack(int size) {
		arr = new int[size];
	}
	
	int peek() {
		return arr[top];
	}
	
	void push(int num) {
		if(top + 1 == arr.length) {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
			return;
		}
		
		top++;
		arr[top] = num;
		System.out.println("Inserted Item : " + num);
	}
	
	int pop() {
		if(top == -1) {
			System.out.println("스택이 비었습니다!");
			return top;
		}
		
		return arr[top--];
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
