/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> O
 * 2. push 메소드를 정의 했는가. >> O
 * 3. pop 메소드를 정의 했는가. >> O
 * 
 * 평가 : 1. 처음 부분, peek 메소드를 줄바꿈 하지 않은점.
 * 2. pop 메소드에서 return 값이 바깥으로 나와있어 에러가 난 점. 
 * 
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
