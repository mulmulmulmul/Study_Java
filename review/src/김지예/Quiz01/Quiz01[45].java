/*
 * [김지예] 
 * 1. 정수형 변수 userValue를 선언하여
 * 사용자에게 정수 1개를 입력 받아 저장했는가. >> O
 * 
 * 2. 사용자가 1~10 이외의 정수를 입력하면
 * 다시 입력 받도록 코딩을 작성했는가 >> O
 * 
 * 3. 사용자가 입력한 (1~10 사이) 정수의
 * 팩토리얼 출력하는 코딩을 작성하였는가. >> O
 * 
 * 평가 : 문제 풀이에 있어 코드 작성 방식은 괜찮으나
 * 줄 바꿈이 현저히 떨어져 가독성이 매우 뒤떨어진다.
 * 
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
