/*
 * [장태일]
 * return arr 을 하시면 아무것도 나오지가 않을것입니다.
 *  * push일때는 조건식을 설정하여 배열의 위치가 길이보다 작을때를 정해주시고
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
 * 
 * 
 */
class ArrayStack47 {
	int[] arr;
	int top = -1;
	
	ArrayStack47(int num) {
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

public class Quiz0347 {

	public static void main(String[] args) {
		
		ArrayStack47 stack = new ArrayStack47(5);
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
