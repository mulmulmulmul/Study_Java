import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	
	private static ItemBusinessRule rule = new ItemBusinessRule();

	public static void main(String[] args) {
		
		int choice;
		
		menu:
		while(true) {
			ItemView.showMenu();
			choice=ItemView.input.nextInt();
			
			switch(choice) {
			case 1:
				rule.save();
				break;
			case 2:
				rule.find();
				break;
			case 3:
				rule.update();
				break;
			case 4:
				rule.delete();
				break;
			case 5:
				rule.findAll();
				break;
			case 6:
				rule.clearStore();
				break;
			case 7:
				System.out.println("<<프로그램을 종료합니다. >>");
				break menu;
			default :
				break;
			}
		}
		ItemView.input.close();
		
	}

}
