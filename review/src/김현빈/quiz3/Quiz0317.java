package quiz3;

/*
 * [김현빈] ===================================
 * count 불필요
 * top은 스택의 수, 증감연산자를 사용하여 인덱스 증가, 감소
 * push : 배열의 길이와 스택의 수를 비교하여
 * top이 배열의 길이를 다 채우면 용량초과 출력
 * 덜 채웠으면 배열의 인덱스를 증가 시키고 값을 저장
 * pop : top의 값이 0보다 작아지면 스택이 비었습니다 출력
 * 아니라면 top의 값 감소 
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
		if (arr.length > Count) {
			arr[Count] = push;
			System.out.println("Inserted Item : " + push);
			Count++;
		} else if (arr.length <= Count) {
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

public class Quiz0317 {

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
