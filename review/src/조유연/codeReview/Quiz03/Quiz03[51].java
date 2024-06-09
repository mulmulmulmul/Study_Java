/*
 * [조유연]
 * 1. ArrayStack의 생성자는 매개변수로 길이를 입력받습니다.
 * 5만큼의 길이를 갖는 배열을 생성하는 것이 아니라,
 * 매개변수를 통해 입력받은 정수값만큼의 길이를 갖는 배열을 
 * 새로 생성하여 참조변수 arr가 참조할 수 있게 만들어야 합니다.
 * 
 * 2. push나 pop 메서드에 public이라는 접근 제어자를 사용하거나
 * static을 사용해 정적 멤버로 선언할 필요는 없어 보입니다. 
 * 객체 생성 없이 클래스로만 pop() 함수를 사용할 것이라는 요구사항은
 * 문제에 없기 때문입니다.
 * 
 * 3. push 메서드에서 배열에서 매개변수로 받은 num에 저장된 값은
 * 멤버 변수 arr가 가리키게 해야합니다. 
 * 스택이 가득 찬 경우에는 용량 초과 메시지를 출력해아 하는데,
 * 이 과정에서 조건문의 적절한 사용이 필요해 보입니다. 
 * 또한, 현재 스택에 저장된 원소의 개수를 세는 변수를 추가로 선언하여
 * 스택이 꽉 찼는지 arr의 길이와 비교하는 조건문도 필요합니다.
 * 
 * 4. 멤버 변수 top에 관한 그 어떤 식도 없으므로 
 * ArrayStack의 객체 생성 및 메서드 호출 등의 모든 과정이 끝나도 
 * top 의 값은 -1로 고정되어있게됩니다.
 * 따라서 pop 메서드에서 top 이 0인지 아닌지 비교하는 조건문은 
 * 아무의미가 없어집니다.
 * 
 */
class ArrayStack{
	int[] arr;
	int top = -1;
	
	public ArrayStack(int i) {
		int arr[] = new int [5];
		
	}

	int peek() {
		return arr[top];
	}
	
	public void push(int num) { // 값 저장
		for (int i = 0; i<arr.length-1; i++) {
			System.out.println(i);
		}
		System.out.println("스택이 꽉 찼습니다! 용량 초과!");
	}
	
	public static int pop ( ) { // 리턴
		if (top ==0) {
		System.out.println("스택이 비었습니다!");
		return -1;
		}
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
		
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		
	}

}
