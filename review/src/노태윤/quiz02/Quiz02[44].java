//노태윤
//////////////////
//////////////////

import java.util.Scanner;

public class Quiz02 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int random = (int) (Math.random() * 10) + 1;
    int cnt = 0;

    System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");

    while(true) {
      System.out.print("숫자 입력 : ");
      int userValue = scan.nextInt(); // 변수선언은 밖에서하는게 좋습니다.
      								  // int userValue = 0; 반복문안에 userValue = 0;
      ++cnt;
      
      if(userValue > random) {
        System.out.println("컴퓨터의 숫자가 더 작습니다.");
      } else if(userValue < random) {
        System.out.println("컴퓨터의 숫자가 더 큽니다.");
      }

      if(random == userValue) { // if 대신 else로 적어서 random==userValue 없애도됩니다.
        break;					// 생략가능 random== userValue
      }

    }
    // else 문 밑에 적어도됨.
    System.out.printf("%d번만에 정답입니다.", cnt);
  }
}  // scan.close(); 스캐너닫아주기
