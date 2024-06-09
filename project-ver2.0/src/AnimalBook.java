import java.util.Scanner;

import book.BookManager;

public class AnimalBook {
	
	private static BookManager manager = new BookManager();  
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("[ 메뉴를 선택하세요 ]");
			System.out.print("1. 정보 입력\n2. 정보 검색\n3. 정보 수정\n4. 정보 삭제\n5. 전체 정보\n6. 종료\n선택... ");
			int userValue = input.nextInt();
			
			if(userValue == 1) {
				manager.inputData();
			} else if (userValue == 2) {
				manager.searchData();
			} else if (userValue == 3) {
				manager.updateData();
			} else if (userValue == 4) {
				manager.deleteData();
			} else if (userValue == 5) {
				manager.showBook();
			} else if (userValue == 6) {
				System.out.println("++ 프로그램을 종료합니다. ++");
				break;
			}
		
		}
//		input.close();
		
//		manager.showBook();
		
	}

}
