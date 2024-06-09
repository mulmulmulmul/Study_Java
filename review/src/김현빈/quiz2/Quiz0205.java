package quiz2;
import java.util.Scanner;
/*
 * [김현빈] ===================================
 * Scanner 메모리 해제 하기!
 * 변수 선언 반복문 밖에서 권장해요
 * 반복문 탈출 한개의 if문으로 줄일 수 있어요
 */
public class Quiz0205 {

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
