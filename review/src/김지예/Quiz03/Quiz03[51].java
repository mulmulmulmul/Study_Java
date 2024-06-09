/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> X
 * 2. push 메소드를 정의 했는가. >> X
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 1. ArrayStack 생성자에서 충분히 클래스 멤버에 접근할 수 있었는데 멤버변수 int[]arr를 활용 못한점.
 * 2. push 메소드에 for 문으로 시도한 것은 좋았음. 하지만 내부에 변수 i를 선언하지 않아도 됐음.
 * 3. 때문에 top이 제대로 활용 되지 못함.
 * 4. 때문에 peek 메소드가 제대로 실행되지 못함.
 * 5. pop 메소드에서는 static 이 쓰인점, else 부분이 쓰이지 못한점, (static을 쓰게 되면 return이 실행되지 않음)
 * 
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
