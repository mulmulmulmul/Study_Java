/*
 * [서보민] ======================
 * pop코드 작성을 하지 않았습니다.
 * ===============================
 * 
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
