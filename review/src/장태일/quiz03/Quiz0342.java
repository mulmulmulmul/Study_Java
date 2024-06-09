/*
 * [장태일]
 * 타입 맞춰주시면 좋을것 같습니다.
 *   
 * push일때는 조건식을 설정하여 배열의 위치가 길이보다 작을때를 정해주시고
 * 돌때마다 배열의 위치가 점차 증가하도록 하시는게 좋을듯 싶습니다.
 * void push(int Item) {
		if(arr.length-1>top) {
			top++;
			arr[top]= Item;
			System.out.println("Insterd Item : " + Item);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
 *
 * pop일때는
 * 조건식을 설정하여 배열의 위치가 -1이 될때는 값이 없는 비었다는걸 보여주시고
 * 그렇지 않을때는 값과 함께 증감식을 써주시면 될것같습니다.
 * if(top!=-1) {
			
			return arr[top--];	
		} else {
			System.out.println("스택이 비었습니다!");
			return top;
 * 
 * 
 */
/*
[문항3]  stack 메모리 구조를 Java로 간단히 구현하시오.

3.1. ArrayStack 클래스에 생성자를 정의하시오. [10점]
- 스택의 크기는 생성자로 설정한다.
- 즉, 생성자를 통해 1차원 배열 생성하여 멤버 변수 arr에 저장하시오.

3.2. ArrayStack 클래스에 push 메소드를 정의하시오. [15점]
- push 메소드는 스택에 값을 저장한다.
- 즉, push 메소드를 통해 멤버 변수 arr에 정수값이 저장된다.
- 저장되는 값이 배열의 길이를 초과하면 ‘스택이 꽉 찼습니다! 용량 초과!’를 출력하시오.

3.3. ArrayStack 클래스에 pop 메소드를 정의하시오. [15점]
- pop 메소드는 스택에 값을 꺼내온다.
- 즉, push 메소드를 통해 멤버 변수 arr의 정수값이 리턴된다.
- 배열에 저장된 값을 모두 꺼내오면, ‘스택이 비었습니다!’를 출력하시오.

 
 */


class ArrayStack42{
	int[] arr;
	int top = -1;
	
	
	ArrayStack42(int[] arr){
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


public class Quiz0342 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack42(5);
		
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