package Quiz02;

//[임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다. 
// 깔끔한 if문으로 작성하셨습니다.

import java.util.Scanner;

public class Quiz0244 {

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
