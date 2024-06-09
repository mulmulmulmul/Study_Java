import book.BookManager;
import book.Menu;

public class AnimalBook {
	
	private static BookManager manager = new BookManager();  
	
	public static void main(String[] args) {
		
		while(true) {
			
			Menu.show(); // static 메서드 - 인스턴스 생성 불필요
			
			int userValue = BookManager.input.nextInt();
			
			switch (userValue) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.updateData();
				break;
			case 4:
				manager.deleteData();
				break;
			case 5:
				manager.showBook();
				break;
			case 6:
				System.out.println("++ 프로그램을 종료합니다. ++");
				return;
			}
			
		}
		
//		input.close();
		
	}

}
