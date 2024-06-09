/*
 * [조유연]
 * 1. push() 함수에서 매개변수로 받은 int형 변수 push는
 * 한 번에 한 개의 값만 받습니다.
 * 메인 함수에서 push 메서드를 여러 번 수행함으로써 배열에 값을 넣으므로
 * push 메서드 내부에서 반복문은 필요하지 않습니다.
 * 
 * 2. push 메서드는 스택에 값을 더 이상 넣을 수 없을 때까지
 * 외부로부터 정수를 받아 멤버 변수 arr에 저장해야합니다. 
 * 만약 스택이 꽉 차서 더 이상 값을 받지 못한다면 문제에서 요구한 출력문이 출력되게 해야합니다
 * 
 * 3. pop 메서드는 가장 최근에 저장된 원소부터 차례대로 출력합니다
 * pop 메서드를 통해 arr의 값들이 한 개씩 리턴되어야합니다.
 * pop 메서드를 구현하셔야합니다. 
 */
class ArrayStack {
	int[] arr;
	int top = -1;
	
	ArrayStack(int num) {
		this.arr = new int[num];
	}
	
	int peek() {
		return arr[top];
	}
	
	int push(int push) {
		
		while (true) {
			for (int i=0; i<arr.length; i++) {
				arr[i] = push;
				
				if (arr[0] != push) {
					arr[i+1] = push;
					break;
				}
			}
		}
		System.out.println("Inserted Item : " + push);
		return arr;
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		System.out.println("stack >> " + stack.arr[0]);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
//		stack.push(55);
//		stack.push(8);
//		stack.push(5);
		
		
		
//		System.out.println("\ntop에 있는 아이템 출력 : "+ stack.peek());
//		
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
		
	}
}
