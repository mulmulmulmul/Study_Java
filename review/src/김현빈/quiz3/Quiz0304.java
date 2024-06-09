package quiz3;
/*
 * [김현빈] ===================================
 * 생성자로 배열의 길이 저장 가능해요
 * arr = new int[i]
 * top은 스택의 수
 * push : top이 배열의 길이를 다 채우면 용량초과 출력
 * 덜 채웠으면 배열의 인덱스를 증가 시키고 값을 저장해야해요
 * pop : top의 값이 0보다 작아지면 스택이 비었습니다 출력
 * 아니라면 top의 값 감소.
 */
class ArrayStack{
	int[] arr;
	int top = -1;
	
	
	
	public ArrayStack(int i) {
		int top = i;
	}

	int peak() {
		return arr[top];
	}
	
	void push(int num) {
		
	}
	
}
public class Quiz0304 {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
	}

}
