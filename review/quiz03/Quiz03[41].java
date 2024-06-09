/*
 * [정은경] ============================================
 * pop()에서 -1을 리턴하기보다 top을 리턴하는 것이 좋아 보입니다.
 * 스택이 비었을 때 pop 실행 : -1 을 출력해야 합니다.
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
