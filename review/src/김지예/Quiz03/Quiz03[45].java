/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> O
 * 2. push 메소드를 정의 했는가. >> O
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 1. push 메소드에서 변수 i를 설정할 이유가 전혀 없음.
 * 2. pop 메소드가 왜 타입이 String 으로 되어있는지 모르겠음.
 * 그냥 pop에 설정되어있는 값을 다시 빼는 방식의 수식을 쓰면됨.
 * 3. pop이 static에 할당이 될 이유도 전혀 없음 그냥 호출되어 명령이 나오면 되므로 그 이외의 용도는 없음.
 * 4. 다만 pop 메소드는 리턴이 되야 하므로 다른 타입을 쓰는 것이 좋음.
 * 5. 전체적으로 push 메소드에 힘준게 보임.
 */
class ArrayStack{
	int[] arr; 			
	int top = -1;
	
	int peek() {
		return arr[top];
	}
	public ArrayStack(int length) {
		this.arr = new int[length];
	}
	
	// method
	// arr의 길이는 설정 됐으니 arr배열에 값을 넣어준다.
	 
		void push(int num){
			int i = 0;
			if(i < arr.length) {
				arr[i] = num;
				System.out.println("Inserted Item : " + num);
				i++;
				top++;
			} else {
				System.out.println("스택이 꽉 찼습니다! 용량 초과!");
			}
			
				
			
		
	}
	public static String pop(){
		
		return null;
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
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
	}

}
