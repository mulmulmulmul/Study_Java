/*
 * [최은지]================================================
 * 
 * 입력받은 값에 대한 조건식과 for문을 통한 팩토리얼 계산,
 * 값의 출력도 모두 불필요한 반복 없이 깔끔하게 작성되었습니다. 
 *
 *=========================================================
 */
import java.util.Scanner;

public class Quiz01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int userValue = 0;
    int sum = 1;

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
