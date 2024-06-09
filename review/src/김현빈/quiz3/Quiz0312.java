package quiz3;
/*
 * [김현빈] ===================================
 * top은 스택의 수, 증감연산자를 사용하여 인덱스 증가, 감소시킬 수 있어요
 * 메소드 push : top이 배열의 길이를 다 채우면 용량초과 출력
 * 덜 채웠으면 배열의 인덱스를 증가 시키고 값을 저장
 * 메소드를 호출할때마다 값을 저장하기 때문에 반복문 불필요
 * 메소드 pop : top의 값이 0보다 작아지면 스택이 비었습니다 출력
 * 아니라면 top의 값 감소 
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

public class Quiz0312 {

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
