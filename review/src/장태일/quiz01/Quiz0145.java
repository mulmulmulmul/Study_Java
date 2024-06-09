/* [장태일]
 * 
 * 재귀호출을 썻더라면 int sum = 1; 이 부분을 쓸 이유가 없다 생각
 * 
 * 입력받는 부분을 하나로 만들었으면 userValue 초기값도 설정할 필요 없다 생각
 * 
 */

import java.util.Scanner;

public class Quiz0145 {

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
