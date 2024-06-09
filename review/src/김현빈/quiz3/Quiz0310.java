package quiz3;

public class Quiz0310 {
	/*
	 * [김현빈] ===================================
	 * 생성자로 배열의 길이 저장 가능해요 arr = new int[i]
	 * arr = new int[i]
	 * top은 스택의 수, 증감연산자를 사용하여 인덱스 증가, 감소
	 * 메소드 push : top이 배열의 길이를 다 채우면 용량초과 출력
	 * 덜 채웠으면 배열의 인덱스를 증가 시키고 값을 저장
	 * 메소드 pop : top의 값이 0보다 작아지면 스택이 비었습니다 출력
	 * 아니라면 top의 값 감소 
	 */
	public static void main(String[] args) {
		
		int[] arr = {
				20,15,10,55,8,5
		};
		
		ArrayStack stack = new ArrayStack(5);
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		for (int element: arr) {
			System.out.println(element);
		}
		System.out.println("\ntop에 있는 아이템 출력: " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());

	}

	//ArrayStack 클래스에 생성자를 정의하시오. 
	class ArrayStack {
		int[] arr;
		int top = -1;
		
		
		
		int peek() {
			return arr[top];
		}
	}

	
	
	
	
	
}
