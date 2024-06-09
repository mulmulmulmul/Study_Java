package book;

import java.util.Scanner;

public class BookManager {
    private final int MAX_CNT = 100;
    private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
    private int index;

    public void inputData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("<< 정보를 입력하세요 >>");
        System.out.print("1. 이름 : ");
        String name = scan.nextLine();

        System.out.print("2. 나이 : ");
        int age = scan.nextInt();

        infoStorage[index++] = new AnimalInfo(name, age);
        scan.close();
        System.out.println("데이터 입력이 완료되었습니다.\n");

    }

    public void showBook() {
        if (index > 0)
            System.out.println("<< 저장 목록 >>");

        for (AnimalInfo info : infoStorage) {
            if (info == null)
                break;

            info.showAnimalInfo();
        }
    }

}
