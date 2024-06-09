 /*
 * [이홍준] 코드리뷰 ==================
 * 1. push() 메소드의 if 조건문의 조건은 top의 범위를 배열의 길이로 설정을 해주셔야합니다.
 * 		top < arr.length
 * 		또한 top이 배열의 범위를 벗어날경우 
 * 		"스택이 꽉 찼습니다! 용량 초과!" 메세지를 내보내야하므로 
 * 		조건을 top == arr.length-1 로 해주셔야합니다.
 * 
 * 2. 반환형이 int 인 pop() 메소드는 조건문으로 증가시켜준 top을 활용하여
 * 	값을 꺼내오는 메소드입니다. 반환형이 있는 경우는 return을 사용하여
 * 	값을 내보내줘야 합니다. top이 -1일때 리턴을 사용하여 -1을 내보내고
 * 	메소드를 종료시켜야 합니다.
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
