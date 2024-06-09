 /*
 * [이홍준] 코드리뷰 ==================
 * 1. 객체의 매개변수가 1개인 경우의 생성자 내에서
 * 	arr의 1차배열의 길이를 설정해주셔야 합니다. 
 * 2. push() 메소드는 배열의 값을 설정해주는 메소드입니다. 
 * 	if 조건문을 사용하여 각배열에 값을 넣어주고 넣어줄때마다 top의 값을 증가시켜야 합니다.
 * 	배열의 길이를 초과할 경우초과 메세지를 출력해야 합니다.
 * 3. 반환형이 int 인 pop() 메소드는 조건문으로 증가시켜준 top을 활용하여
 * 	값을 꺼내오는 메소드입니다. 반환형이 있는 경우는 return을 사용하여 값을 내보내줘야 합니다.
 */



//stack 메모리 구조를 Java로 간단히 구현하시오.
//
//3.1. ArrayStack 클래스에 생성자를 정의하시오. [10점]
//- 스택의 크기는 생성자로 설정한다.
//- 즉, 생성자를 통해 1차원 배열 생성하여 멤버 변수 arr에 저장하시오.
//
//3.2. ArrayStack 클래스에 push 메소드를 정의하시오. [15점]
//- push 메소드는 스택에 값을 저장한다.
//- 즉, push 메소드를 통해 멤버 변수 arr에 정수값이 저장된다.
//- 저장되는 값이 배열의 길이를 초과하면 ‘스택이 꽉 찼습니다! 용량 초과!’를 출력하시오.
//
//3.3. ArrayStack 클래스에 pop 메소드를 정의하시오. [15점]
//- pop 메소드는 스택에 값을 꺼내온다.
//- 즉, push 메소드를 통해 멤버 변수 arr의 정수값이 리턴된다.
//- 배열에 저장된 값을 모두 꺼내오면, ‘스택이 비었습니다!’를 출력하시오.

class Arraystack{
	int[] arr;
	int top = -1;
	
	int peek() {
		return arr[top];
	}
}


public class Quiz03 {

	public static void main(String[] args) {
		
		
		
	}

}
