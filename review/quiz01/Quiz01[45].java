/*
 * [정은경] =========================================================
 */

import java.util.Scanner;

public class Quiz01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int userValue = 0;
    int sum = 1; // 리뷰 : 변수명으로 합보다는 팩토리얼이나 result가 더 좋아보일 것 같습니다.

    while(true) { 
      System.out.print("1~10 사이의 정수 입력 : ");
      userValue = scan.nextInt();
      if (userValue > 0 && userValue <= 10) {
        break;
      }
    }
    for(int i = 1; i <= userValue; i++) {
      sum *= i;
    }

    System.out.printf("%d! : %d", userValue, sum);

    scan.close();
  }

}
