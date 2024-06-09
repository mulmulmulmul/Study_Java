/*
 * [조유연]
 * 1. ArrayStack 생성자는 int형 배열을 매개변수로 받지 않습니다.
 * 배열의 길이를 받아야 합니다.
 * 배열의 길이는 정수형으로 입력됩니다.
 * 또한 this.arr에는 사용자가 입력한 길이의 새로운 배열의 주소가 들어가야 합니다.
 * 
 * 2. push() 함수는 매개변수값을 받아 스택에 저장해야 합니다.
 * 스택의 용량이 허용하는 한에서 사용자가 입력값을 스택에 넣을 수 있도록
 * if와 else, else if 등을 적절히 활용하여 조건문을 작성하여야합니다.
 * 
 * 3. push() 함수의 반환형을 int로 선언했기에 
 *  int형 배열 arr 을 return 하는 코드를 작성하면
 * 오류가 납니다. 
 * 
 * 4. pop() 함수에서는 스택이 비어있지 않은 한 
 * 사용자가 입력해 넣은 값을 한 개 씩 출력되게 해야합니다.
 * 출력이 될 때마다 배열에서 포인터의 인덱스 값이 증가되거나 감소하는 코드를
 * 작성해야합니다.
 */
class ArrayStack{
	int[] arr;
	int top = -1;
	
	
	ArrayStack(int[] arr){
		this.arr = arr;

	}
	
	
	int peek() {
		return arr[top];
	}
	
	
	int push() {

		System.out.println("스택에 값을 저장 : " + this.arr);

		return this.arr;
	}
	
	
	int pop() {

		return;
		
	}
	
	
}


public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		stack.push();
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		int[] arr = {20,15,10,55,8};
			
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek() );
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		

		
	}

}
