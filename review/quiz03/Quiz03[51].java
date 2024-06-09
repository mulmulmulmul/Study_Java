/*
 * [정은경] ==================================
 * - push() 메소드의 for문에서 배열의 길이는 변수 i보다 top의 크기와 비교하는 게 좋을 것 같습니다.
 * - 인수로 입력한 값을 배열의 각 인덱스에 저장해야 합니다.
 * - pop() 메소드에서 탑의 크기가 0과 같지 않으면 배열에 저장된 값을 출력해야 합니다.
 */
class ArrayStack{
	int[] arr;
	int top = -1;
	
	public ArrayStack(int i) {
		int arr[] = new int [5];
	}

	int peek() {
		return arr[top];
	}
	
	public void push(int num) { // 값 저장
		for (int i = 0; i<arr.length-1; i++) {
			System.out.println(i);
		}
		System.out.println("스택이 꽉 찼습니다! 용량 초과!");
	}
	
	public static int pop ( ) { // 리턴
		if (top ==0) {
		System.out.println("스택이 비었습니다!");
		return -1;
		}
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
		
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		
	}

}
