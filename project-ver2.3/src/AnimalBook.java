import book.BookManager;
import book.Menu;

public class AnimalBook{
	
	private static BookManager manager = new BookManager();
	
	public static void main(String[] args) {
		
		outer:
		while(true) {
			
			Menu.show();
			int user = BookManager.input.nextInt();
			
			switch(user) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.findData();
				break;
			case 3:
				manager.update();
				break;
			case 4:
				manager.delete();
				break;
			case 5:
				manager.showBook();
				break;
			case 6:
				System.out.println("++프로그램 종료++");
				break outer;
			}
		}
		BookManager.input.close();
	}
	
}

