package book;

import java.util.Scanner;

public class BookManager {
	
	private int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index;
	
	// bookmanager 메모리 할당될 때 메모리에 미리 할당
	public static Scanner input = new Scanner(System.in);
	String name;
	
	public void inputDate() {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	public void showBook() {
//		System.out.println("정보 입력을 종료합니다.\n");
		System.out.println("<< 저장 목록 >>");
			
		for(AnimalInfo animal: infoStorage) {
			if(animal != null)
			animal.showAnimalInfo();
		}
		
	}
	
}
