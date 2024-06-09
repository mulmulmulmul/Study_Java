package quiz3;
/*
 * [김현빈] ===================================
 * 생성자로 배열의 길이 저장 할 수 있어요 arr = new int[i]
 * 값저장은 메소드를 호출 할 때마다 인덱스가 증가되게 작성가능해요 >> 증감연산자
 * pop도 호출할 때마다 인덱스를 감소시키고 리턴
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
public class Quiz0316 {

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
