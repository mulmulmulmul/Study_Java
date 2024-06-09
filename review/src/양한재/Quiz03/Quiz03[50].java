/*
 * [양한재]=====================
 * size라는 멤버 변수가 굳이 필요 해 보이지 않습니다.
 * 코드에서 size를 생성자에서만 쓰는데, 
 * 그냥 매개변수 값을 직접 배열 크기에 넣으면 좋을 것 같습니다.
 * 
 * push 메서드에서 조건문이 왜 top<5 인지 모르겠습니다.
 * 입력받은 배열의 5가 아니면  에러가 나기때문에,
 * 5 대신에 배열의 크기를 넣어야 합니다.
 * =============================
 */
class ArrayStack {
	int[] arr;
	int top = -1;
	int size;
	int peek() {
		return arr[top-1];
	}

	ArrayStack(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	void push(int Item) {
		top++;
		if(top<5) {
			arr[top]= Item;
			System.out.println("Insterd Item : " + arr[top]);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}

	}
	int pop() {
		top--;
		if(top>=0) {
		} else {
			System.out.println("스택이 비었습니다!");		
		}
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
		
		System.out.println("\ntop에 있는 아이템 출력!" + stack.peek());
		
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());

	}

}
