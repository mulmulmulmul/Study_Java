import java.util.Scanner;

import book.BookManager;

public class AnimalBook {
	
	private static BookManager manager = new BookManager();  
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정보 입력할까요? (Y/N) ... ");
			String userValue = input.next();
			
			if(userValue.equalsIgnoreCase("YES") || userValue.equalsIgnoreCase("Y")) {
				System.out.println("<< 정보를 입력하세요 >>");
				manager.inputData();
			} else if (userValue.equalsIgnoreCase("N") || userValue.equalsIgnoreCase("NO")) {
				System.out.println("정보 입력을 종료합니다.\n");
				break;
			}
			
		}
		
		
		input.close();
		
		manager.showBook();
		
	}

}
