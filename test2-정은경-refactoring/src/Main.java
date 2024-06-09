import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	public static void main(String[] args) {

		ItemBusinessRule business = new ItemBusinessRule();
		
		outer:
		while(true) {
			ItemView.showMenu();
			int userChoice = ItemView.INPUT.nextInt();
			
			switch(userChoice) {
			case 1:
				business.save();
				break;
			case 2:
				business.find();
				break;
			case 3:
				business.update();
				break;
			case 4:
				business.delete();
				break;
			case 5:
				business.findAll();
				break;
			case 6:
				business.clearStore();
				break;
			case 7:
				System.out.println("++프로그램 종료++");
				break outer;
			}
			
		}
		ItemView.INPUT.close();
		
	}

}
