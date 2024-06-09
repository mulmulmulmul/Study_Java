/*
 * [김지예]
 * 1.정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하였는가. >> O
 * 2.사용자가 입력한 값과 랜덤값을 비교 후 출력하였는가. >> O
 * 3.사용자가 랜덤값을 맞출 때까지 정수를 입력하도록 하였는가. >> O
 * 4.사용자가 몇 번만에 랜덤값을 맞췄는지 출력하였는가. >> O
 * 
 * 평가 : 1. 왜 자꾸 줄바꿈을 소극적(tap키가 아닌 space로 사용)인건지 의문 (가독성 문제)
 * 2. 그로 인해 따라오는 2개의 if문은 전체 코드를 어지럽히는 것은 물론 가독성이 문제가 됨.
 * 3. 메모리 누수 (Scanner scan을 close 하지 않음)
 * 
 */
import java.util.Scanner;

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
