import book.BookService;
import book.MenuView;

public class Main {

	public static BookService book = new BookService();
	
	public static void main(String[] args) {
		
		int choice;
		
		outer:
		while(true) {
			MenuView.showMenu();
			choice = MenuView.INPUT.nextInt();
			
			switch(choice) {
			case 1:
				book.input();
				break;
			case 2:
				book.search();
				break;
			case 3:
				book.update();
				break;
			case 4:
				book.delete();
				break;
			case 5:
				book.print();
				break;
			case 6:
				book.clearStore();
				break;
			case 7:
				System.out.println("++프로그램 종료++");
				break outer;
			}
			
		}
		MenuView.INPUT.close();
	}

}
