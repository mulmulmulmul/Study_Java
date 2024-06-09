/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> O
 * 2. push 메소드를 정의 했는가. >> O
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 전체 적으로 push 메소드에 올인 했다는 것만 느껴짐.
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
