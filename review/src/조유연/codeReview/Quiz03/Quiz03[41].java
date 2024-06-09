/*
 * [조유연[
 * 1. ArrayStack() 생성자에서 매개변수명을 arr가 아닌 '길이'를 나타내는 것으로 하는 게 좋습니다.
 * 변수명은 변수의 기능, 변수가 담는 값과 연관되게 지어야합니다.
 * 
 * 2. push() 함수에서 arr의 length가 0일 경우 오류가 날 수 있습니다.
 * if문의 조건을 수정하는 것이 좋습니다.
 * 
 * 3. push() 함수에서 arr에 num을 저장하고 top의 인덱스를 증가시키는 코드를 
 * if문으로 작성하고, 
 * return 은 if문 밖에 두는 것이 더욱 일반적이고 보기 좋은 코드입니다.
 * 
 * 
 */
class ArrayStack {
  int[] arr;
  int top =-1;

  ArrayStack(int arr) {
    this.arr = new int[arr];
  }

  int peek() {
    return arr[top];
  }

  void push(int num) {
    if (top == arr.length - 1) {
      System.out.println("스택이 꽉 찼습니다! 용량 초과!");
      return;
    }

    arr[++top] = num;

    System.out.printf("Inserted Item : %d\n", num);
  }

  int pop() {
    if (this.top == -1) {
      System.out.println("스택이 비어있습니다.");
      return -1;
    }

    return arr[top--];

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

    System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());

    System.out.println("pop 실행 : " + stack.pop());
    System.out.println("pop 실행 : " + stack.pop());
    System.out.println("pop 실행 : " + stack.pop());
    System.out.println("pop 실행 : " + stack.pop());
    System.out.println("pop 실행 : " + stack.pop());

  }
}
