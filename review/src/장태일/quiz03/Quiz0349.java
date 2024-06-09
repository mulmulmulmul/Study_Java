/*[장태일]
 * 
 * push일때는 조건식을 설정하여 배열의 위치가 길이보다 작을때를 정해주시고
 * 돌때마다 배열의 위치가 점차 증가하도록 하시는게 좋을듯 싶습니다.
 * void push(int Item) {
		if(arr.length-1>top) {
			top++;
			arr[top]= Item;
			System.out.println("Insterd Item : " + Item);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
 *
 * pop일때는
 * 조건식을 설정하여 배열의 위치가 -1이 될때는 값이 없는 비었다는걸 보여주시고
 * 그렇지 않을때는 값과 함께 증감식을 써주시면 될것같습니다.
 * if(top!=-1) {
			
			return arr[top--];	
		} else {
			System.out.println("스택이 비었습니다!");
			return top;
 */
public class Quiz0349 {

	public static void main(String[] args) {
		
		int[] arr = {
				20,15,10,55,8,5
		};
		
//		ArrayStack49 stack = new ArrayStack49(5);
//		stack.push(20);
//		stack.push(15);
//		stack.push(10);
//		stack.push(55);
//		stack.push(8);
//		stack.push(5);
		
		for (int element: arr) {
			System.out.println(element);
		}
//		System.out.println("\ntop에 있는 아이템 출력: " + stack.peek());
//		
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());
//		System.out.println("pop 실행 : " + stack.pop());

	}

	//ArrayStack 클래스에 생성자를 정의하시오. 
	class ArrayStack49 {
		int[] arr;
		int top = -1;
		
		
		
		int peek() {
			return arr[top];
		}
	}
}

	
	
	
	
	
