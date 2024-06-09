/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> O
 * 2. push 메소드를 정의 했는가. >> X
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 1. ArrayStack 클래스에서 굳이 멤버변수로 count를 줄 필요가 있었는가.
 * 2. 푸시 메소드에서 올라가는게 count 값이 아니라 top이 올라갔어야 함.
 * 3. 푸시 메소드 안의 if 문 조건문의 범위가 잘못설정 되어있음.
 * 4. 저 위의 문제들 때문에 peek 메소드가 제대로 실행되지 않았음.
 * 5. pop 메소드도 마찬가지로 count가 아닌 top을 하락시켜야 제대로된 메소드가 나왔음.
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
