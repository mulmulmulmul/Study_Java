/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */

import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	public static void main(String[] args) {

		ItemBusinessRule rule = new ItemBusinessRule();
		
		outer:
		while(true) {
			ItemView.showMenu();
			
			System.out.print("\n원하는 기능을 선택하세요... ");
			int choice = ItemView.INPUT.nextInt();
			
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
				break outer;
			}
		}
		ItemView.INPUT.close();
		System.out.println("프로그램 종료");
	}
}
