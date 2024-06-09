package book;

import java.util.Scanner;

public class BookManager { // main 에서 참조할 객체 클래스

	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT]; // 배열변수 선언, 초기화
	private int index;
	
	public void inputData(Scanner input) {
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		System.out.println("데이터 입력이 완료되었습니다.\n");
		
		infoStorage[index++] = new AnimalInfo(name, age);
		
	}

	public void showBook() {
		System.out.println("정보 입력을 종료합니다.\n");
		System.out.println("<< 저장 목록 >>");
		
		for(AnimalInfo animal: infoStorage) {
			if(animal == null) 
				break;
			
			animal.showAnimalInfo();
		}
	}
	
}