/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */
import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	
	public static ItemBusinessRule user = new ItemBusinessRule();
	
	public static void main(String[] args) {
		int choice;
		
		end:
		while(true) {
			ItemView.showMenu();
			
			choice = ItemView.input.nextInt();
			
			switch(choice) {
			case 1: 
				user.save();
				break;
			case 2:
				user.find();
				break;
			case 3:
				user.update();
				break;
			case 4:
				user.delete();
				break;
			case 5:
				user.findAll();
				break;
			case 6:
				user.clearStore();
				break;
			case 7:
				break end;
			}
		}	
		ItemView.input.close();
	}

}
