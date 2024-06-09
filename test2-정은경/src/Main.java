/*
 * [정은경 코드리뷰]
 */

import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	public static ItemBusinessRule business = new ItemBusinessRule();
	
	public static void main(String[] args) {
		outer:
		while(true) {
			
			ItemView.showMenu();
			
			System.out.print("원하는 기능을 선택하세요... ");
			int userChoice = ItemView.input.nextInt();
			
			switch(userChoice) {
			case 1:
				business.save();
				break;
			case 2:
				business.find();
				break;
			case 3:
				business.update();;
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
				System.out.println("++ 프로그램 종료 ++");
				break outer;
			}
		}
		
		ItemView.input.close();
	}

}
