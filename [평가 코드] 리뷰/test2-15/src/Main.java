/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */

import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	private static ItemBusinessRule manager = new ItemBusinessRule();
	
	public static void main(String[] args) {

		String userValue; // 1. 사용자에게 숫자를 입력받으면 되므로, int형 변수로 선언하셔도 괜찮았을 것 같습니다.
		
		menu:
		while (true) {
			ItemView.showMenu();
			
			userValue = ItemView.input.next();
			switch(userValue) {
        	case "1":
        		manager.save();
        		break;
        	case "2": 
        		manager.find();
        		break;	
        	case "3": 
        		manager.update();
        		break;
        	case "4": 
        		manager.delete();
        		break;
        	case "5": 
        		manager.findAll();
        		break;
        	case "6": 
        		manager.clearStore();
        		break;
        	case "7": 
        		break menu;
        	}
		}
		ItemView.input.close();
	}
}
