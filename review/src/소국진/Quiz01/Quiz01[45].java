import java.util.Scanner;

/* [소국진] ================================
 * 
 * 안녕하세요.
 *
 * 팩토리얼 부분을 간단하게 구현하셔서 가독성이 좋았습니다. 고생하셨습니다.
 */
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
