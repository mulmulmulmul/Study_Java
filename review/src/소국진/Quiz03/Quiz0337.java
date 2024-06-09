

/* [소국진] =======================
 * 
 * 안녕하세요.
 * 
 * pop()에서
 * 
 * 		if(top != -1) {
	        int pop = arr[top];
	        arr[top--] = 0;
	        
	        int temp = arr[4];
	        arr[4] = 0;
	        top--; -> top 3
	        
	        return temp;
		}
	        
 	이 부분을 pop되는 인덱스를 0으로 삭제해주신 거라고 봐도 될까요?
 	인상깊었습니다.

 * 고생하셨습니다.
 */
class ArrayStack0337{
	int[] arr;
	int top = -1;
	
	int peek() {
		return arr[top];
	}

	ArrayStack0337(int num){
		arr = new int[num];
	}

	void push(int newNum) {
		
		if (arr.length-1 > top) {
			top++;
			arr[top] = newNum;
			System.out.println("Inserted Item : "+ newNum);
		}else
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		
	}
	
	int pop() {
		if(top != -1) {
	        return arr[top--];
		}else {
			System.out.println("스택이 비었습니다!");
			return top;
		}
	}
	
	
}
public class Quiz0337 {

	public static void main(String[] args) {

		ArrayStack0337 stack = new ArrayStack0337(5);
		
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
