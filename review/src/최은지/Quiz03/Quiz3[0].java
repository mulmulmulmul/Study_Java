/*
 * [최은지]================================================
 * 
 * count 값 설정이 불필요해 보입니다.
 *======================================================
 */

class ArrayStack {
	int[] arr;
	int top = -1;
	int Count = 0;

	ArrayStack(int length) {
		this.arr = new int[length];
	}

	int peek() {
		return arr[top];
	}

	void push(int push) {
		if(arr.length > Count) {
		arr[Count] = push;
		System.out.println("Inserted Item : " + push);
		Count++;
		}else if (arr.length <= Count) {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}

	int pop() {
		if (Count >= 0) {
			Count--;
			return arr[Count];
		} else {
			System.out.println("스택이 비었습니다!");
			Count--;
			return Count;
		}

	}

}

public class Quiz3 {

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
