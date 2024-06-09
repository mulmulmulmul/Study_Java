import book.BookManager;

import java.util.Scanner;

public class AnimalBook {
    private static BookManager manager = new BookManager();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("정보를 입력할까요? (Y/N) ... ");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("YES")) {
                manager.inputData();
            } else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("NO")) {
                System.out.println("정보 입력을 종료합니다.\n");
                break;
            }
        }
        // 출력
        manager.showBook();

//        scan.close();
    }
}
