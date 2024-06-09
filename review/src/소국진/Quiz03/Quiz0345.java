/*
 * 
 * [소국진]====================================
 * 
 * 안녕하세요.
 * 
 * ArrayIndexOutOfBoundsException 익셉션 : Index 5 out of bounds for length 5라고 하는데,
 * 길이가 5인 배열의 5번 인덱스를 사용하려고 했기 때문에 에러가 납니다.
 * 
 * push를 실행할 때마다 top++;이 일어났다고 생각할 수 있었는데요,
 * push()를 실행할 때마다 int i = 0이기 때문에 계속 조건식을 통과합니다.
 * 
 * i < arr.length 조건식이 수정되어야 합니다.
 * 만약 길이가 5라면 인덱스는 0,1,2,3,4이고, push를 5번 실행하면 top이 0,1,2,3,4가 될 것입니다.
 * 저는 (top + 1 == arr.length)로 가득 찼는지를 비교했습니다.
 * 가득 찼다면 다 찼다고 출력하고 바로 return을, 그렇지 않다면 top을 ++하는 방식으로 진행했습니다.
 * 
 * 고생하셨습니다.
 * 
 */
class ArrayStack0345{
	int[] arr; 			
	int top = -1;
	
	int peek() {
		return arr[top];
	}
	public ArrayStack0345(int length) {
		this.arr = new int[length];
	}
	
	// method
	// arr의 길이는 설정 됐으니 arr배열에 값을 넣어준다.
	 
		void push(int num){
			if(top + 1 == arr.length) {
				System.out.println("스택이 꽉 찼습니다! 용량 초과!");
				return;	
			}			
			top++;
			arr[top] = num;
			System.out.println("Inserted Item : " + num);
	}
	public static String pop(){
		
		return null;
	}
}

public class Quiz0345 {
	
	public static void main(String[] args) {
		
		ArrayStack0345 stack = new ArrayStack0345(5);
				
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
