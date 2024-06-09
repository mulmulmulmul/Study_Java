// 노태윤 ========================
//
//=================================
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
        break; // 조건문에서 조건을 한개만씀 두개를써야함 아닌경우를 쓰지않음
      }
    }
    //여기다 int sum = 1; 선언하는게 보기좋아보인다
    for(int i = 1; i <= userValue; i++) {
      sum *= i;
    }

    System.out.printf("%d! : %d", userValue, sum);

    scan.close();
  }

}
