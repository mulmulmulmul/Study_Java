package quiz3;
/*
 * [김현빈] ===================================
 * 생성자로 배열의 길이 저장 할 수 있어요 arr = new int[i]
 * arr = new int[i]
 * top은 스택의 수, 증감연산자를 사용하여 인덱스 증가, 감소
 * push : top이 배열의 길이를 다 채우면 용량초과 출력
 * 덜 채웠으면 배열의 인덱스를 증가 시키고 값을 저장
 * pop : top의 값이 0보다 작아지면 스택이 비었습니다 출력
 * 아니라면 top의 값 감소 
 */
class ArrayStack {
	int[] arr;
	int top = -1;
	
	ArrayStack(int i) {
		this.top = top+i;
	}

	int push(int num1) {
		top++;
		System.out.println("Inserted Item : " + num1);
		return num1;
	}
	
	void pop() {
		top--;
		return;
	}
	
	int peek() {
		return arr[top];
	}
}
public class Quiz0308 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
	}

}
