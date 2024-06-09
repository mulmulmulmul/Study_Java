package Quiz01;

// [임윤지]
// 값 출력이 나올 수 있게 잘 입력하셨습니다. 
// while 문, for문 모두 적절하게 사용하셔서 범위에 맞는 입력을 요구하여 그에 맞은 값이 도출되도록 하였습니다.

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
