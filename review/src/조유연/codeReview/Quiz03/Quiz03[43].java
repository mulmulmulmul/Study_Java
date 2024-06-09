/*
 * [조유연]
 * 1. 사용자로부터 배열의 길이를 입력받아 size에 저장한다면
 * 배열의 길이는 정수로 입력될 것이고, size는 정수형 변수여야합니다.
 * String이면 안됩니다.
 * 
 * 2. 매개변수가 있는 ArrayStack() 생성자는 사용자가 입력한 값을
 * 배열의 크기로 설정합니다. 따라서 사용자가 입력한 배열의 길이만을 받아도 됩니다.
 * 내부에서는 사용자가 입력한 길이만큼의 배열을 새로 생성해야합니다.
 * 그 다음 멤버 변수 arr에 저장하여야합니다.
 * 
 * 3. push 메소드는 스택에 사용자가 입력한 값을 저장하는 코드가 포함되어야합니다.
 * 
 * 4. pop 메소드가 ArrayStack에 구현되지 않았습니다. 
 * 마지막으로 저장되었던 원소부터 차례대로 배열에서 꺼내 출력합니다.
 * 멤버 변수 arr의 정수값을 리턴해야하며, 스택이 비었을 경우 문제에서 요구하는 문장이
 * 출력되도록 하는 코드가 있어야 합니다.
 */
class ArrayStack {
			// field : instance field
			int arr;
			String size;
			int top = -1;
			
			// constructor

ArrayStack(int arr, String size) {
		    this.arr = arr;
		   
}
			
			int peek() {
				return arr size[];
				
			}


		
public class Quiz03 {

	public static void main(String[] args) {

		
//		[3-2] ArrayStack 클래스에 push 메소드를 정의하시오.
//      push 메소드는 스택에 값을 저장한다.
//      즉, push 메소드를 통해 멤버 변수 arr에 정수값이 저장된다.
//      저장되는 값이 배열의 길이를 초과하면 '스택이 꽉 찼습니다! 용량 초과!'를 출력하기
		
		
		ArrayStack stack = new ArrayStack(5);
		
		for(int i = 0; i < stack.size; i++)
			System.out.println(size[i]);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("스택이 꽉 찼습니다! 용량초과!");
		
//		[3-3] ArrayStack 클래스에 pop 메소드를 정의하시오.
//      pop 메소드는 스택에 값을 저장한다.
//      즉, push 메소드를 통해 멤버 변수 arr에 정수값이 리턴된다.
//      배열에 저장된 값을 모두 꺼내오면, '스택이 비었습니다!'를 출력하기
		
		ArrayStack stack = new ArrayStack();
		
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop(8));
		System.out.println("pop 실행 : " + stack.pop(55));
		System.out.println("pop 실행 : " + stack.pop(10));
		System.out.println("pop 실행 : " + stack.pop(15));
		System.out.println("pop 실행 : " + stack.pop(20));
		System.out.println("pop 실행 : " + stack.pop(-1));
	
		System.out.println("스택이 비었습니다!");
	
	}

}
