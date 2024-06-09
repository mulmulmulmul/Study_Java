/* [김지예]
 * 1. ArrayStack 생성자를 정의 했는가. >> O
 * 2. push 메소드를 정의 했는가. >> X
 * 3. pop 메소드를 정의 했는가. >> X
 * 
 * 평가 : 1. push 메소드에서는 리턴이 될게 없으므로 int 보다는 void를 쓰는게 좋음
 * 2. pop 메소드가 생성이 안되어 있음.
 * 3. 메인 메소드 내에서 처음 sysout 문이 형성이 되어있는점 (???)
 * 4. push 메소드에서 while이나 for 문을 전혀 쓸 이유가 없음. 호출시에 실행이 되기 때문
 * 5. push 메소드 에서 if 문 안의 break;는 왜 쓴건지 모르겠음.
 * 
 */
class ArrayStack {
	int[] arr;
	int top = -1;
	
	ArrayStack(int num) {
		this.arr = new int[num];
	}
	
	int peek() {
		return arr[top];
	}
	
	int push(int push) {
		
		while (true) {
			for (int i=0; i<arr.length; i++) {
				arr[i] = push;
				
				if (arr[0] != push) {
					arr[i+1] = push;
					break;
				}
			}
		}
		System.out.println("Inserted Item : " + push);
		return arr;
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		System.out.println("stack >> " + stack.arr[0]);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
//		stack.push(55);
//		stack.push(8);
//		stack.push(5);
		
		
		
//		System.out.println("\ntop에 있는 아이템 출력 : "+ stack.peek());
//		
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
		
	}
}
