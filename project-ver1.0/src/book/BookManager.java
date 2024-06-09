package book;

import java.util.Scanner;

public class BookManager {

	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT]; // 배열변수 선언, 초기화
	private int index;
	
	public void inputData() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		System.out.println("데이터 입력이 완료되었습니다.\n");
		
		infoStorage[index++] = new AnimalInfo(name, age);
		
//		input.close();
	}

	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		
		for(AnimalInfo animal: infoStorage) {
			if(animal == null) 
				break;
			
			animal.showAnimalInfo();
			
		}
	}
	
}