

/*
 * 
 * [소국진]====================================
 * 
 * 안녕하세요.
 * 
 * ArrayIndexOutOfBoundsException 익셉션 : Index 5 out of bounds for length 5라고 하는데,
 * 길이가 5인 배열의 5번 인덱스를 사용하려고 했기 때문에 에러가 납니다.
 * 
 * 
 * 	public void push(int value) {
		top++;
		if(top <= arr.length-1) {
			arr[top] = value; 
			System.out.println("Inserted Item : " + value);
		} else{
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}
 * 
 * 
 * 에러가 난 부분은 6번째 push를 호출할 때입니다.
 * 5번까지 호출을 끝내면 top은 -1에서 시작하여 0>1>2>3>4이고, 6번째 push()에 진입해서 조건식을 통과하기 이전 top++;에 의해
 * top은 5가 됩니다. ( top <= arr.length-1 ) == ( 5 <= 4 ) 조건식을 통과하지 못해 arr[5]에 삽입하진 못했으나,
 * top은 5가 되어버렸기 때문에 다음 코드에서 문제가 생길 것입니다.
 * 그래서 peek()에서 길이가 5이며 0,1,2,3,4 인덱스밖에 없는 arr에 인덱스 5를 사용하려 해서 에러가 났습니다.
 * 
 * 
 * 	public void push(int value) {
		if(top < arr.length-1) {
			top++;
			arr[top] = value; 
			System.out.println("Inserted Item : " + value);
		} else{
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}
 * 
 * 
 * 따라서 top을 조건식 안에 넣어주고, 크거나 같을 때가 아니라 클 때로 변경해주시면 될 것 같습니다.
 * 
 * 고생하셨습니다.
 * 
 */
class ArrayStack0346 {
	int[] arr;
	int top = -1;
	int num;
	
	ArrayStack0346(int num) {
		arr = new int[num];
	}
	
	public void push(int value) {
		if(top < arr.length-1) {
			top++;
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


public class Quiz0346 {

	public static void main(String[] args) {

		ArrayStack0346 stack = new ArrayStack0346(5);
		
		stack.push(20); 
		stack.push(15); 
		stack.push(10); 
		stack.push(55); 
		stack.push(8); 
		stack.push(5); 
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
	}

}
