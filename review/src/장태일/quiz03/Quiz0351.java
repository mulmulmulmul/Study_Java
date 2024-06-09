/* 
 * [장태일
 * for문을 쓰시는것보다 if문을 쓰시는 것을 추천드립니다.
 * 어차피 하나하나 직접 넣어주는 것이기 때문입니다.
 * 
 * pop분에서 if가 아닐때의 return값도 넣어주시는것이 나을것같습니다.
 * 또한 그냥 int pop()을 쓰시는것이 더 나을것같습니다.
 */
class ArrayStack51{
	int[] arr;
	int top = -1;
	
	public ArrayStack51(int i) {
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
public class Quiz0351 {

	public static void main(String[] args) {

		
		ArrayStack51 stack = new ArrayStack51(5);
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
