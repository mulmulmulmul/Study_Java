/*
 * [최은지]================================================
 * 
 * 문제에서 제시된 pop실행 출력문 작성이 필요합니다.
 *  
 * pop 메소드에 대한 코드 작성이 필요합니다.
 * >top ; 하나씩 감소하는 증감식 작성
 * 
 *======================================================
 */
class ArrayStack {
	int[] arr;
	int top = -1;
	int num;
	
	ArrayStack(int num) {
		arr = new int[num];
	}
	
	public void push(int value) {
		top++;
		if(top<=arr.length-1) {
			arr[top] = value; 
			System.out.println("Inserted Item : " + value);
		} else{
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}

	int peek() {
		return arr[top];
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
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.);
		
	}

}
