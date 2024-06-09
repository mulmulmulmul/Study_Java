
public class Main {

	public static BookService service = new BookService();
	
	public static void main(String[] args) {
		
		outer:
		while(true) {
			
			MenuView.showMenu();
			
			int userNum = MenuView.INPUT.nextInt();
			
			switch(userNum) {
			case 1:
				service.input();
				System.out.println();
				break;
			case 2:
				service.search();
				System.out.println();
				break;
			case 3:
				service.update();
				System.out.println();
				break;
			case 4:
				service.delete();
				System.out.println();
				break;
			case 5:
				service.print();
				System.out.println();
				break;
			case 6:
				service.clearStore();
				System.out.println();
				break;
			case 7:
				System.out.println("++프로그램 종료++");
				break outer;
			}
			
		}
		MenuView.INPUT.close();
		
	}
	
}
