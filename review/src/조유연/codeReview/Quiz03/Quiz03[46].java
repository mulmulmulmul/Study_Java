/*
 * [조유연]
 * 1. 변수명은 변수의 기능을 정확히 설명할 수 있을 수록 좋습니다.
 * num에는 사용자가 입력한 배열의 길이가 들어가므로
 * num 대신 길이의 의미를 담는 이름으로 변수를 선언하면 더 좋을 듯 싶습니다.
 * 
 * 2. push() 함수에서 스택에 용량이 꽉 차 더 이상 원소를 넣을 수 없을 경우에도
 * top++; 의 코드가 실행됩니다.
 * top++ 의 코드는 원소를 넣었을 경우에만 실행되어야합니다.
 * 
 * 3. 스택에서 최근에 저장된 순서대로
 * 원소를 꺼내는 멤버 메서드 pop()이 구현되지 않았습니다.
 * 만약 모든 원소를 꺼내 스택이 비게 된다면,
 * 문제에서 요구한 출력문을 출력할 수 있도록 조건문을 작성하여야 합니다.
 * 
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
