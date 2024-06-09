/*
 * [조유연]
 * 1. pop() 함수는 int형 배열 스택에서 값을 꺼냅니다.
 *  그 값은 int형 이므로, pop 함수도 String이 아닌 int여야합니다.
 *  
 * 2. push함수의 들여쓰기는 ArrayStack 클래스의 
 *  다른 멤버 변수나 멤버 메서드와 동일 크기만큼 해주는 것이 좋습니다.
 *  
 * 3. push 메서드가 실행될 때마다 i의 값이 0으로 초기화되고 있습니다.
 * 이렇게 될 경우 arr[0] 의 값만 계속 변경되고, 조건문의 의미가 없어집니다.
 * 
 * 4. pop 메서드는 스택에서 값을 꺼내와야 합니다.
 * 다만, 가장 최근에 스택에 저장된 순서대로 값을 꺼내야합니다.
 * 이 부분을 구현하셔야 합니다.
 * 
 * 5. pop 메서드에서 배열에 저장된 값을 모두 꺼냈을 시
 * 문제에서 요구하는 문장을 출력하도록 하는 코드를 작성해야합니다.
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
