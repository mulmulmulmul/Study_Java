//노태윤////
////////////
// while문을 쓰다가 코드가 길게된것같은데 if else문을 사용하면 더욱더 쉽게하셨을것 같습니다.
// 반대로 pop 메소드 생성할때는 -- 를 써야합니다 
// 고생하셨습니다. 
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
