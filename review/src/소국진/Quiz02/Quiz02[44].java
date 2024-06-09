import java.util.Scanner;

/*
 * [소국진] =================================
 * 안녕하세요.
 * 
 * 제가 작성한 방법과 정말 비슷합니다.
 * 
 * 저도 작성자님과 마찬가지로 if(break)문과 if else문 두 개로 나누었었는데요.
 * 굳이 if문을 두 개로 나눌 필요는 없었을 것 같습니다.
 * 
 * 고생하셨습니다.
 * 
 */
public class Quiz02 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int random = (int) (Math.random() * 10) + 1;
    int cnt = 0;

    System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");

    while(true) {
      System.out.print("숫자 입력 : ");
      int userValue = scan.nextInt();

      ++cnt;

      if(userValue > random) {
        System.out.println("컴퓨터의 숫자가 더 작습니다.");
      } else if(userValue < random) {
        System.out.println("컴퓨터의 숫자가 더 큽니다.");
      }

      if(random == userValue) {
        break;
      }

    }

    System.out.printf("%d번만에 정답입니다.", cnt);
  }
}
