package quiz3;
/*
 * [김현빈] ===================================
 * top은 스택의 수, 증감연산자를 사용하여 인덱스 증가, 감소시킬 수 있어요
 * push : top이 배열의 길이를 다 채우면 용량초과 출력
 * 덜 채웠으면 배열의 인덱스를 증가 시키고 값을 저장
 * int i 선언 할 필요 없이 top으로 증감 가능해요
 * pop : top의 값이 0보다 작아지면 스택이 비었습니다 출력
 * 아니라면 top의 값 감소 
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

public class Quiz0309 {
	
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
