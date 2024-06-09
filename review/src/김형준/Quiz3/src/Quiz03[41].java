/*
 * [김형준]
 * 코드 작성 잘 하셨는데 마지막 스택이 비어있습니다,-1
 * 출력이 되지 않으셨는데 제가 실력이 부족하여 설명 드릴 수가
 * 없습니다.
 * 시간이 조금 더 지나면 잘 하실 수 있을 것 같습니다.
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
