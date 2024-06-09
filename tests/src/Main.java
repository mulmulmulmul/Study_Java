import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	private static ItemBusinessRule rule = new ItemBusinessRule();
	
	public static void main(String[] args) {
		
		outer:
		while(true) {
			ItemView.showMenu();
			int user = ItemView.INPUT.nextInt();
			
			switch(user) {
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
				System.out.println("++프로그램 종료++");
				break outer;
			default:
				System.out.println("1~7에 해당하는 정수를 입력하세요.\n");
				break;
			}
		}
	}

}
