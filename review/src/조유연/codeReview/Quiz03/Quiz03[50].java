/*
 * [조유연]
 * 1. 멤버 변수의 선언과 초기화가 이루어지는 부분과
 * peek() 함수와 같은 멤버 메서드 정의 부분 사이에는 
 * 화이트라인을 추가하는 것이 더 좋습니다.
 * 
 * 2. size 변수를 따로 정의하는 것은 불필요해보입니다.
 *  ArrayStack 의 생성자에서 사용자에게 배열의 길이를 매개변수로 입력받아
 *  바로 그 매개변수 길이를 갖는 배열을 생성하는 것이 더 깔끔한 코드입니다.
 *  size라는 변수는 생성자에서 배열의 길이를 설정하는 데에만 딱 한 번 쓰이기 때문입니다.
 *  
 * 3. push() 함수에서 스택이 꽉 찼든, 아니면 차지 않아 새로운 값을 추가할 수 있든 
 * 무조건 top++; 가 실행됩니다.
 * if문 안에 top의 증가식이 포함되어야합니다. 
 * 
 * 4. pop 메서드 또한 마찬가지입니다.
 * top의 변수가 증가되거나 감소되는 것은 특정 조건에서만 실행되어야 합니다.
 * 또한 스택이 비어있을 경우에는 return 에서 출력할 수 있는 배열의 원소가 없으므로
 * 오류가 날 수 있습니다.
 * 이 부분에 대한 처리도 따로 필요해 보입니다.
 */
class ArrayStack {
	int[] arr;
	int top = -1;
	int size;
	int peek() {
		return arr[top-1];
	}

	ArrayStack(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	void push(int Item) {
		top++;
		if(top<5) {
			arr[top]= Item;
			System.out.println("Insterd Item : " + arr[top]);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}

	}
	int pop() {
		top--;
		if(top>=0) {
		} else {
			System.out.println("스택이 비었습니다!");		
		}
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
		
		System.out.println("\ntop에 있는 아이템 출력!" + stack.peek());
		
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());

	}

}
