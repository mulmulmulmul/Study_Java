package quiz3;

/*
 * [김현빈] =============================================================
 * push 메소드 : 출력문만 실행하면 되기 때문에 리턴을 받지 않아도 될것같아요.
 *  arr[] 인덱스 부분에 선증감연산자를 써서 라인을 줄일 수 있어요 >> arr[++top]
 * 
 * pop 메소드 : 
 * 
 */
class ArrayStack {
	int[] arr;
	int top = -1;

	public ArrayStack(int size) {
		arr = new int[size];
	}

	int peek() {
		return arr[top];
	}

	void push(int num) {
		if (top + 1 == arr.length) {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
			return;
		}

		top++;
		arr[top] = num;
		System.out.println("Inserted Item : " + num);
	}

	int pop() {
		if (top == -1) {
			System.out.println("스택이 비었습니다!");
			return top;
		}

		return arr[top--];
	}
}

public class Quiz0301 {
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
