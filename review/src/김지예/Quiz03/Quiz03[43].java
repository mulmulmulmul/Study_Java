/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> O
 * 2. push 메소드를 정의 했는가. >> X
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 1. 줄바꿈 문제 (너무 심각함)
 * 2. 클래스에 불필요한 멤버변수가 끼어있음 ( String은 왜?)
 * 3. 생성자 소괄호 안에 불필요한 String이 껴있음. (?????)
 * 4. 이외 생성된 메소드는 전혀 보이지 않은 점.
 * 5. 메인 메소드 안에 이상한 for문이 들어가있는 점. (메소드 생성, 호출만 있는 문제였음 따로 변경할게 없음)
 * 6. push 메소드로 출력되어야할 "스택" 부분이 들어가 있는점.
 * 7. 이미 생성되는 stack이 새 객체로 생성이 되어 있는데 또 생성되어있는 점.
 * 
 */
//		[메서드 정의]
//		Stack 메모리 구조를 Java로 간단히 구현하시오.
		
//		[3-1] ArrayStack 클래스에 생성자를 정의하기
//      스택의 크기는 생성자로 설정
//      즉, 생성자를 통해 1차원 배열 생성하여 멤버 변수 arr에 저장

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
