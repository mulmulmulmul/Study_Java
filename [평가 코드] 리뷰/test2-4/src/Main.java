/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */
import item.ItemBusinessRule;
import item.ItemView;
import item.Item;

public class Main {

	private static ItemBusinessRule manage = new ItemBusinessRule();
	public static void main(String[] args) {
		int choice;
		
			while(true) {
				
				ItemView.showMenu();
				choice = ItemView.INPUT.nextInt();
				
				switch (choice) {
				case 1 : 
					manage.save();
					break;
				case 2 : 
					manage.findById(); // public 으로바꾸면오류가안생김 private 는 오류가생김 어떻게고쳐야하지.
					break;
				case 3 :
					manage.update();
					break;
				case 4 :
					manage.delete();
					break;
				case 5 :
					manage.findAll();
					break;
				case 6 :
					manage.clearStore();
					break;
				case 7 : 
					manage.SystemEnd();
					
			
			}
		}
			// 스캐너 메모리해제 해줘야 합니다.
	}
}
